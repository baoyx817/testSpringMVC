package com.byx.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.byx.model.User;
import com.byx.services.IUserService;
import com.byx.util.CodeMsg;
import com.byx.util.JsonUtils;

@Controller
public class TestController{
	@Autowired
    private IUserService userService;
	 /**
     * @throws IOException 
	 * @return方法的返回值是ModelAndView中的ViewName
     */
    //用来访问控制层的方法注解
    @RequestMapping("/hello.do")
    public void printHello(HttpServletResponse response, HttpServletRequest request,ModelMap model) throws IOException{
    	CodeMsg cm =new CodeMsg();
		cm.setCode("false");
		cm.setMsg("客户姓名不能为空");
		response.getWriter().print( JsonUtils.convert2Json(cm,request));
    }
    
    @RequestMapping("/login.do")
    public void login(HttpServletResponse response, HttpServletRequest request,User user) throws IOException{
        CodeMsg cm = userService.Login();
		response.getWriter().print( JsonUtils.convert2Json(cm,request));
    }
}
