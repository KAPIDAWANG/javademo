package com.itheima.variable;

import java.util.Scanner;

public class VariableDemo7 {
    public static void main(String[] args) {
        
        /*定义两个整数类型的变量， num1 和 num2，键盘录入数据分别为两个变量赋值
        求两个变量的和，并将进行打印 
         */

        // 1.找到Scanner这个打工人
        Scanner sc = new Scanner(System.in);

        // 2.让Scanner输入第一个整数
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println(num1);

        // 3.让Scanner输入第二个整数
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.println(num2);

        // 4.求和
        int num = num1 + num2;
        System.out.println(num);


    }
}
