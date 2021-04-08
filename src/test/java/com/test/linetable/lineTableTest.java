package com.test.linetable;

import com.linetable.Node;
import com.linetable.NodeUtil;
import org.junit.Test;

public class lineTableTest {


    @Test
    public void testaddData(){

        Node head = NodeUtil.inItLineTable();
        NodeUtil.addData(10,head);
        NodeUtil.addData(11,head);
        NodeUtil.addData(12,head);
        NodeUtil.addData(13,head);
        NodeUtil.insertData(head,8,88);
        NodeUtil.traverse(head);
        System.out.println("========================");
        NodeUtil.deleteNode(head,8);
        NodeUtil.traverse(head);
        NodeUtil.reverseList(head);

    }




}
