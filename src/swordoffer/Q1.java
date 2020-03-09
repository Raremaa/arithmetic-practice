package swordoffer;

/**
 * @author masaiqi
 * @date 2020/3/9 6:32 下午
 */
public class Q1 {


    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */


    /**
     * 时间复杂度O(m + n) （m n 分别为二维数组的行长度 和 列长度）
     * 空间复杂度O(1)
     */
    public boolean resolve(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        //从右上角开始遍历
        int rows = 0;
        int col = array[0].length - 1;
        while (rows < array.length && col >= 0) {
            if (target > array[rows][col]) {
                rows++;
            } else if (target < array[rows][col]) {
                col--;
            } else {
                return true;
            }
        }
        return false;
    }

}
