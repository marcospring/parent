package com.csyy.core.result;

/**
 * 系统结果信息实体，该实体封装系统运行消息，为系统信息xml配置文件对应对象
 * @ClassName:  ResultInfo   
 * @Description:TODO 
 * @author: zhangk  
 * @date:   2015年11月6日 下午2:44:40   
 *
 */
public class ResultInfo {
	/**
	 * 结果信息键值，通过键值从结果信息容器中提取结果信息
	 */
	private String key;
	/**
	 * 结果信息码
	 */
	private int code;
	/**
	 * 结果信息内容
	 */
	private String message;

	public ResultInfo() {
		// TODO Auto-generated constructor stub
	}

	public ResultInfo(String key, int code, String message) {
		this.key = key;
		this.code = code;
		this.message = message;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
