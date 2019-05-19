package com.haochh.chen.poseidon.util;

import com.haochh.chen.poseidon.bean.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by admin on 2019/5/18.
 */
public class MySqlUtils {

    public static void main(String[] args) {

//        //1.创建 EntityManagerFactory
//        String persistenceUnitName = "jpa";
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
//
//        //2.创建 EntityManager
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        //4.开启事务
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//
//        //5.进行持久化操作
//        User customer = new User();
//        customer.setName("AA");
//        customer.setEmail("aa@163.com");
//        customer.setPasswd("123");
//
//        entityManager.persist(customer);
//
//        //6.提交事务
//        transaction.commit();
//
//        //7.关闭 EntityManager
//        entityManager.close();
//
//        //8.关闭 EntityManagerFactory
//        entityManagerFactory.close();

    }
}
