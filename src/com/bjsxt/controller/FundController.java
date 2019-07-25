package com.bjsxt.controller;

import com.bjsxt.pojo.Account;
import com.bjsxt.pojo.Fund;
import com.bjsxt.service.FundService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FundController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //接收表单数据
        String aname = request.getParameter("aname");
        double balance = Double.parseDouble(request.getParameter("balance"));
        String fname = request.getParameter("fname");
        int amount = Integer.parseInt(request.getParameter("amount"));
        Account account=new Account();
        account.setAname(aname);
        account.setBalance(balance);
        Fund fund = new Fund();
        fund.setFname(fname);
        fund.setAmount(amount);
        //调用业务层
        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
        FundService fundService = wac.getBean("fundService", FundService.class);
        fundService.buyFund(account,fund );
        //资源跳转
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/success.jsp");
        return modelAndView;
    }
}
