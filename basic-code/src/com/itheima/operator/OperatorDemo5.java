package com.itheima.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        /* 练习二：
        检查下面的代码程序运行的的时候是否会出错，如果会，请说明错误原因
         */
        short s1 = 100;
        short s2 = 200;    
        

        /* 方案一：
        300 ：二进制 00000001 00101100
        强制转换byte：00101100（44）  */
        byte result = (byte)(s1 + s2);  // 这里需要强制类型转换，因为 s1 + s2 的结果是 int 类型，不能直接赋值给 byte 类型
        System.out.println(result);
    
        /* 方案二： */
        int result2 = s1 + s2;  // 这里不需要强制类型转换，因为 s1 + s2 的结果是 int 类型，可以直接赋值给 int 类型
        System.out.println(result2);
    
    
    }
}
