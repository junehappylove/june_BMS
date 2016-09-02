/**
 * 
 */
package com.june.util;

import java.text.MessageFormat;

import org.apache.commons.lang.StringUtils;

import com.june.common.MessagePropertyPlaceholderConfiger;

/**
 * 消息工具类
 * @author june
 *
 */
public class MessageUtil {

	/**
	 * 根据消息id获取配置文件中的消息内容
	 * 
	 * @param msgId
	 * @param messageParam 消息内容中替换的参数
	 * @throws Exception
	 * @return: String
	 */
	public static String formatMessage(String msgId, String[] messageParam) {
		try {
			String message = getMessage(msgId);
			message = StringUtils.isNotBlank(message) ? message : msgId;
			return setMessageByParam(message, messageParam);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 处理一个参数的情况
	 * @param msgId
	 * @param oneParam
	 * @return
	 */
	public static String formatMessage(String msgId, String oneParam){
		if(oneParam!=null){
			return formatMessage(msgId, new String[]{oneParam});
		}else{
			return resourceValue(msgId);
		}
	}
	
	/**
	 * 获取资源文件中的属性
	 * @param key
	 * @return: String
	 */
	public static String resourceValue(String key) {
		return getMessage(key);
	}

	/**
	 * 设定message
	 * 
	 * @param message
	 *            MessagesDTO
	 * @param messageParam
	 *            String[]
	 * @return String
	 * @throws SpaceParameterException
	 */
	private static String setMessageByParam(String message, String[] messageParam) throws Exception {
		MessageFormat messageFormat = new MessageFormat(message);
		return messageFormat.format(messageParam);
	}
	
	// 根据id获取配置文件消息
	private static String getMessage(String msgId) {
		return (String) MessagePropertyPlaceholderConfiger.getContextProperty(msgId);
	}
}