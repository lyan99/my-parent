package com.chen.my.manage.aspectj;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 操作日志拦截
 * 
 *
 * @author chenlei
 * @since 
 */
@Aspect
@Component
public class OperatorLogRecorder implements Ordered
{

    Logger log = LoggerFactory.getLogger(OperatorLogRecorder.class);


    @Pointcut("@annotation(com.chen.my.manage.annotation.OpLogger)")
    public void methodPointcut()
    {

    }

    /**
     * 若执行业务方法成功后，拦截并写入日志
     * 
     * @throws Throwable
     */
    @AfterReturning("methodPointcut()")
    public void afterReturning(JoinPoint jp) throws Throwable
    {
        saveOperationLog(jp, null);
    }

    /**
     * 若执行的业务方法出现异常，拦截并写入日志
     * 
     * @param jp
     * @param e
     */
    @AfterThrowing(value = "methodPointcut()", throwing = "e")
    public void afterThrowing(JoinPoint jp, Exception e)
    {
        saveOperationLog(jp, e);
    }

    /**
     * 保存日志
     * 
     * @param jp
     * @param e
     */
    private void saveOperationLog(JoinPoint jp, Exception e)
    {
        try
        {
            // 拦截的实体类
            Object target = jp.getTarget();
            // 拦截的方法名称
            String methodName = jp.getSignature().getName();
            // 拦截的放参数类型
            Class[] parameterTypes = ((MethodSignature) jp.getSignature()).getMethod().getParameterTypes();
            Method method = target.getClass().getMethod(methodName, parameterTypes);

//            OperateLogModel opLog = new OperateLogModel();
//
//            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
//                    .getRequest();
//            AuthUserInfo user = (AuthUserInfo) request.getSession().getAttribute("AuthUserInfo");
//
//            opLog.setLogSource((byte)1);
//            opLog.setTmcId(user.getTmcId());
//            opLog.setTmcName(user.getTmcName());
//            opLog.setOpUserId(user.getUserId());
//            opLog.setOpUserName(user.getUserName());
//
//            // 获取自定义注解实体
//            OpLogger logAnnotation = method.getAnnotation(OpLogger.class);
//            opLog.setModuleName(logAnnotation.moduleName());
//            opLog.setOpType(logAnnotation.opType());
//            opLog.setOpTime(new Date());
//
//            // 需要转换成Json的HashMap
//            Map<String, Object> maps = new HashMap<String, Object>();
//            Map<String, Object> parammaps = new HashMap<String, Object>();
//            maps.put("服务名", target.getClass().getName());
//            maps.put("方法名", method.getName());
//
//            // 拦截的方法参数
//            Object[] args = jp.getArgs();
//            // 循环获得所有参数对象
//            for (int i = 0; i < args.length; i++)
//            {
//                parammaps.put("args[" + i + "]", args[i]);
//            }
//            maps.put("参数", parammaps);
//
//            // 记录时间
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            maps.put("操作时间", sdf.format(new Date()));
//
//            if (e != null)
//            {
//                opLog.setOpResult((byte)2);
//                opLog.setOpException(e.getMessage());
//                maps.put("状态", "操作失败");
//            }
//            else
//            {
//                opLog.setOpResult((byte)1);
//                maps.put("状态", "操作成功");
//            }
//
//            opLog.setOpContent(JSON.toJSONString(maps, true));
//
//            //调用保存日志服务
//            okHttpService.post(SysPath.LOG_OPLOG, opLog);
        }
        catch(Exception ex)
        {
            log.error("记录操作日志失败");
        }

    }

    @Override
    public int getOrder()
    {
        // TODO Auto-generated method stub
        return 1;
    }

}
