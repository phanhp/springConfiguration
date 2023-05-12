package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.AccountService;

public class Main3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationbasedconfiguration/bean2.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);

        System.out.println("Using Java Annotation-Based Configuration");
        System.out.println("===================================");
        System.out.println("Before");
        System.out.println("Account 1 balance: "+accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance: "+accountService.getAccount(2).getBalance());
        accountService.transferMoney(1,2,333.33);
        System.out.println("------");
        System.out.println("After");
        System.out.println("Account 1 balance: "+accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance: "+accountService.getAccount(2).getBalance());
    }
}
