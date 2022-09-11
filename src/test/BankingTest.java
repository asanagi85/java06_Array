package test;

import banking.Account;
import banking.Customer;
/*
1.c1이라는 이름으로 Customer 객체를 생성
2.accounts 라는 이름으로 Account[]를 생성..2
하나은행, 우리은행(선언, 생성, 초기화)
 */
public class BankingTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("한효주");
        Account[] accounts = {
                new Account(1200,"HanaBank",89711),
                new Account(2700,"UriBank",78492)
        };

        //한효주가 하나, 우리은행의 통장을 개설...
        c1.setAccounts(accounts);

        //한효주가 개설한 통장의 정보를 출력(for문사용)

        for(Account acc : accounts){
            acc.printAccount();
        }//for

        /*
        우리은행 통장에 1000원 입금 600원 출금 잔액확인
         */

        accounts[1].deposit(1000);
        System.out.println(accounts[1].getBalance());
        accounts[1].withdraw(600);
        System.out.println(accounts[1].getBalance());
    }
}
