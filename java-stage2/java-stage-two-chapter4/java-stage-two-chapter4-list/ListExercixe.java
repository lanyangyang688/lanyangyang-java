package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercixe {
    @SuppressWarnings({"all"})
    static void main(String[] args) {
        /*
添加 10 个以上的元素(比如 String "hello" )，在 2 号位插入一个元素"lyy"
获得第 5 个元素，删除第 6 个元素，修改第 7 个元素，在使用迭代器遍历集合，要求:使用 List 的实现类 ArrayList 完成。
        */
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println("list =" + list);

        //在二号位插入一个元素lyy
        list.add(1, "lyy");
        System.out.println("list =" + list);
        //获取第五个元素
        System.out.println("第五个元素是" + list.get(4));
        //删除第六个元素
        list.remove(5);
        System.out.println("list =" + list);
        //修改第七个元素
        list.set(6, "aaa");
        System.out.println("list =" + list);
        //使用迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object Obj = iterator.next();
            System.out.println("Obj=" + Obj);
        }


    }

}
