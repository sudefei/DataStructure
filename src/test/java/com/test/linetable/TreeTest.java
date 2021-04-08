package com.test.linetable;

import com.tree.TreeRoot;
import com.tree.TreeUtils;
import org.junit.Test;

import java.util.List;

/**
 * @Author defei.su
 * @Date 2020/8/3 18:07
 */
public class TreeTest {

    @Test
    public void testTree(){
        int[] arrays={5,3,4,9,7,1,10};

        //动态创建树
        TreeRoot treeRoot=new TreeRoot();
        for(int value:arrays){
            TreeUtils.createTree(treeRoot,value);
        }

        TreeUtils.preorderTraversal(treeRoot.getTreeRoot());
        System.out.println("===============================");
        System.out.println("===============================");
        TreeUtils.inorderTraversal(treeRoot.getTreeRoot());
        System.out.println("===============================");
        TreeUtils.postorderTraversal(treeRoot.getTreeRoot());

        int height = TreeUtils.getHeight(treeRoot.getTreeRoot());
        System.out.println(height);


    }

}
