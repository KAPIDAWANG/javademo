package com.itheima.variable;

public class Variable {

    public static void main(String[] args) {
        /*微信余额：0元
        支付宝余额：20元
        银行卡余额：20元
        问题一：请问现在一共多少钱？
        问题二：请问微信收了10元红包，又发了两元红包，现在余额是多少？*/

        // 定义一个变量记录微信的值
        int a = 0;
        // 定义一个变量记录支付宝的值
        int b = 20;
        // 定义一个变量记录银行卡的值
        int c = 20;
        // 计算总金额
        int sum = a + b + c;
        System.out.println("总金额是：" + sum);
        // 微信收了10元红包，又发了两元红包，现在微信余额是多少？
        a = a + 10 - 2;
        System.out.println("微信余额是：" + a);
    }
}
