package com.stack;

import com.linetable.Node;

public class Stack {
    public Node stackTop;
    public Node stackBottom;

    public Stack(Node stackTop,Node stackBottom){
        this.stackTop=stackTop;
        this.stackBottom=stackBottom;
    }

    public Stack(){}

}
