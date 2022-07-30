package com.example.demo.optional;

import com.example.demo.java8_interface.User;

import java.util.Optional;

public class Demo01 {
    public static void main(String[] args) {
        User ted = new User("ted",19);
        Optional<User> user = Optional.ofNullable(ted);
        Optional<String> name = user.map(u -> u.getUsername()).map(n -> n.toUpperCase());
        System.out.println(name.get());
    }
}
