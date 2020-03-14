package swordoffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author masaiqi
 * @date 2020/3/14 7:44 上午
 */
public class Q4 {

    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     */

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        reConstructBinaryTree(pre, in);
    }


    /**
     * 时间复杂度 O(n)
     * 空间复杂度 不是很好计算，后续补充
     */
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }

        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<Integer, Integer>();
        for (int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }

        return doJob2(pre, 0, pre.length - 1, in, 0, in.length - 1, map);
    }

    private static TreeNode doJob2(int[] pre, int preL, int preR, int[] in, int inL, int inR, Map<Integer, Integer> indexMap) {

        if (preL < 0 || preR < 0 || preL > preR || preR > pre.length) {
            return null;
        }

        if (inL < 0 || inR < 0 || inL > inR || inR > in.length) {
            return null;
        }


        //有前序遍历，根节点确定
        TreeNode root = new TreeNode(pre[preL]);

        //找出根节点在中序遍历数组中的位置
        int rootIndex = indexMap.get(root.val);

        //由根节点在中序遍历数组中的位置，可以推算出前序遍历数组中左子树的最后一个节点的位置
        int leftEndIndex = rootIndex + preL - inL;

        //前序遍历数组，中序遍历数字的左右子数也应该分别满足前序遍历规则和中序遍历规则，所以分左右两种情况递归求解

        //左子树
        root.left = doJob2(pre, preL + 1, leftEndIndex, in, inL, rootIndex - 1, indexMap);
        //右子树
        root.right = doJob2(pre, leftEndIndex + 1, preR, in, rootIndex + 1, inR, indexMap);
        return root;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
