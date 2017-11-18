package com.chen.my.manage.exception;

import java.util.HashMap;

/**
 * 异常编码定义
 *
 * @author chen
 */
public class BusinessExceptionCode {
    
    // ---------------------  系统级别 -------------------
	
	/**
	 * 系统错误
	 */
	public static final String SYSTEM_ERROR = "9999";
	
	/**
	 * 服务调用超时
	 */
	public static final String SYSTEM_SERVICE_TIMEOUT = "9998";
	
	/*************************************  不提示的code ,*********************************************************/
	public static final String NO_PROMPT_ERROR = "9997";



	
	
	/**********业务提示************************************************************************************/
	/**
	 * 企业用户登陆失败，企业号、账号或密码错误
	 */
	public static final String LOGIN_FAIL_CORP_WEB = "1001";
	
	/**
	 * 登陆失败，账号被锁定
	 */
	public static final String LOGIN_FAIL_ACCOUNT_LOCK = "1002";

	/**
	 * 账号未开通
	 */
	public static final String LOGIN_FAIL_ACCOUNT_NOT_OPEN = "1003";
	
	/**
	 * 账号已停用
	 */
	public static final String LOGIN_FAIL_ACCOUNT_DELETE = "1004";

	/**
	 * 验证码错误
	 */
	public static final String VERIFY_CODE_ERROR = "1005";
	
	/**
	 * tmc用户登录失败，tmc账号，员工账号或密码错误
	 */
	public static final String LOGIN_FAIL_TMC_WEB = "1006";
	
	/**
	 * 该人员信息已存在
	 */
	public static final String USER_PASSENGER_REL_EXISTS = "1007";
	/**
	 * 联系人已存在
	 */
	public static final String USER_CONTACT_EXISTS = "1008";

	/**
	 * 部门删除失败，该部门下员工不为空
	 */
	public static final String DEPARTMENT_DELETE_ERROR = "1009";


	/**
	 *成本中心删除失败，该成本中心下员工不为空
	 */
	public static final String COSTCENTER_DELETE_ERROR = "1010";
	
	/**
	 *差旅政策删除失败，该项差旅政策被使用
	 */
	public static final String POLICY_DELETE_ERROR = "1011";

	/**
	 * 没有找到用户差旅政策
	 */
	public static final String USER_POLICY_NOT_FOUND = "1012";
	
	/**
	 * 查询参数错误
	 */
	public static final String SELECT_PARAMS_ERROR = "1013";


	/**
	 * 订单重复情况
	 */
	public static final String ORDER_REPEAT = "1014";
	
	/**
	 * 机票票价有变动，请重新确认订单
	 */
	public static final String TICKET_PRICE_NOT_EQUAL = "1015";

	/**
	 * 保险价格不一致
	 */
	public static final String INSURANCE_PRICE_NOT_EQUAL = "1016";

	/**
	 * 创建PNR失败，机票已售完
	 */
	public static final String FLIGHT_TICKET_NOT_PNR = "1017";
	
	/**
	 * 代理人配置缺失
	 */
	public static final String TMC_OFFICEID_NOT_CONFIG = "1018";

	/**
	 * 退票或改签只能操作一次
	 */
	public static final String CHANGE_ONLY_ONE = "1021";

	/**
	 * 退票改签校验
	 */
	public static final String TICKET_IS_NOT_ISSUED = "1022";

	/**
	 * 查看订单列表为空
	 */
	public static final String ORDER_LIST_IS_EMPTY = "1023";

	/**
	 * 修改密码失败
	 */
	public static final String MODIFY_PASSWORD_ERROR = "1024";
	/**
	 * 修改密码时，原密码不正确
	 */
	public static final String MODIFY_PASSWORD_CHECK_FAIL = "1025";
	
	/**
	 * 手机号未注册
	 */
	public static final String PHONE_NOT_REGIST = "1026";

	/**
	 * 改签费有变动
	 */
	public static final String CHANGE_FEE_IS_ERROR = "1027";
	
	/**
	 * 查看订单详情失败
	 */
	public static final String ORDER_INFO_IS_ERROR = "1028";
	
