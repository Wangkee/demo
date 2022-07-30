package com.example.demo.java8_interface;

public class JDK8InterfaceImpl extends JDK8ParentClass implements JDK8Interface{
    @Override
    public void method1() {
        System.out.println("method1...");
    }

    @Override
    public void method2() {
        System.out.println("override method2...");
    }
}
