package com.byx.util;

import com.alibaba.fastjson.serializer.SerializerFeature;

public class JSONProxy {
	public static final SerializerFeature[] SYSTEM_FEATURE={
		SerializerFeature.WriteNullStringAsEmpty, 
		SerializerFeature.WriteMapNullValue,
		SerializerFeature.DisableCircularReferenceDetect,
		SerializerFeature.WriteDateUseDateFormat
	};
}
