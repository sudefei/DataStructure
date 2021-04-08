package com.test.linetable;

import com.linetable.Node;
import com.stack.Stack;
import com.stack.StackUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;

public class StackTest {

    @Test
    public void testStackUtil(){
        Stack stack = StackUtil.initStack();
        StackUtil.popStack(stack);
        StackUtil.popStack(stack);
        StackUtil.popStack(stack);
    }

    @Test
    public void testHashMap(){
        String s="hello";
        String s2="jack";
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());

        Node node = null;
        node.hashCode();
    }

}
