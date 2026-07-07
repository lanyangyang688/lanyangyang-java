package com.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author lanyangyang
 */
@SuppressWarnings({"all"})
public class HashSetExercise {
    static void main(String[] args) {
        /*
        定义一个 Employee 类，该类包含：private 成员属性 name,age 要求:
        创建 3 个 Employee 对象放入 HashSet 中
        当 name 和 age 的值相同时，认为是相同员工, 不能添加到 HashSet 集合中
         */

        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("milan", 18));
        hashSet.add(new Employee("smith", 28));
        hashSet.add(new Employee("milan", 18));

        System.out.println("HashSet = " + hashSet);

    }
}

//创建Employee
class Employee {
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

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //如果name 和 age 值相同，则返回相同的hash值
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}