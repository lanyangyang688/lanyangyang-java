package com.customgeneric;

/**
 * @author lanyangyang
 */
public class CustomGeneric_ {
    static void main(String[] args) {

//        //T=Double, R=String, M=Integer
//        Tiger<Double, String, Integer> g = new Tiger<>("john");
//        g.setT(10.9); //OK
//        //g.setT("yy"); //错误，类型不对
//        System.out.println(g);
//        Tiger g2 = new Tiger("john");//OK T=Object R=Object M=Object g2.setT("yy"); //OK ,因为 T=Object "yy"=String 是 Object 子类
//        System.out.println("g2=" + g2);
    }
}

//1. Tiger 后面泛型，所以我们把 Tiger 就称为自定义泛型类
//2, T, R, M 泛型的标识符,一般是单个大写字母
//3. 泛型标识符可以有多个.
//4. 普通成员可以使用泛型 (属性、方法)
//5. 使用泛型的数组，不能初始化
//6. 静态方法中不能使用类的泛型
class Tiger<T, R, M> {
    String name;
    T t;//属性使用到泛型
    R r;
    M m;

    public Tiger(String name, T t, M m, R r) {//构造器使用泛型
        this.name = name;
        this.t = t;
        this.m = m;
        this.r = r;
    }

    //因为静态是和类相关的，在类加载的时候，对象还没有创建
    //所有，如果静态方法和静态属性使用了泛型，JVM就无法完成初始化¬
//    static R r2;
//    public static void m1(M m){
//
//    }

    //方法使用泛型

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
