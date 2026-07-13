package com.generic.improve;

import java.util.ArrayList;

/**
 * @author lanyangyang
 */
public class Generic_02 {
    static void main(String[] args) {
        /*
        请编写程序，在 ArrayList 中，添加 3 个 Dog 对象
        Dog 对象含有 name 和 age, 并输出 name 和 age (要求使用 getXxx())
        */


        //用传统方法==>泛型
        //1. 当我们 ArrayList<Dog> 表示存放到 ArrayList 集合中的元素是 Dog 类型
        //2. 如果编译器发现添加的类型，不满足要求，就会报错
        //3. 在遍历的时候，可以直接取出 Dog 类型而不是 Object
        //4. public class ArrayList<E> {} E 称为泛型,那么 Dog->E
        ArrayList<Dog> arraylist = new ArrayList<Dog>();
        arraylist.add(new Dog("旺财",10));
        arraylist.add(new Dog("发财",1));
        arraylist.add(new Dog("小黄",5));

//        //不小心加入了cat
//        arraylist.add((new Cat("招财猫",8)));

        //遍历
        for (Dog o : arraylist) {
            System.out.println(o.getName() + "-" + o.getAge());
        }
    }
}

class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Cat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}