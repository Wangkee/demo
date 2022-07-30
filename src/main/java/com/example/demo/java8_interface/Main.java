package com.example.demo.java8_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("子线程开始执行")).start();
    }
}
