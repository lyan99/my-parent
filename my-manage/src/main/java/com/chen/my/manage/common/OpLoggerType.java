package com.chen.my.manage.common;

public class OpLoggerType
{
    /**
     * 新增
     */
    public static final byte OPTYPE_ADD = 1;
    /**
     * 修改
     */
    public static final byte OPTYPE_EDIT = 2;
    /**
     * 删除
     */
    public static final byte OPTYPE_DELETE = 3;
    /**
     * 启用
     */
    public static final byte OPTYPE_ENABLE = 4;
    /**
     * 停用
     */
    public static final byte OPTYPE_DISABLED = 5;
    /**
     * 处理
     */
    public static final byte OPTYPE_DEAL = 6;
    /**
     * 修改状态
     */
    public static final byte OPTYPE_STATUS = 7;
    /**
     * 开通
     */
    public static final byte OPTYPE_OPEN = 8;
    /**
     * 结算
     */
    public static final byte OPTYPE_SETTLEMENT = 9;
    /**
     * 改签
     */
    public static final byte OPTYPE_CHANGE = 10;
    /**
     * 退款
     */
    public static final byte OPTYPE_REFUND = 11;
    /**
     * 取消
     */
    public static final byte OPTYPE_CANCEL = 12;
    
    /**
     * 改签处理
     */
    public static final byte OPTYPE_CHANGE_DEAL = 13;
    
    /**
     * 退款处理
     */
    public static final byte OPTYPE_REFUND_DEAL = 14;
    /**
     * 取消退款/改签
     */
    public static final byte OPTYPE_CHANGE_REFUND_CANCEL = 15;
    /**
     * 外采回录
     */
    public static final byte OPTYPE_CHANNEL_PURCHASE_HANDLE = 16;
    
    /**
     * 上传
     */
    public static final byte OPTYPE_UPLOAD = 17;
    
    public static final String MODEL_NAME_CORP = "企业信息";

	
	
	
	
    
}
