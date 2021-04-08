package com.stack;
import java.util.Stack;

public class StackToQueue{
    //用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
    //主要负责入队列
    Stack<Integer> stack1 = new Stack<Integer>();
    //主要负责出队列
    Stack<Integer> stack2 = new Stack<Integer>();

    //如果 stack2不是空的，先将 stacks2 清空，将stack 2 的元素押入到 stack 1 中。
    public void push(int node) {
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

   public int pop() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}