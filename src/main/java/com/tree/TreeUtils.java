package com.tree;

import com.tree.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.text.BreakIterator;
import java.util.List;

public class TreeUtils {
    public static void main(String[] args) {
       TreeNode root= initTree();  //获取一颗 测试树
        preorderTraversal(root);      //先序遍历
        System.out.println();
        inorderTraversal(root);       //中序遍历
        System.out.println();
        postorderTraversal(root);    //后序遍历

    }
    // Get the tree structure

    /** 初始化一棵树
     *
     * @return
     */
    public static TreeNode initTree(){
        TreeNode[] nodes=new TreeNode[10];//10个节点
        for(int i=0;i< nodes.length;i++){
            nodes[i] = new TreeNode(i);
        }
        nodes[0].setLeft(nodes[1]);
        nodes[0].setRight(nodes[2]);
        nodes[1].setLeft(nodes[3]);
        nodes[1].setRight(nodes[4]);
        nodes[2].setLeft(nodes[5]);
        nodes[2].setRight(nodes[6]);
        nodes[3].setLeft(nodes[7]);
        nodes[3].setRight(nodes[8]);
        nodes[4].setLeft(nodes[9]);
        return nodes[0];
    }

    /**
     * // 先序遍历   根-->左子树-->右子树
     *
     * @param root 根节点
     */
    public static void preorderTraversal(TreeNode root){
        if (root == null) return ;
        System.out.print(root.getVal()+" ");
        preorderTraversal(root.getLeft());
        preorderTraversal(root.getRight());
    }


    /**
     * //中序遍历  左子树-->根节点-->右子树
     *
     * @param root 根节点
     */
    public static void inorderTraversal(TreeNode root){
        if (root == null) return ;
        inorderTraversal(root.getLeft());
        System.out.print(root.getVal()+" ");
        inorderTraversal(root.getRight());
    }

    /**
     *  //后序遍历  左子树-->右子树-->根节点
     *
     * @param root 根节点
     */
    public static void postorderTraversal(TreeNode root){
        if (root == null) return ;
        postorderTraversal(root.getLeft());
        postorderTraversal(root.getRight());
        System.out.print(root.getVal()+" ");
    }

    /**
     *  树的镜像
     *
     * @param root 根节点
     */
    public static void Mirror(TreeNode root) {
        if (root == null ) return;
        if (root.getLeft()==null && root.getRight()==null ) return ;
//      将左右节点进行调换
        TreeNode left = root.getLeft();
        TreeNode right = root.getRight();
        TreeNode tmp=left;
        left=right;
        right=tmp;
        if (left!=null){
            Mirror(left);
        }
        if (right!=null){
            Mirror(right);
        }

    }

    /**
     *  树的镜像
     *
     * @param root 根节点
     */
    public void Mirror02(TreeNode root) {
        if (root == null ) return;
        if (root.getLeft()==null && root.getRight()==null ) return ;
//      将左右节点进行调换
        TreeNode left = root.getLeft();
        TreeNode right = root.getRight();
        TreeNode tmp=left;
        left=right;
        right=tmp;
        if ( root.getLeft()!=null){
            Mirror( root.getLeft());
        }
        if (root.getRight()!=null){
            Mirror(root.getRight());
        }
    }

    public static void createTree(TreeRoot treeRoot,int value){
        /**
         * 根节点左边的都要比 根节点 小
         * 根节点右边的都要比 根节点 大
         */
        if (treeRoot.getTreeRoot()==null){
            //如果根节点为空，就将第一个值作为根节点
            TreeNode treeNode=new TreeNode(value);
            treeRoot.setTreeRoot(treeNode);
        }else{
            //根节点不为空，将值与根节点作比较，比根小，设为左子树，
            // 比根大，设为右子树
            TreeNode tempRoot  = treeRoot.getTreeRoot();
            while (tempRoot !=null){
            if (value>tempRoot .getVal()){
                //右子树没有值，便直接插入
                if (tempRoot .getRight()==null){
                    tempRoot .setRight(new TreeNode(value));
                    return ;
                }else{
                    // 右子树有值，便一直遍历该节点的右子树，直到右子树为null
                    tempRoot = tempRoot.getRight();
                }
            }else{
                if (tempRoot .getLeft()==null){
                    tempRoot .setLeft(new TreeNode(value));
                    return ;
                }else{
                    // 右子树有值，便一直遍历该节点的右子树，直到右子树为null
                    tempRoot = tempRoot.getLeft();
                }
            }
        }}
    }

    /**
     * 获取树的深度
     *
     * @param treeNode 根节点
     * @return
     */
    public static int getHeight(TreeNode treeNode){
        if (treeNode == null){
            return 0;
        }

        // 获取左右子树的深度，哪个大就是哪个
        int leftHight = getHeight(treeNode.getLeft());
        int rightHight = getHeight(treeNode.getRight());
        int height = (leftHight > rightHight) ? leftHight + 1 : rightHight + 1;
        int max = Math.max(leftHight + 1, rightHight + 1);

        return height;
    }


}
