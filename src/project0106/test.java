package project0106;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lzw
 * @date 2022/1/7 - 14:06
 * 1. IDEA中代码模板所处的位置：Settings - Editor -Live Templates
 * 2. 常用的模板
 */
public class test {
    //模板一：psvm
    public static void main(String[] args) {
        //模板二 sout
        System.out.println("hello!");
        // 变形：soutm soutp
        System.out.println("args = " + Arrays.deepToString(args));//显示方法参数 soutp
        System.out.println("test.main");//显示方法名字 soutm
        int num = 10;
        int num1 = 10;
        System.out.println("num = " + num);//显示变量名字 soutv 就近选择变量
        System.out.println(num1);//xxx.sout

        //模板三 fori
        String arr[] = new String[]{"LiLei","Hanmeimei","Jerry","Tom"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }

        //模板四 list.for
        ArrayList arrs = new ArrayList();
        arrs.add(123);
        arrs.add(456);
        arrs.add(789);
        for (Object o : arrs) {
            
        }
    }

}
