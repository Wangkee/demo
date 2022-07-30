package com.example.demo.java8_interface;

public interface JDK8Interface {
    //抽象方法
    void method1();
    //默认方法
    default void method2(){
        System.out.println("method2...");
    }
    //静态方法
    static void method3(){
        System.out.println("method3...");
    }
}
