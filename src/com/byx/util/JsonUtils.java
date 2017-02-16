package com.byx.util;

import java.io.IOException;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import com.alibaba.fastjson.JSON;

public class JsonUtils {
	
    /**
     * 转换Map到Json
     * 
     * @param paramMap
     * @return
     * @throws IOException
     * @throws JsonGenerationException
     * @throws JsonMappingException
     */
	public static String doMap2Json(@SuppressWarnings("rawtypes") Map paramMap) throws IOException,
			JsonGenerationException, JsonMappingException {
		ObjectMapper objectMapper = new ObjectMapper();
    	String dataJson = objectMapper.writeValueAsString(paramMap);
		return dataJson;
	}
	
	/**
	 * 将java类型转换成json字符串
	 * 
	 * @param t
	 * @return
	 */
	public static String convert2Json(Object t,HttpServletRequest request){
		String callBack = request.getParameter("callback");
		if(StringUtils.isEmpty(callBack)){
			return JSON.toJSONString(t, JSONProxy.SYSTEM_FEATURE);
		}
		return callBack + "("+JSON.toJSONString(t, JSONProxy.SYSTEM_FEATURE)+")";
	}
}
