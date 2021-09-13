/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;
import java.text.MessageFormat;
import java.util.Scanner;

public class App 
{
    public static double string2Num(String strNum){
        int num=0, max = strNum.length();
        for (int i = 0; i < max; i++) {
            num = num*10+(strNum.charAt(i)-48);
        }
        return num;
    }
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String  firstNum = input.next();
        double num1 = string2Num(firstNum);

        System.out.print("What is the second number? ");
        String  secondNum = input.next();
        double num2 = string2Num(secondNum);

        System.out.print(MessageFormat.format("{0} + {1} = {2}\n{0} - {1} = {3}\n{0} * {1} = {4}\n{0} / {1} = {5}",
        num1, num2, (num1+num2), (num1-num2), (num1*num2), (num1/num2)));

    }
}