	/**
	 * 重置密码失败
	 */
	public static final String RETRIEVE_PASSWORD_ERROR = "1029";
	
	/**
	 * 企业支付额度超出范围，请联系代理人
	 */
	public static final String CORP_PAY_LIMIT_OVER = "1030";
	
	/**
	 * 机票价格异常
	 */
	public static final String TICKET_PRICE_ERROR = "1031";

	/**
	 * 管理员账号不能删除
	 */
	public static final String REFUSE_DELETE_TMC_USER = "1032";

	/**
	 * 该人员为您公司的员工，请在员工信息中查询
	 */
	public static final String USER_PASSENGER_EMP_EXISTS = "1033";

	/**
	 * 公司名称已存在
	 */
	public static final String CORP_NAME_IS_EXIST = "1034";

	/**
	 * 公司编码已存在
	 */
	public static final String CORP_CODE_IS_EXIST = "1035";

	/**
	 * 只能取消待支付状态的订单
	 */
	public static final String FLIGHT_ORDER_CANNOT_CANCEL = "1036";

	/**
	 * 企业大客户编码已存在
	 */
	public static final String VIP_CODE_IS_EXIST = "1037";

	/**
	 * 员工手机号已存在
	 */
	public static final String USER_PHONE_IS_EXIST = "1038";

	/**
	 * 部门名称已存在
	 */
	public static final String CORP_DEPARTMENT_IS_EXIST = "1039";
	
	/**
	 * 成本中心已存在
	 */
	public static final String CORP_COST_CENTER_IS_EXIST = "1040";
	
	/**
	 * 差旅政策已存在
	 */
	public static final String CORP_POLICY_IS_EXIST = "1041";
	
	/**
	 * 成本中心只剩一个时不能删除
	 */
	public static final String COSTCENTER_IS_ONLY_ONE = "1042";

	/**
	 * 大客户编码被占用
	 */
	public static final String CORP_VIP_IS_OCCUPY = "1043";

	/**
	 * 管理员账号已存在
	 */
	public static final String CORP_ADMIN_IS_EXIST = "1044";

	/**
	 * 企业服务费已存在
	 */
	public static final String CORP_SERVICE_FEE_IS_EXISTS = "1045";

	/**
	 * 机票票号错误
	 */
	public static final String TICKET_NUMBER_IS_ERROR = "1046";

	/**
	 * 部门删除失败，包含下级部门
	 */
	public static final String DEPARTMENT_EXIST_CHILD = "1047";
	
	/**
	 * 部门只剩一个，不能删除
	 */
	public static final String DEPARTMENT_IS_ONLY_ONE = "1048";

	/**
	 * 差旅政策剩一个时不能删除
	 */
	public static final String POLICY_IS_ONLY_ONE = "1049";

	/**
	 * 大客户编码下有折扣信息时不能删除
	 */
	public static final String VIP_DISCOUNT_IS_NOT_EMPTY = "1050";

	/**
	 * 大客户折扣信息已存在
	 */
	public static final String VIP_DISCOUNT_IS_EXIST = "1051";
	
	/**
	 * 连接超时
	 */
	public static final String TIMEOUT_WAITING_FOR_CONNECTION = "1052";

	/**
	 * 该账号不是管理员
	 */
	public static final String ACCOUNT_IS_NOT_MANAGER = "1053";
	
	/**
	 * 登陆失败，账号或密码错误
	 */
	public static final String LOGIN_FAIL_EMP_WEB = "1054";

	/**
	 * 机票特价不存在
	 */
	public static final String FLIGHT_TICKET_NOT_NET_PRICE = "1055";
	
	/**
	 * 创建pnr失败
	 */
	public static final String CREATE_PNR_ERROR = "1056";
	
	/**
	 * 未找到日期内的机票信息
	 */
	public static final String OPEN_TICKET_NOT_FOUND = "1057";
	
	/**
	 * 创建订单失败
	 */
	public static final String CREATE_ORDER_FAIL = "1058";
	
	/**
	 * 机票查询失败
	 */
	public static final String FLIGHT_TICKET_SEARCH_FAIL = "1059";

