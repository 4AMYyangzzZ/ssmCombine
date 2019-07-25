package com.bjsxt.controller;

import com.bjsxt.pojo.Account;
import com.bjsxt.pojo.Fund;
import com.bjsxt.service.FundService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class FundController {
    @RequestMapping("/buyFund.do")
    public String buyFund(Account account,Fund fund,HttpServletRequest request) throws Exception {
        //调用业务层
        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
        FundService fundService = wac.getBean("fundService", FundService.class);
        fundService.buyFund(account,fund );
        //资源跳转
       return "/success.jsp";
    }
}
