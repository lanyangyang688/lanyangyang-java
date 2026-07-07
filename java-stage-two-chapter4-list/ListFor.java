package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class ListFor {
    @SuppressWarnings({"all"})
    static void main(String[] args) {

        //list接口的实现子类 Vector LinkedList
        //List list = new ArrayList();
        //List list = new Vector();
        List list = new LinkedList();
        list.add("jack");
        list.add("tom");
        list.add("lyy");
        list.add("aaa");

        //遍历
        //1，迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object Obj = iterator.next();
            System.out.println("obj=" + Obj);
        }

        System.out.println("=====增强for=====");
        //2.增强for
        for (Object o : list) {
            System.out.println("o = " + o);
        }

        System.out.println("=====普通for=====");
        //3.普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println("对象= " + list.get(i));
        }
        


    }
}
