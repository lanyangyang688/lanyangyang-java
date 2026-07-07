package com.collection;

import java.util.ArrayList;
@SuppressWarnings({"all"})
public class ArrayListDetail {
    static void main(String[] args) {

        //Arraylist是线程不安全的，可以看源码 没有 synchronized
        ArrayList arraylist = new ArrayList();
        arraylist.add(null);
        arraylist.add("jack");
        arraylist.add(null);
        System.out.println(arraylist);
    }
}
