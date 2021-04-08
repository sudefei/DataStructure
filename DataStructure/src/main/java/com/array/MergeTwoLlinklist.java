package com.array;

import com.array.ListNode;

public class MergeTwoLlinklist {
    public static void main(String[] args) {
       ListNode list1=new ListNode(1);
       ListNode list11=new ListNode(3);
       list1.next=list11;
       ListNode list111=new ListNode(5);
        list11.next=list111;
       ListNode list1111=new ListNode(8);
        list111.next=list1111;
       ListNode list2=new ListNode(2);
       ListNode list22=new ListNode(4);
        list2.next=list22;
       ListNode list222=new ListNode(6);
        list22.next=list222;
       ListNode list2222=new ListNode(19);
        list222.next=list2222;
        ListNode merge = Merge(list1, list2);
        System.out.println(merge);
    }

    public static ListNode Merge(ListNode list1, ListNode list2) {
        ListNode list3=new ListNode(-1);
        list3.next=null;
        while(list1 != null && list2 != null ){
            if (list2.val <= list1.val){     //如果 list2头节点 < list1 头节点
                list3.next=list2;           //将list2 作为 list3 头节点
                list3=list2;//将list2 的值赋值给 list3 对应节点
                list2=list2.next;           //将list2 的下一个节点对象 改为头节点 ,为了后续的节点的判断
            }else {
                list3.next=list1;
                list3=list1;
                list1=list1.next;
            }
        }
        if (list1 == null ){
            list3.next = list2;
        }
        if (list2 ==null) {
            list3.next = list1;
        }
        return list3;
    }

    public ListNode Merge02(ListNode list1,ListNode list2) {
        ListNode head=new ListNode(-1);
        head.next=null;
//        root 为暂存点
        ListNode root=head;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                head.next=list1;
                head=list1;
                list1=list1.next;
            }else{
                head.next=list2;
                head=list2;
                list2=list2.next;
            }
        }
        //把未结束的链表连接到合并后的链表尾部
        if(list1!=null){
            head.next=list1;
        }
        if(list2!=null){
            head.next=list2;
        }
        return root.next;
    }


}