	/**
	 * 航空乘机人姓名校验失败
	 */
	public static final String FLIGHT_PASSENGER_NAME_CHECK_FAIL = "1060";
	
	/**
	 * 获取经纬度失败
	 */
	public static final String ADDRESS_TO_LATANDLNG_ERROR = "1061";
	
	/**
	 * tmc资金账户不存在
	 */
	public static final String TMC_CATIAL_ACCOUNT_NO_EXIST = "1062";
	
	/**
	 * tmc账户余额不足
	 */
	public static final String TMC_MONEY_BALANCE_LESS = "1063";
	
	/**
	 * 订单不存在
	 */
	public static final String ORDER_NOT_EXIST = "1064";
	
	/**
	 * 订单状态不正确
	 */
	public static final String ORDER_STATUS_ERROR = "1065";
	
	/**
	 * 出票重复点击
	 */
	public static final String TICKET_REPEAT = "1066";
	
	/**
	 * 读取pnr失败
	 */
	public static final String READ_PNR_ERROR = "1067";
	
	/**
	 * 封口失败
	 */
	public static final String ORDER_PAT_ERROR = "1068";
	
	/**
	 * pnr校验失败
	 */
	public static final String PNR_CHECK_ERROR = "1069";
	
	/**
	 * 查询乘机人失败
	 */
	public static final String SEARCH_PASSENGE_ERROR = "1070";
	
	/**
	 * 更新外采订单失败
	 */
	public static final String UPDATE_CHANNEL_ORDER_ERROR = "1071";
	
	/**
	 * 取消外采订单失败
	 */
	public static final String ORDER_CANCEL_ERROR = "1072";

	/**
	 * 航班缓存添加失败
	 */
	public static final String FLIGHT_CACHE_ADD_ERROR = "1073";

	//查询订单保险信息失败
	public static final String SEARCH_ORDER_INSURANCE_ERROR = "1074";

	//校验订单保险信息失败
	public static final String CHECK_ORDER_INSURANCE_STATUS_FAIL = "1075";
	//校验订单保险金额失败
	public static final String CHECK_ORDER_INSURANCE_MONEY_FAIL = "1076";
	//查询服务费失败
	public static final String SEARCH_ORDER_SERVICE_FEE_ERROR = "1077";
	//校验服务费退费金额失败
	public static final String CHECK_ORDER_SERVICE_FEE_MONEY_ERROR = "1078";
	//校验服务费是否可退失败
	public static final String CHECK_ORDER_SERVICE_FEE_STATIS_ERROR = "1079";
	// 包机产品导入失败
	public static final String IMPORT_CHARTER_ORDER_ERRPOR = "1080";
	//删除包机对账结算失败
	public static final String DELETE_CHARTER_ORDER_FAIL = "1081";
	//查询包机对账结算失败
	public static final String SEARCH_CHARTER_ORDER_FAIL = "1082";

	/*************************火车票***************************************************************************/
	
	/**
	 * 19e返回错误码
	 */
	public static final String TRAIN_19E_ERROR = "2001";
	
	/**
	 * 火车票剩余数量不足
	 */
	public static final String TRAIN_TICKET_ERROR = "2002";
	
	/**
	 * 火车票订单状态不允许取消
	 */
	public static final String TRAIN_ORDER_CANCEL_ERROR = "2003";
	
	/**
	 * 火车票订单状态不允许退票
	 */
	public static final String TRAIN_TICKET_REFUND_ERROR = "2004";
	
	/**
	 * 登陆cookie失效
	 */
	public static final String LOGIN_COOKIE_INVALID = "2005";
	
	public static final String TRAIN_WORK_TIME_ERROR = "2006";

	/**
	 * 测试模式不能下订单
	 */
	public static final String TRAIN_19E_TEST = "2007";
	public static final String TRAIN_KONGTIE51_TEST = "2012";

	/**
	 * 火车票订单状态不允许改签
	 */
	public static final String TRAIN_TICKET_CHANGE_ERROR = "2008";
	
