package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        /* 
        算数运算符 ； +  -  *  /  % 
        
        整数计算    小数计算
        
        */

        // 1.整数计算
        /*整数相除结果还是整数，就是商
          其余运算和数学中一摸一样 
         */
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        
        System.out.println("----------------------------------------");

        // 2.小数计算
        // 小数直接参与计算结果可能不准确
        double c = 3.00;
        double d = 1.00;

        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c % d);
    }

}
// 嘻嘻嘻嘻