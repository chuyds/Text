package com.company;

public class Person {
    int age = 0;
    int len;
    String name = "哈哈哈";

    public int getAge() {
        return age;
    }

    public int getLen() {
        return len;
    }

    public String getName() {
        return name;
    }
    Person(int age, int len) {
        this.age = age;
        this.len = len;
    }

    Person(int age, int len, String name) {
        this.age = age;
        this.len = len;
        this.name = name;
    }

    Person() {

    }

    public void printString() {
        System.out.println(age + " " + len + " " + name);
    }
}