	public static final String TRAIN_TICKET_CREATE_ERROR = "2009";
	
	public static final String TRAIN_FUNCTION_SWITCH = "2010";
	
	/**
	 * 火车功能未开通
	 */
	public static final String TRAIN_NOT_OPEN = "2011";

	public final static String KONGTIE51_REFUND_FAIL  = "2013";
	

	/*************************酒店***************************************************************************/
	
	/**
	 * 酒店配置缺失
	 */
	public static final String HOTEL_CONFIG_ERROR = "3001";
	
	/**
	 * 酒店验价
	 */
	public static final String HOTEL_CHECK_PRICE = "3002";
	
	/**
	 * 酒店房间库存不足
	 */
	public static final String HOTEL_INVENTORY_ERROR = "3003";
	
	/**
	 * 酒店价格变动
	 */
	public static final String HOTEL_PRICE_ERROR = "3004";
	
	/**
	 * 酒店创建失败
	 */
	public static final String HOTEL_CREATE_ERROR = "3005";
	
	/**
	 * 酒店取消失败
	 */
	public static final String HOTEL_REFUND_ERROR = "3006";
	
	public static final String HOTEL_GUARANTEE_ERROR = "3007";

	/**********出票异常信息******************************************/

	/**
	 * 出票失败
	 */
	public static final String TICKET_ETDZ_ERROR = "4001";

	/**
	 * 机票价格变动，但是用户已支付，需要人工处理，多退少补
	 */
	public static final String TICKET_ETDZ_ERROR_PRICE_CHANGE = "4002";

	/**
	 * 出票时做RR失败
	 */
	public static final String TICKET_RR_ERROR = "4003";

	/**
	 * 运价失败
	 */
	public static final String TICKET_PAT_ERROR = "4004";

	/**
	 * PNR错误
	 */
	public static final String PNR_RT_ERROR = "4005";


	/**-------------------------------------------------------阿里云 ons服务相关异常代码 -------------------------------------------------------*/
	public static final String ALIYUN_MQ_CONSUMER_ERROR = "5001";//消费消息异常
	public static final String ALIYUN_MQ_PRODUCER_ERROR = "5002";//发送消息异常


	/**--------------------------------------------------其他相关-------------------------------------------------------------------*/
	public static final String INIT_CHANNEL_CACHE_ERROR = "6001";//初始化外部渠道信息失败
	public static final String INIT_CHANNEL_ACCOUNT_CACHE_ERROR = "6001";//初始化外部渠道账号信息失败

	/*********调用参数错误****************************************************************************/

	/**
	 * 请求参数错误
	 */
	public static final String REQUEST_PARAM_ERROR = "7000";

	/**
	 * 优惠活动已结束
	 */
	public static final String EVENT_REDUCE_NOT_OPEN = "7001";
	/**
	 * 优惠价格变动
	 */
	public static final String EVENT_REDUCE_VALUE_NOT_EQUALS = "7002";

	/**
	 * 合作商不存在
	 */
	public static final String PARTNER_NOT_FOUND = "7003";

	/**
	 * 合作商未开通
	 */
	public static final String PARTNER_NOT_OPEN = "7004";

	/**
	 * 提交易图8订单失败
	 */
	public static final String SUBMIT_YITU8_ORDER_FAIL = "7005";


	/*********权限错误****************************************************************************/
	/**
	 * 鉴权失败
	 */
	public static final String AUTH_VALIDATE_ERROR = "8000";

	/**
	 * 验签失败，非法请求
	 */
	public static final String AUTH_VALIDATE_SIGN_ERROR = "8001";

	/**
	 * token校验异常
	 */
	public static final String TOKEN_VERIFY_EXCEPTION = "8003";

	/**
	 * token失效
	 */
	public static final String TOKEN_VERIFY_OVERDAY = "8004";

	/**
	 * 没有权限
	 */
	public static final String AUTH_NO_RIGHT = "8005";

	public static final String SESSION_REFRESH_ERROR = "8006";


	/**------------------------------------------------------- 国际票-------------------------------------------------------*/
	public static final String INTL_FLIGHT_EXPIRE = "9001";//搜索结果已过期
	public static final String SEARCH_INTL_TICKET_PRICE_FAIL = "9002";//票价获取失败

