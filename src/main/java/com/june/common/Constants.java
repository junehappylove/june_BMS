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
	/** 默认页面显示数据量 10 */
	public static final String DEFAULT_PAGE_SIZE = "10";
	////////////////////////////////////////////////////
	// sql语句相关 start
	////////////////////////////////////////////////////
	/** sql排序语句 基于字段排序 */
	public static final String ORDER_BY = " order by {0} {1}";
	/** sql排序语句 基于字段排序 */
	public static final String ORDER_BY_ASC = " order by {0} asc";
	/** 默认根据id的正序排序 order by id asc */
	public static final String ORDER_BY_ID_ASC = " order by id asc";
	/** where语句 where {0} not in （{1}） */
	public static final String WHERE_NOT_IN = " where {0} not in （{1}）";
	////////////////////////////////////////////////////
	// sql语句相关 end
	////////////////////////////////////////////////////
	////////////////////////////////////////////////////
	// 参数标识相关 start
	////////////////////////////////////////////////////
	public static final String PARAM_ORDER_BY = "orderby";
	public static final String PARAM_PAGING = "paging";
	public static final String PARAM_WHERE = "where";
	public static final String PARAM_ID = "id";
	public static final String PARAM_IDS = "ids";
	public static final String PARAM_COLUMN = "column";
	public static final String PARAM_SORT = "sort";
	public static final String PARAM_FLAG = "flag";
	public static final String PARAM_TYPE = "type";
	////////////////////////////////////////////////////
	// 参数标识相关 end
	////////////////////////////////////////////////////
	public static final String FLAG_COMMA = ",";
	public static final String FLAG_POINT = ".";
	public static final String FLAG_SUCCESS = "success";
	////////////////////////////////////////////////////
	// 错误提示 start
	////////////////////////////////////////////////////
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

	////////////////////////////////////////////////////
	// 错误提示 end
	////////////////////////////////////////////////////
}
