package cn.lsk.java;

import cn.lsk.bean.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试常用的模板
 * 模板在idea中的位置
 *
 * @author limouren_soul
 * @create 2019-09-25 9:23
 */
public class TemplatesTest {

    //prsf
    private static final Customer cust = new Customer();

    //psf
    public static final int NUM = 1;
    //psfi
    public static final int NUM2 = 2;
    //psfs
    public static final String name = "第三方的快乐";
    public static final String name2 = "sadak";


    //psvm
    public static void main(String[] args) {
        //sout 、soutp、soutm、soutv、xxx.sout
        System.out.println();

        //soutp
        System.out.println("args = [" + args + "]");
        //soutm
        System.out.println("TemplatesTest.main");
        //soutv
        int num = 10;
        int num2 = 1213;
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
        //xxx.sout
        TemplatesTest tt = new TemplatesTest();
        System.out.println(tt);

    }

    /**
     * 循环模板
     */
    public void run1() {
        //模板3：ifi
        String[] arr = {"tom", "jerry", "hanmeimei", "lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
    }

    /**
     * 集合模板
     */
    public void run2() {
        List<String> list = new ArrayList<String>();
        list.add("sdfa");
        list.add("sdasad");
        list.add("sdsda");
        list.add("鼎折覆餗");
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //listforr,倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        //ifn
        if (list == null) {
            System.out.println();
        }
        //inn
        if (list != null) {
            System.out.println();
        }
        //xxx.nn
        if (list != null) {

        }
        //xxx.null
        if (list == null) {

        }
    }

    public void run3() {

    }


}
