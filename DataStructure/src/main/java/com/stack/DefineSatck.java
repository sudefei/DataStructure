package com.stack;

import javafx.beans.value.ObservableObjectValue;

import java.util.LinkedList;

public class DefineSatck {
 private LinkedList link;
// 无参构造 ，初始化
    public DefineSatck() {
        link = new LinkedList();
    }

    public Object pop(){
        return link.removeFirst();
    }

    public void push(Object obj){
        link.addFirst(obj);
    }

    public boolean isEmpty(){
        return link.isEmpty();
    }

//    返回栈顶元素
    public Object peek(){
        Object obj=null;
        //直接取元素会报异常，需要先判断是否为空
        if (link.isEmpty()) return null;
        return link.getFirst();
    }
}
