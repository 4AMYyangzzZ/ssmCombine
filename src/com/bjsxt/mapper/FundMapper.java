package com.bjsxt.mapper;

import com.bjsxt.pojo.Fund;
import org.apache.ibatis.annotations.Update;

public interface FundMapper {
    @Update("update fund set amount =amount+#{amount} WHERE fname=#{fname}")
    void updateFund(Fund fund);
}
