package com.itheima.variable;

import java.util.Scanner;

public class VariableDemo8 {

        public static void main(String[] args){

        // BMI = 体重(kg) / 身高(m)的平方
        
        // 1.找到Scanner这个打工人
        Scanner sc = new Scanner(System.in);
        
        // 2.让Scanner输入体重
        System.out.println("请输入体重:");
        double weight = sc.nextDouble();

        // 3.让Scanner输入身高
        System.out.println("请输入身高:");
        double height = sc.nextDouble();
        
        // 4.计算BMI
        double BMI = weight / (height * height);
        System.out.println(BMI);
        }
}
