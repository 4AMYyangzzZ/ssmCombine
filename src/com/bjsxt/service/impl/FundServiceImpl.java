package com.bjsxt.service.impl;

import com.bjsxt.mapper.AccountMapper;
import com.bjsxt.mapper.FundMapper;
import com.bjsxt.pojo.Account;
import com.bjsxt.pojo.Fund;
import com.bjsxt.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("fundService")
public class FundServiceImpl implements FundService {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private FundMapper fundMapper;

    public AccountMapper getAccountMapper() {
        return accountMapper;
    }

    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    public FundMapper getFundMapper() {
        return fundMapper;
    }

    public void setFundMapper(FundMapper fundMapper) {
        this.fundMapper = fundMapper;
    }

    @Override
    public void buyFund(Account account, Fund fund) {
        accountMapper.updateAccount(account);
        fundMapper.updateFund(fund);
    }
}
