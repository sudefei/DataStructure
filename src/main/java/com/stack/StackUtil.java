package com.stack;

import com.linetable.Node;
import com.linetable.NodeUtil;
import com.stack.Stack;

import java.util.ArrayList;

public class StackUtil {


    public static Node[] inItLineTable(){
        Node[] nodes= new Node[2];
        Node next5=new Node(1);
        Node next4=new Node(2,next5);
        Node next3=new Node(3,next4);
        Node next2=new Node(4,next3);
        Node next1=new Node(5,next2);
        nodes[0]=next1;
        nodes[1]=next5;
        return nodes;
    }

    /**
     * 初始化一个样例栈
     *
     * @return
     */
    public static Stack initStack(){
        Node[] nodes = inItLineTable();
        Node stackTop= nodes[0];
        Node stackBottom = nodes[1];
        Stack stack=new Stack(stackTop,stackBottom);
        return stack;
    }

    /**
     * 数据进栈
     *
     * @param stack 栈
     * @param value 进栈的数据
     */
    public static void pushSatck(Stack stack,int value){
        //封装数据成节点
        Node newNode=new Node(value);

        //栈顶本来指向的节点由新节点来指向
        newNode.next= stack.stackTop;

        //是栈顶指针指向新的节点
        stack.stackTop=newNode;
    }

    /**
     * 出栈(栈顶的指针指向下一个节点)
     *
     * @param stack 栈
     */
    public static void popStack(Stack stack){

        //栈不为空才能出栈
        if(!isEmpty(stack)){
            Node top = stack.stackTop;
            stack.stackTop = top.next;
            System.out.println("出栈的元素是："+top.value);
        }
    }

    /**
     * 遍历栈
     * 只要栈顶元素的指针不指向栈底，便一直输出
     * @param stack
     */
    public static void traverse(Stack stack){
        Node stackTop = stack.stackTop;

        while (stackTop!=stack.stackBottom){
            System.out.println(stackTop.value);
            stackTop=stackTop.next;
        }
    }

    /**
     * 判断该栈是否为空
     *
     * @param stack 栈
     */
    public static boolean isEmpty(Stack stack){
        if (stack.stackTop == stack.stackBottom){
            System.out.println("该栈为空栈");
            return true;
        }else{
            System.out.println("该栈不为空");
            return false;
        }
    }

    /**
     * 清空栈
     * 栈顶指针指定栈底，即清空栈
     * @param stack 栈
     */
    public static void clearStack(Stack stack){

    }


}
