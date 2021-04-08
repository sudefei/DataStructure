package com.test.linetable;

import com.queue.Queue;
import com.queue.QueueUtils;
import org.junit.Test;

/**
 * @Author defei.su
 * @Date 2020/8/3 15:47
 */
public class QueueTest {

    @Test
    public void testIsFull(){
        Queue queue = QueueUtils.initQueue();
        QueueUtils.inQueue(queue,2);
        QueueUtils.inQueue(queue,3);
        QueueUtils.inQueue(queue,10);
        QueueUtils.inQueue(queue,10);
        QueueUtils.inQueue(queue,10);
        QueueUtils.inQueue(queue,10);
        QueueUtils.inQueue(queue,10);
        QueueUtils.inQueue(queue,10);
        QueueUtils.inQueue(queue,10);


        QueueUtils.traverseQueue(queue);
        QueueUtils.outQueue(queue);
        QueueUtils.outQueue(queue);
        QueueUtils.outQueue(queue);
    }


}
