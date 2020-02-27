package com.java.dao.impl;

import com.java.anquan.Security;
import com.java.cache.Clean;
import com.java.dao.CbcDao;
import com.java.logs.Logger;

/**
 * description: 核心类
 * author: 李四
 * time: 2020/2/25 17:44
 */
public class CbcDaoImpl implements CbcDao {

    @Override
    public void zhuangMoney(){
        System.out.println("CbcDaoImpl.....zhuangMoney()....转账成功");
    }

    @Override
    public void selectMoney(){
        System.out.println("CbcDaoImpl.....selectMoney()....您的账户余额为1000万");
    }

    @Override
    public void invest(){
        System.out.println("CbcDaoImpl.....invest()....恭喜您，投资失败");
    }

}