	/**空铁无忧*/
	public final static String KONGTIE51_QUERY_ERROR  = "9010";
	public final static String KONGTIE51_TICKET_ERROR  = "9011";
    private static HashMap<String, String> EXCEPTION_MESSAGE;

    static {

        EXCEPTION_MESSAGE = new HashMap<String, String>();
		EXCEPTION_MESSAGE.put(SEARCH_CHARTER_ORDER_FAIL, "查询包机对账结算失败！");
		EXCEPTION_MESSAGE.put(DELETE_CHARTER_ORDER_FAIL, "删除包机对账结算失败！");
		EXCEPTION_MESSAGE.put(IMPORT_CHARTER_ORDER_ERRPOR, "包机产品报表数据导入失败！");
		EXCEPTION_MESSAGE.put(SEARCH_INTL_TICKET_PRICE_FAIL, "国际票获取票价失败！");
		EXCEPTION_MESSAGE.put(INTL_FLIGHT_EXPIRE, "国际票查询已过期！");
		EXCEPTION_MESSAGE.put(SEARCH_ORDER_SERVICE_FEE_ERROR, "查询订单服务费失败！");
		EXCEPTION_MESSAGE.put(CHECK_ORDER_SERVICE_FEE_MONEY_ERROR, "订单服务费退费金额不能高于收取的服务费！");
		EXCEPTION_MESSAGE.put(CHECK_ORDER_SERVICE_FEE_STATIS_ERROR, "订单服务费已退，不可重复退费！");

		EXCEPTION_MESSAGE.put(CHECK_ORDER_INSURANCE_MONEY_FAIL, "订单保险退费金额不能高于保险原价！");
		EXCEPTION_MESSAGE.put(CHECK_ORDER_INSURANCE_STATUS_FAIL, "校验订单保险状态是否可退失败！");
		EXCEPTION_MESSAGE.put(SEARCH_ORDER_INSURANCE_ERROR, "查询订单保险信息失败！");
		EXCEPTION_MESSAGE.put(INIT_CHANNEL_ACCOUNT_CACHE_ERROR, "初始化外部渠道账号信息失败！");
		EXCEPTION_MESSAGE.put(INIT_CHANNEL_CACHE_ERROR, "初始化外部渠道信息失败！");
		EXCEPTION_MESSAGE.put(ALIYUN_MQ_PRODUCER_ERROR, "发送消息失败！");
		EXCEPTION_MESSAGE.put(ALIYUN_MQ_CONSUMER_ERROR, "消费消息失败！");
        EXCEPTION_MESSAGE.put(SYSTEM_ERROR,"网络繁忙，请稍后再试");
        EXCEPTION_MESSAGE.put(SYSTEM_SERVICE_TIMEOUT, "服务调用超时");
        
        EXCEPTION_MESSAGE.put(AUTH_VALIDATE_ERROR,"鉴权失败");
        EXCEPTION_MESSAGE.put(AUTH_VALIDATE_SIGN_ERROR,"非法请求");
        
        EXCEPTION_MESSAGE.put(TOKEN_VERIFY_OVERDAY,"登陆信息过期，请重新登陆");
        EXCEPTION_MESSAGE.put(TOKEN_VERIFY_EXCEPTION,"登陆信息校验失败，请重新登陆");
        
        EXCEPTION_MESSAGE.put(AUTH_NO_RIGHT,"没有权限");
        
        EXCEPTION_MESSAGE.put(REQUEST_PARAM_ERROR, "请求参数错误");
        
        EXCEPTION_MESSAGE.put(LOGIN_FAIL_CORP_WEB, "企业号、账号或密码错误");
        EXCEPTION_MESSAGE.put(LOGIN_FAIL_ACCOUNT_LOCK, "登陆失败，账号被锁定,请联系代理人解锁");
        EXCEPTION_MESSAGE.put(LOGIN_FAIL_ACCOUNT_NOT_OPEN, "账号未开通");
        EXCEPTION_MESSAGE.put(LOGIN_FAIL_ACCOUNT_DELETE, "账号已停用");
        EXCEPTION_MESSAGE.put(VERIFY_CODE_ERROR, "验证码错误");
        
        
        EXCEPTION_MESSAGE.put(USER_PASSENGER_REL_EXISTS, "该人员信息已存在");
        EXCEPTION_MESSAGE.put(USER_CONTACT_EXISTS, "联系人已存在");
        
        EXCEPTION_MESSAGE.put(FLIGHT_CACHE_ADD_ERROR, "航班缓存添加失败，航班信息：%t");
        
        EXCEPTION_MESSAGE.put(LOGIN_FAIL_TMC_WEB, "TMC账号、账号或密码错误");
        EXCEPTION_MESSAGE.put(DEPARTMENT_DELETE_ERROR, "部门删除失败，该部门下员工不为空");
        EXCEPTION_MESSAGE.put(COSTCENTER_DELETE_ERROR, "成本中心删除失败，该成本中心下员工不为空");
        EXCEPTION_MESSAGE.put(POLICY_DELETE_ERROR , "差旅政策删除失败，该项差旅政策被使用");
        
        EXCEPTION_MESSAGE.put(USER_POLICY_NOT_FOUND, "没有找到用户差旅政策");
        
        EXCEPTION_MESSAGE.put(SELECT_PARAMS_ERROR , "查询参数错误");
        EXCEPTION_MESSAGE.put(ORDER_REPEAT , "订单已存在");
        
        EXCEPTION_MESSAGE.put(TICKET_PRICE_NOT_EQUAL , "机票票价有变动，请重新确认订单");
        EXCEPTION_MESSAGE.put(INSURANCE_PRICE_NOT_EQUAL , "保险价格有变动，请重新确认订单");
        
        EXCEPTION_MESSAGE.put(FLIGHT_TICKET_NOT_PNR , "该舱位无剩余机票，请重新选择"); 
        EXCEPTION_MESSAGE.put(TMC_OFFICEID_NOT_CONFIG , "代理人配置缺失"); 
        
        EXCEPTION_MESSAGE.put(TICKET_ETDZ_ERROR , "出票失败"); 
        EXCEPTION_MESSAGE.put(TICKET_RR_ERROR , "出票时做RR失败"); 
        EXCEPTION_MESSAGE.put(TICKET_ETDZ_ERROR_PRICE_CHANGE , "机票价格变动，但是用户已支付，需要人工处理，多退少补"); 
        EXCEPTION_MESSAGE.put(CHANGE_ONLY_ONE , "改机票已退票或已改签");
        
        EXCEPTION_MESSAGE.put(TICKET_IS_NOT_ISSUED , "该机票未出票或已经退改签，不能进行改签或退票");
        EXCEPTION_MESSAGE.put(ORDER_LIST_IS_EMPTY , "获取订单列表数据为空");
        
        EXCEPTION_MESSAGE.put(MODIFY_PASSWORD_ERROR , "修改密码失败");
        EXCEPTION_MESSAGE.put(MODIFY_PASSWORD_CHECK_FAIL , "原密码不正确");
        
        EXCEPTION_MESSAGE.put(PHONE_NOT_REGIST , "手机号未注册");
        EXCEPTION_MESSAGE.put(CHANGE_FEE_IS_ERROR , "改签费有变动，请重新提交改签申请");
        EXCEPTION_MESSAGE.put(ORDER_INFO_IS_ERROR , "查看订单详情失败");
        EXCEPTION_MESSAGE.put(RETRIEVE_PASSWORD_ERROR , "重置密码失败,公司编码或手机号输入错误");
        
        EXCEPTION_MESSAGE.put(CORP_PAY_LIMIT_OVER , "企业支付额度超出范围，请联系代理人");
        
        EXCEPTION_MESSAGE.put(TICKET_PRICE_ERROR , "机票价格异常，请联系代理人");
        EXCEPTION_MESSAGE.put(REFUSE_DELETE_TMC_USER , "员工账号为管理员，默认不能删除");
        
        EXCEPTION_MESSAGE.put(CORP_NAME_IS_EXIST, "公司名称被占用，请重新输入");
        EXCEPTION_MESSAGE.put(CORP_CODE_IS_EXIST, "公司编码被占用，请重新输入");
        
        EXCEPTION_MESSAGE.put(FLIGHT_ORDER_CANNOT_CANCEL, "只能取消待支付状态的订单"); 

        EXCEPTION_MESSAGE.put(VIP_CODE_IS_EXIST, "大客户编码已存在");
        EXCEPTION_MESSAGE.put(CORP_VIP_IS_OCCUPY, "该大客户编码被占用，请重新输入"); 
        EXCEPTION_MESSAGE.put(USER_PHONE_IS_EXIST, "该手机号已存在，请重新输入"); 
        EXCEPTION_MESSAGE.put(CORP_DEPARTMENT_IS_EXIST, "该部门已存在，请重新输入"); 
        EXCEPTION_MESSAGE.put(CORP_COST_CENTER_IS_EXIST, "该成本中心已存在，请重新输入"); 
        EXCEPTION_MESSAGE.put(CORP_POLICY_IS_EXIST, "该差旅政策已存在，请重新输入"); 
        EXCEPTION_MESSAGE.put(CORP_ADMIN_IS_EXIST, "管理员账号已存在，请重新输入");
        EXCEPTION_MESSAGE.put(USER_PASSENGER_EMP_EXISTS, "该人员信息已存在");
        EXCEPTION_MESSAGE.put(COSTCENTER_IS_ONLY_ONE, "成本中心删除失败，该企业下属成本中心仅剩一个"); 
        EXCEPTION_MESSAGE.put(TICKET_NUMBER_IS_ERROR, "改签机票票号不正确，请重新输入"); 
        EXCEPTION_MESSAGE.put(DEPARTMENT_EXIST_CHILD, "部门删除失败，该部门包含下级部门"); 

        EXCEPTION_MESSAGE.put(DEPARTMENT_IS_ONLY_ONE, "部门删除失败，该公司部门只剩一个"); 
        EXCEPTION_MESSAGE.put(POLICY_IS_ONLY_ONE, "差旅政策删除失败，该公司差旅政策只剩一个");
        EXCEPTION_MESSAGE.put(VIP_DISCOUNT_IS_NOT_EMPTY, "大客户协议删除失败，该大客户协议下存在折扣信息");
        EXCEPTION_MESSAGE.put(VIP_DISCOUNT_IS_EXIST, "大客户折扣信息已存在");
        EXCEPTION_MESSAGE.put(TIMEOUT_WAITING_FOR_CONNECTION, "连接超时，请稍后重试");
        EXCEPTION_MESSAGE.put(ACCOUNT_IS_NOT_MANAGER, "您不是管理员，不能重置员工密码");
        EXCEPTION_MESSAGE.put(LOGIN_FAIL_EMP_WEB, "登陆失败，账号或密码错误");
        
        EXCEPTION_MESSAGE.put(FLIGHT_TICKET_NOT_NET_PRICE, "机票特价不存在");
        EXCEPTION_MESSAGE.put(CREATE_PNR_ERROR, "非常抱歉，创建pnr失败，该舱位已无余票，请重新查询!");
        EXCEPTION_MESSAGE.put(OPEN_TICKET_NOT_FOUND, "未找到该日期范围内的机票信息");
        EXCEPTION_MESSAGE.put(CREATE_ORDER_FAIL, "抱歉，创建订单失败，请稍后重试");
        EXCEPTION_MESSAGE.put(FLIGHT_TICKET_SEARCH_FAIL, "机票信息查询失败，请稍后重试");
        
        EXCEPTION_MESSAGE.put(FLIGHT_PASSENGER_NAME_CHECK_FAIL, "乘机人姓名输入有误，请按乘机姓名规则输入");
        
        EXCEPTION_MESSAGE.put(ORDER_NOT_EXIST, "订单不存在");
        EXCEPTION_MESSAGE.put(ORDER_STATUS_ERROR, "订单状态不正确");
        
        
        EXCEPTION_MESSAGE.put(PARTNER_NOT_FOUND, "合作商不存在");
        EXCEPTION_MESSAGE.put(PARTNER_NOT_OPEN, "合作商未开通");
        EXCEPTION_MESSAGE.put(ADDRESS_TO_LATANDLNG_ERROR,"地址转换经纬度失败，请稍后重试");
        
        EXCEPTION_MESSAGE.put(TICKET_PAT_ERROR,"出票时运价失败");

        EXCEPTION_MESSAGE.put(TMC_CATIAL_ACCOUNT_NO_EXIST, "tmc资金账户不存在");
        EXCEPTION_MESSAGE.put(CORP_SERVICE_FEE_IS_EXISTS,"企业服务费已存在");
        EXCEPTION_MESSAGE.put(SUBMIT_YITU8_ORDER_FAIL,"易图8订单失败");
        EXCEPTION_MESSAGE.put(TMC_MONEY_BALANCE_LESS, "账户余额不足");
        
        
    	EXCEPTION_MESSAGE.put(EVENT_REDUCE_NOT_OPEN, "活动已结束，请重新查询并预订！");
    	EXCEPTION_MESSAGE.put(EVENT_REDUCE_VALUE_NOT_EQUALS, "优惠价格有变动，请重新查询并预订！");
    	
    	EXCEPTION_MESSAGE.put(TRAIN_19E_ERROR, "19e接口返回出错");
    	EXCEPTION_MESSAGE.put(TRAIN_TICKET_ERROR, "火车票剩余数量不足");
    	EXCEPTION_MESSAGE.put(TRAIN_ORDER_CANCEL_ERROR, "火车票订单状态不允许取消");
    	EXCEPTION_MESSAGE.put(TRAIN_TICKET_REFUND_ERROR, "火车票订单状态不允许退票");
    	EXCEPTION_MESSAGE.put(LOGIN_COOKIE_INVALID, "12306 cookie已过期");
    	EXCEPTION_MESSAGE.put(TRAIN_WORK_TIME_ERROR, "超过火车票每日订票时间");
    	EXCEPTION_MESSAGE.put(TRAIN_TICKET_CHANGE_ERROR, "火车票订单状态不允许改签");
    	
    	EXCEPTION_MESSAGE.put(TRAIN_19E_TEST, "测试模式火车票不能下订单");
    	
    	EXCEPTION_MESSAGE.put(TRAIN_TICKET_CREATE_ERROR, "火车票订单创建失败");
    	EXCEPTION_MESSAGE.put(TRAIN_FUNCTION_SWITCH, "火车相关功能升级中，请稍候");
    	
    	EXCEPTION_MESSAGE.put(TRAIN_NOT_OPEN, "火车功能未开通");
    	
    	EXCEPTION_MESSAGE.put(PNR_RT_ERROR, "无法读取PNR信息，请检查PNR编码");
    	
    	EXCEPTION_MESSAGE.put(HOTEL_CONFIG_ERROR, "酒店配置缺失");
    	EXCEPTION_MESSAGE.put(HOTEL_CHECK_PRICE, "酒店验价失败");
    	EXCEPTION_MESSAGE.put(HOTEL_INVENTORY_ERROR, "酒店房间库存不足");
    	EXCEPTION_MESSAGE.put(HOTEL_PRICE_ERROR, "酒店价格变动请重新查价");
    	EXCEPTION_MESSAGE.put(HOTEL_CREATE_ERROR, "酒店订单创建失败");
    	EXCEPTION_MESSAGE.put(HOTEL_REFUND_ERROR, "酒店订单取消失败");
    	EXCEPTION_MESSAGE.put(HOTEL_GUARANTEE_ERROR, "酒店订单需要担保");
    	EXCEPTION_MESSAGE.put(ORDER_PAT_ERROR, "机票订单运价封口失败");
    	EXCEPTION_MESSAGE.put(PNR_CHECK_ERROR, "pnr信息校验失败");
    	
    }

    public static String getMessage(String code) {
        return EXCEPTION_MESSAGE.get(code);
    }
}
