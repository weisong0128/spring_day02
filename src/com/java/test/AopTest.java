package com.java.test;

import com.java.dao.CbcDao;
import com.java.dao.impl.CbcDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description:
 * author: ws
 * time: 2020/2/25 18:24
 */
public class AopTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CbcDao cd= (CbcDao) context.getBean("cbcDaoImpl");
//        cd.selectMoney();
        cd.invest();
        ((ClassPathXmlApplicationContext)context).close();
    }

//    @Test
//    public void test2(){
//        CbcManager cbcManager = new CbcManager();
//        cbcManager.findMoney();
//    }



}
