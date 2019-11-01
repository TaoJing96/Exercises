package com.github.taojing96.learning.oo;

import java.util.Objects;

/**
 * @author tj
 */

public abstract class Human {
    private String name;
    private int age;
    private Boolean male;

    public Human(){

    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.male = true;
    }

    public Human(String name, int age, Boolean isMale) {
        this.name = name;
        this.age = age;
        this.male = isMale;
    }

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

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        male = male;
    }

    public void introduction(){
        System.out.println("你好，我叫" + name + "今年" + age + "岁");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        return hashCode() == ((Human)o).hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, male);
    }
}
