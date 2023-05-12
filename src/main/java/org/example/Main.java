package org.example;

import javabasedconfiguration.BeanConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojobeans.AccountService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        System.out.println("Using Java-Based Configuration");
        System.out.println("===================================");
        System.out.println("Before");
        System.out.println("Account 1 balance: "+accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance: "+accountService.getAccount(2).getBalance());
        accountService.transferMoney(1,2,111.11);
        System.out.println("------");
        System.out.println("After");
        System.out.println("Account 1 balance: "+accountService.getAccount(1).getBalance());
        System.out.println("Account 2 balance: "+accountService.getAccount(2).getBalance());
    }
}