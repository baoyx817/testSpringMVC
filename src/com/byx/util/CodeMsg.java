package com.byx.util;

import java.util.HashMap;
import java.util.Map;
import com.byx.util.JsonUtils;

public class CodeMsg {
	private String code;
	private String msg;
	private Object value;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String toJson(){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("code", code);
		map.put("msg", msg);
		map.put("value", value);
		String jsonS = null;
		try{
			jsonS = JsonUtils.doMap2Json(map);
		}catch (Exception e) {
			
		}
		return jsonS;
	}
}
