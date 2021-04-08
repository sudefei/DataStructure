package com.queue;

/**
 * @Author defei.su
 * @Date 2020/8/3 15:20
 */
public class QueueUtils {

    /**
     * 初始化一个长度为5 的队列
     *
     * @return 队列（front,rear,arrays）
     */
    public static Queue initQueue(){
        Queue queue=new Queue();
        queue.front=0;
        queue.rear=0;
        queue.arrays=new int[6];

        return queue;
    }

    /**
     *  如果队列的front = rear -1 ，即紧挨着，则队列已满
     * @param queue
     * @return
     */
    public static boolean isFull(Queue queue){
        if((queue.rear + 1) % queue.arrays.length == queue.front){
//        if (queue.front==queue.rear-1 && queue.arrays.length!=0){
            return true;
        }else {
            System.out.println("队列已满，不能插入");
            return false;
    }}

    public static boolean isEmpty(Queue queue){
        if(queue.rear==queue.front){
//        if (queue.front==queue.rear-1 && queue.arrays.length!=0){
            return true;
        }
        return false;
    }

    /**
     * 遍历输出该队列的值
     *
     * @param queue
     */
    public static void traverseQueue(Queue queue){
        //只要front 节点不指向 rear 节点，便可以一直输出
        int i=queue.front;

        while (i != queue.rear){
            int value = queue.arrays[i];
            System.out.println(value);
            //移动front
            i=i+1 % (queue.arrays.length);
        }
    }

    /**
     *     1.判断队列是否已满
     *     2.将元素插入到尾针所指向的位置
     *     3.尾指针向后移一位
     * @param queue
     * @param value
     */
     public static void inQueue(Queue queue,int value){

         if (!isFull(queue)){
             //将元素插入到尾针所指向的位置
              queue.arrays[queue.rear]=value;
              //尾指针向后移一位
              queue.rear=(queue.rear+1) % queue.arrays.length;
         }
     }

    public static int outQueue(Queue queue){
        /** 队列先进先出
         *  出队列，判断是都为null,头指针向后移一位即可
         */
        int value=0;
        if (!isEmpty(queue)){
            value = queue.arrays[queue.front];
            queue.front=(queue.front+1) % queue.arrays.length;
            System.out.println("出队的元素为:"+value);
        }
        return value;
    }

}
