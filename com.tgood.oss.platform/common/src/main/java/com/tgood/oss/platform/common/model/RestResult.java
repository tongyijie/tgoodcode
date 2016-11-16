package com.tgood.oss.platform.common.model;

/**
 * rest接口返回数据结构
 * @author Administrator
 *
 */
public class RestResult {
	private int code;
	private Object data;
	private String description;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
