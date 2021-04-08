package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class PostFixEvaluator {
private final static char ADD = '+';
private final static char SUBSTACT = '-';
private final static char MUTIPLY = '*';
private final static char DEVIDE = '/';
private Stack<Integer> stack;
    // create a evaluate
    public PostFixEvaluator() {
        stack =new Stack<Integer>();
    }

    // evaluate
    public int evaluate(String expr){
        int opd1,opd2,result=0;
        String token;
    // construct a new scanner  produces values scanned from the specified string.
        Scanner scan =new Scanner(expr);
        while(scan.hasNext()){
            token = scan.next();
            if (isOperator(token)){
                // Integer to int
                opd1=(stack.pop()).intValue();
                opd2=(stack.pop()).intValue();
                //String.chatAt(0)  use first char
                result=evaluateSingleOpertor(token.charAt(0),opd1,opd2);
                stack.push(new Integer(result));
            }else {
                stack.push(new Integer(Integer.parseInt(token)));
            }
        }
        return result;

    }


    public boolean isOperator(String token){
         return (token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/"));
    }


    public int evaluateSingleOpertor(char operator,int opd1,int opd2){
        int result=0;
        switch(operator){
            case ADD:
                result=opd1+opd2;
                break;
            case SUBSTACT:
                result=opd1-opd2;
                break;
            case MUTIPLY:
                result=opd1*opd2;
                break;
            case DEVIDE:
                result=opd1/opd2;
                break;
        }
        return result;
    }
}
