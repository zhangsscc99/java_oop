package com.newyork;
import java.util.ArrayList;
import java.util.*;
/*1 define accounts class */
//2 define a set container. to store all class objects.
// 3 show the system home page
//

public class ATMSystem {
    public static void main(String[] args){
        ArrayList<Account> accounts=new ArrayList<>():

        System.out.println("welcome to our ATM system");
        while (true){
            System.out.println("1. log in to the system");
            System.out.println("2. create an account");
            System.out.println("please choose either one");
            Scanner sc=new Scanner(System.in);
            int command=sc.nextInt();
            switch (command){
                case 1:
                    login(accounts,sc);
                    break;
                case 2:
                    register(accounts,sc);
                    break;
                default:
                    System.out.println("the command does not exist")
            }
        }
    }
}
