package com.itheima.variable;

public class VariableDemo2 {

    public static void main(String[] args) {
        /*我方:叉子                       对方:长手
        攻击:220                         攻击:210
        防御:85                          防御:80
        血量:1012.5                      血量:1223.3
        技能加成:1.2                     技能加成:1.3
        技能造成伤害的公式:攻击力*技能加成-对方防御力
        普攻造成伤害的公式:攻击力-对方防御力

        计算：
        我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量?
        我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量?

        规则:经常发生改变的数据，用变量记录  */

    // 1.定义变量记录我方的攻击力
    int Attack1 = 220;

    // 2.定义变量记录我方的防御力
    int Defense1 = 85;

    // 3.定义变量记录我方的技能加成
    double SkillAdd1 = 1.2;

    // 4.定义变量记录我方的血量
    double Blood1 = 1012.5;

    // 5.定义变量记录对方的攻击力
    int Attack2 = 210;

    // 6.定义变量记录对方的防御力
    int Defense2 = 80;

    // 7.定义变量记录对方的技能加成
    double SkillAdd2 = 1.3; 

    // 8.定义变量记录对方的血量
    double Blood2 = 1223.3;

   // 9.计算我方第一次进行普通攻击，造成多少伤害
    
   /* 普通攻击的公式：攻击力-对方防御力 */
    double Attack = Attack1 - Defense2;
    Blood2 = Blood2 - Attack;
    System.out.println("我方第一次进行普通攻击，造成" + Attack + "伤害，对方还剩余" + Blood2 + "血量");

    // 10.计算我方第二次进行技能攻击，造成多少伤害
    /* 技能攻击的公式：攻击力*技能加成-对方防御力 */
    double SkillAttack = Attack1 * SkillAdd1 - Defense2;
    Blood2 = Blood2 - SkillAttack;
    System.out.println("我方第二次进行技能攻击，造成" + SkillAttack + "伤害，对方还剩余" + Blood2 + "血量");
    }
}
