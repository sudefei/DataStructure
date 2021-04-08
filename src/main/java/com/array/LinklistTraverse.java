package com.array;

import com.array.ListNode;

public class LinklistTraverse {
    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2= new ListNode(2);
        ListNode listNode3= new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        System.out.println(ReverseList(listNode1));
    }


    public static ListNode ReverseList(ListNode head){
        if (head == null){
            return null;
        }
        ListNode prep=null;  //当前节点的前一个节点
        ListNode next=null; //当前节点的下一个节点
        while (head != null){
            //先用next 保存当前节点的下一个节点对象
            // head.next 与 prep 进行反转
            next=head.next;
            head.next=prep;
            // head 指向 prep 之后，就继续反转下一个节点
            // prep ，head , next 依次向后移动一个节点
            prep = head;
            head = next;
        }
        return prep;
    }

}
