package com.itheima.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
        
        // 键盘录入一个三位数，将其拆分为个位，十位，百位后，打印在控制台

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个三位数字:");
        int number = sc.nextInt();

        // 1.输出个位
        System.out.println(number % 10);
        // 2.输出十位
        System.out.println(number / 10 % 10);
        // 3.输出百位
        System.out.println(number / 100 % 10);


        

    }
}
