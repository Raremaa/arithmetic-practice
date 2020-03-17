/**
 * @author masaiqi.com
 * @date 2020/3/17
 */
class Q8 {

    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
     * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     */

    public static void main(String[] args) {
        int[] array = {1, 2, 6, 23, 75, 9, 123, 56, 7};
        reOrderArray(array);
        for (int i = 0; i < array.length; i++) {
            System.err.println(array[i]);
        }
    }

    /**
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     */
    public static void reOrderArray(int[] array) {
        if (array == null || array.length == 0 || array.length == 1) {
            return;
        }
        int cursor = 0;
        for (int i = cursor; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                for (int j = i; j > cursor; j--) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
                cursor++;
            }
        }
    }
}