package com.bjsxt.mapper;

import com.bjsxt.pojo.Account;
import org.apache.ibatis.annotations.Update;


public interface AccountMapper {
    @Update("update account set balance =balance -#{balance} WHERE aname=#{aname}")
    void updateAccount(Account account);
}
