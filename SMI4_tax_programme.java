package com.company;
import java.util.Scanner;

public class SMI4_tax_programme {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income in : ");
        double income = sc.nextFloat();
        System.out.println("your annual income is " + income);


        if(income < 250000)
            System.out.println("you don't need to pay tax");
        else if(income >= 250000 && income < 500000)
            System.out.println("you have to pay 5 % of tax it is around " + ((5*income)/100)+ ". your net salary is " + (income-((20* income)/100)));
        else if(income >= 50000 && income < 1000000)
            System.out.println("you have to pay 20 % tax and it is around " + ((20* income)/100) + ". your net salary is " + (income-((20* income)/100)));
        else
            System.out.println("you have to pay 30 % tax and it is around " + ((30 * income)/100) + ". your net salary is " + (income-((20* income)/100)) );

    }
}
