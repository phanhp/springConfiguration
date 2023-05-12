package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.AccountService;

public class Main2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlbasedconfiguration/bean.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);

        System.out.println("Using XML-Based Configuration");
        System.out.println("===================================");
        System.out.println("Before");
        System.out.println("Account 1 balance: "+accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance: "+accountService.getAccount(2).getBalance());
        accountService.transferMoney(1,2,222.22);
        System.out.println("------");
        System.out.println("After");
        System.out.println("Account 1 balance: "+accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance: "+accountService.getAccount(2).getBalance());
    }
}
