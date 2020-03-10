package swordoffer;

/**
 * @author masaiqi
 * @date 2020/3/9 10:19 下午
 */
public class Q2 {

    /**
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     */


    /**
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     *
     */
    public String replaceSpace(StringBuffer str) {
        int addCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(temp == ' ') {
                addCount += 1;
            }
        }
        int oldIndex = str.length() - 1;
        str.setLength(str.length() + 2 * addCount);
        int newIndex = str.length() - 1;
        while (oldIndex >= 0 && newIndex > oldIndex) {
            if(str.charAt(oldIndex) != ' ') {
                str.setCharAt(newIndex--, str.charAt(oldIndex));
            }else {
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            }
            oldIndex --;
        }
        return str.toString();
    }
}
