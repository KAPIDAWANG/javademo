package com.itheima.variable;

public class VariableDemo5 {
    public static void main(String[] args){


    //BMI 体重 / 身高 * 身高·

    // 1. 定义变量记录我的体重 ： 63.2KG
    double weight = 63.2;

    // 2. 定义变量记录我的身高 ： 1.65M
    double height = 1.65;

    // 3.计算BMT
    double bmi = weight / (height * height);

    // 4.输出BMI
    System.out.println(bmi);
    }
}
