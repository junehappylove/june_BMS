/**
 * 
 */
package com.june.common;

import com.june.util.MessageUtil;

/**
 * 常量消息
 * @author june
 *
 */
public class Constants {
	/** 支持POST方法提交！ */
	public static final String ERROR_METHOD_POST = MessageUtil.resourceValue("error_method_post");
	/** 用户名或密码不能为空！ */
	public static final String ERROR_NOT_NULL_UP = MessageUtil.resourceValue("error_user_or_pass_not_null");
	/** 用户已经被锁定不能登录，请与管理员联系！ */
	public static final String ERROR_USRE_LOCKED = MessageUtil.resourceValue("error_user_locked");
	/** 用户或密码不正确！ */
	public static final String ERROR_USER_P_WORONG = MessageUtil.resourceValue("error_user_or_pass_wrong");
	/** 登录异常，请联系管理员！ */
	public static final String ERROR_LOGIN_EXCEPTION = MessageUtil.resourceValue("error_login_exception");
}
