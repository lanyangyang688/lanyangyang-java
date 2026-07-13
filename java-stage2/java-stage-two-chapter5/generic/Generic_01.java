package com.generic;

import java.util.ArrayList;

/**
 * @author lanyangyang
 */
@SuppressWarnings({"all"})
public class Generic_01 {
    static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Dog("旺财",10));
        arraylist.add(new Dog("发财",1));
        arraylist.add(new Dog("小黄",5));
        
        //遍历
        for (Object o : arraylist) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "-" + dog.getAge());
        }
        
        
        

        /*
        请编写程序，在 ArrayList 中，添加 3 个 Dog 对象
        Dog 对象含有 name 和 age, 并输出 name 和 age (要求使用 getXxx())
        */
    }
}
class Dog{
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
class Cat{
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