package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    static void main(String[] args) {
        @SuppressWarnings({"all"})
        Collection col = new ArrayList();

        col.add(new book("三国演义","罗贯中",10.1));
        col.add(new book("小李飞刀","古龙",5.1));
        col.add(new book("红楼梦","曹雪芹",34.6));

        //1.使用增强for循环,在Collection集合上
        //2.增强for，底层仍然是迭代器
        //3.增强for 可以理解就是简化版本的迭代器遍历
        //4.快捷方式I
        for (Object book:col){
            System.out.println("book = " + book);
        }
        //增强for也可以用于数组
        int [] nums = {1,8,10,2};
        for (int i :nums){
            System.out.println("i = " + i);
        }
    }
}
