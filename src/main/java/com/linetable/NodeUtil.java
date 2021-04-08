package com.linetable;

/*
   2020.7.22
 */

public class NodeUtil {

    private static Node head = new Node(0);

    /**
     * 初始化一个单线性表
     * @return 头结点 Node
     */
    public static Node inItLineTable(){
        Node next5=new Node(1);
        Node next4=new Node(2,next5);
        Node next3=new Node(3,next4);
        Node next2=new Node(4,next3);
        Node next1=new Node(5,next2);
        return next1;

    }


    /**
     * 向链表最后添加数据
     *
     * @param value
     */
    public static void addData(int value,Node head){

        Node newNode=new Node(value);

        Node temp=head;

        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;
    }

    /**
     *  指定位置插入节点
     *
     * @param head 头指针
     * @param index 插入的位置
     * @param value 插入的值
     */
    public static void insertData(Node head,int index,int value){
        //判断插入的位置是否合法
        if (index < 1 || index > linkListLength(head)){
            System.out.println("插入位置:"+index+"不合法");
            return;
        }
        //从头节点开始
        Node temp = head;

        //记录遍历的当前位置
        int currentPos=0;

        //初始化要插入的节点
        Node insertNode=new Node(value);

        while (temp.next !=null){
            //找到上一个节点的位置，找到上一个节点之后，
            // 将上一个节点的next 给当前节点
            // 将当前节点的next 给之前节点的next
            if ((index -1) ==currentPos){
            // temp 表示的是上一个节点
            //将之前的 next 赋值给 新节点的 next
            insertNode.next=temp.next;
            //将插入节点赋值给之前节点的next
            temp.next=insertNode;
            return ;
            }
            currentPos++;
            temp= temp.next;
        }
    }

    /**
     * 根据位置删除节点
     *
     * @param head 头结点
     * @param index 删除的位置
     */
    public static void deleteNode(Node head,int index){
        //判断插入的位置是否合法
        if (index < 1 || index > linkListLength(head)){
            System.out.println("删除位置:"+index+"不合法");
            return;
        }
        //从头节点开始
        Node temp = head;

        //记录遍历的当前位置
        int currentPos=0;

        while (temp.next!=null){
            if ((index-1)==currentPos){
                //则 temp.next 就是要删除的节点
                Node deleteNode = temp.next;

                temp.next=deleteNode.next;

                deleteNode=null;
                return;
            }
            currentPos++;
            temp = temp.next;
        }

    }

    //TODO 查找中位数
    public static void searchMid(Node head){

    }

    /**
     * 遍历该链表
     *
     * @param head 头结点
     */
    public static void traverse(Node head){
        Node temp = head.next;

        while(temp != null){
            if(temp.value !=null){
                System.out.print(temp.value+"\t");
            }
            //继续下一个
            temp = temp.next;
        }
    }

    /**
     * 翻转链表
     *
     * @param head 头结点
     */
    public static void printReverselist(Node head){
        //先找到最后一个节点
        if(head!=null){
            printReverselist(head.next);
            //当找到最后一个节点，开始输出最后一个节点的值
            if (head.value!=null){
                System.out.print(head.value);
            }
        }
    }


    public static Node reverseList(Node head){
         Node pre=null;
         Node cur=head;
         while(cur!=null){
             Node next=cur.next;
             cur.next = pre;
             pre=cur;
             cur=next;
         }
         return pre;
    }

    /**
     * 获取线性表的长度
     *
     * @param head
     * @return
     */
    public static int linkListLength(Node head){
        int length=0;
        Node temp = head.next;
        while (temp !=null){
            length++;
            temp = temp.next;
        }
        return length;
    }


}
