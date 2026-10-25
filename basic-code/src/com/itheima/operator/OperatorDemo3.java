package com.itheima.operator;

public class OperatorDemo3 {
    public static void main(String[] args){

    // 1.先定义一个表变量记录秒数
        
    int seconds = 3661;

    // 2.输出小时
    int hours = seconds / 3600;
    System.out.println(hours);

    // 3.输出分钟
    int min = seconds % 3600 / 60;
    System.out.println(min);

    // 4.输出秒数
    int second = seconds % 3600 % 60;
    System.out.println(second);

    }
}
