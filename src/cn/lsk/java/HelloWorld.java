package cn.lsk.java;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 生活大小必须是同城是大小相同的东西
 */
public class HelloWorld {
    /**
     * 自定义模板
     */
    private int id = 3;
     


    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println("hhhh");
        Date date = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat();
        String format = sdf.format(date);
        System.out.println(format);


    }


    public void run1(){

    }

    public void run2(){

    }

    /**
     * 不可修改
     */
    public void run3(){

    }
    



    public void testUpdate(){
        //书写测试代码
    }




}
