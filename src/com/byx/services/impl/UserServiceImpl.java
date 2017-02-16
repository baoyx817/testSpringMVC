package com.byx.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.byx.mapper.TestMapper;
import com.byx.services.IUserService;
import com.byx.util.CodeMsg;
@Service
public class UserServiceImpl implements IUserService{
    
	@Autowired
    private TestMapper testmapper;
    
	@Override
	public CodeMsg Login(){
    	CodeMsg cm =new CodeMsg();
    	List<Map<String,Object>> res = testmapper.selectAllUser();
		cm.setCode("success");
		cm.setMsg("获取成功");
		cm.setValue(res);
		return cm;
	}

}