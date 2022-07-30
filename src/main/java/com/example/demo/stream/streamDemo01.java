package com.example.demo.stream;

import com.example.demo.java8_interface.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamDemo01 {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("ted",27));
        userList.add(new User("robin",25));
        userList.add(new User("barney",30));

        Stream<User> distinct = userList.stream().distinct();


    }
}
