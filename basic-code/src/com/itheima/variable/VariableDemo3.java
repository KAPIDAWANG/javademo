package com.itheima.variable;

public class VariableDemo3 {

    public static void main(String[] args) {
        /* 
        变量的注意事项：
            1.只能存一个值
            2.变量名不允许重复定义
            3.变量在使用之前一定要进行赋值
            4.一条语句可以定义多个变量，也可以连续进行赋值 */
    
        //  3.变量在使用之前一定要进行赋值
        
        int a;
        a = 10;
        System.out.println(a);
        
        //  4.一条语句可以定义多个变量，也可以连续进行赋值
        int b, c;
        b = 20;
        c = 30;
        
        System.out.println(b);
        System.out.println(c);    
    
        int d,e;
        d = e = 50;
        System.out.println(d);
        System.out.println(e);
  }
}
