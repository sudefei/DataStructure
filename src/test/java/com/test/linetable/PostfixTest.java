package com.test.linetable;

import com.stack.PostFixEvaluator;

import java.util.Scanner;

public class PostfixTest {
    public static void main(String[] args) {
        String expression,again;
        int result;
        Scanner in=new Scanner(System.in);
        do {
            PostFixEvaluator postFixEvaluator=new PostFixEvaluator();
            System.out.println("e.g. 5 4 +  3 2 1 - + *");
            System.out.println();
            expression = in.nextLine();
            System.out.println("输入的表达式：" + expression);
            result = postFixEvaluator.evaluate(expression);
            System.out.println("运算的结果是：" + result);

            System.out.println("是否输入下一个表达式？[Y/N]");
            again=in.nextLine();
        }while (again.equalsIgnoreCase("y"));
    }
}
