package com.tree;

import java.util.Stack;

public class HasSubtree {
    public static void main(String[] args) {

    }
/**
 * 1.构建一个辅助栈
 * 2.遍历压栈的顺序，如果出栈的元素与压栈元素不同，就压入栈
 * 3.直到出栈的元素与栈顶元素相同，就出栈
 * 4.一直循环步骤 2.3 直到最终辅助栈为空，如果不为空，则证明不是准确输出
 */
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length ==0 && popA.length == 0) return false;
        Stack<Integer> stack=new Stack<Integer>();

//      弹出序列的位置，
        int popIndex =0;
        for (int i=0;i<pushA.length;i++){
//          先将 push 的元素进行入栈
            stack.push(pushA[i]);
            while (!stack.empty() && stack.peek()==popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
//       最终栈是否为空，不为空则不是输出顺序
        return stack.empty();
    }
}
