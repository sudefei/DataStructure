package com.linetable;

public class Node {

    public Integer value;

    public Node next;

    public Node(){}

    public Node(int value){
        this.value=value;
    }

    public Node(int value,Node next){
        this.value = value;
        this.next = next;
    }

}
