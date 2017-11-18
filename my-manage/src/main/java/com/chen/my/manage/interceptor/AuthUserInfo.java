package com.chen.my.manage.interceptor;

import java.io.Serializable;

/**
 * 用户登陆信息对象
 *
 * @author hejiang
 */
public class AuthUserInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7262338422522914335L;

	private Long userId;

	private String userName;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
