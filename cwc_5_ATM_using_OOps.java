package com.Aditya;


import java.sql.SQLOutput;
import java.util.*;

class atm{
    int balance;
    int pin=2003;
    public void checkpin(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin");
        int enterpin = sc.nextInt();
        if (enterpin == pin) {
            menu();
        }
        else {
            System.out.println("Enter a valid pin");
            checkpin();
        }
    }
    public void menu(){
        System.out.println("Press 1 for Check bank balance");
        System.out.println("Press 2 for Deposit your Money");
        System.out.println("Press 3 for Withdrawn your Money");
        System.out.println("Press 4 for Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt==1){
            checkbalance();
    }
        else if(opt==2){
            depositmoney();
        }
        else if(opt==3){
            withdrawmoney();
        }
        else if(opt==4){
            System.exit(0);
        }
        else{
            System.out.print("Choose a correct option");

            menu();
        }


}
public void checkbalance(){
    System.out.println("Available Balance " +balance);
    menu();
}
public void depositmoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit");
        int m = sc.nextInt();
        balance = m + balance;
        System.out.println("Amount deposited succesfully");
        menu();
}
public void withdrawmoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        int w = sc.nextInt();
        if(w<=balance){
            balance = balance-w;
            System.out.println("Successfully withdrawn");
        }
        else{
            System.out.println("Insufficient Money");
        }
        menu();
}
}
public class cwc_5_ATM_using_OOps {
    public static void main(String[]args) {
        atm obj = new atm();
        obj.checkpin();


    }

}
