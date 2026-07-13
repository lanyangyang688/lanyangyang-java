package com.generic;

/**
 * @author lanyangyang
 */
public class Generic_03 {
    static void main(String[] args) {

        Person<String> person = new Person<>("lyy");
        person.show();
    }
}

//泛型的作用是：可以在类声明的时候通过一个标识表示类中某个属性的类型
//或者是某个方法的返回值的类型，或者是参数类型
class Person<E> {
    E s;//E 表示 s的数据类型，该数据类型定义Person类的时候指定，即在编译期间，就确定E是什么类型

    public Person(E s) {//E可以是参数类型
        this.s = s;
    }
    public E f(){//可以是返回类型
        return s;
    }
    public void show(){
        System.out.println(s.getClass());//显示s的运行类型
    }
}