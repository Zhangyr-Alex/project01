package com.test.java;

import java.util.ArrayList;

/**
 * @author zhangyr
 * @create 2020-06-18-15:54
 * IDEA中模板的所在位置：setting - Editor - live Templates / Postfix Completion
 */
public class TemplatesTest {
    //模板六：prsf
    private static final Hello HE= new Hello();
    //变形：/psfi psfs
    public static final int NUMBER =2;
    public static final String NAME = "张三";
    //变形：pric pris
    /**
     *id
     */
     private int id;
     /**
      *
      */
      private String name=null;


    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("Hello");
        //变形：soutp soutv soutm xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("args = " + args);
        System.out.println("TemplatesTest.main");
        int num=10;
        System.out.println(num);
        //模板三：fori
        String[] str = new String[]{"TOM","LiLie","XiaoMing"};
        for (int i = 0; i < str.length ; i++) {
            System.out.println(i);
        }
        //变形：iter
        for (String s : str) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形：list.fori list.forr
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(i);
        }
        //模板五：ifn
        if (list == null) {
            for (Object o : list) {
                System.out.println(o);
            }
        }
        //变形：inn xxx.nn xxx.null
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i);
            }
        }
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
