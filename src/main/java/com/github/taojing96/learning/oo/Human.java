package com.github.taojing96.learning.oo;
/**
 * @author tj
 */
public abstract class Human {
    private String name;
    private int age;
    private Boolean isMale;

    public Human(){

    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.isMale = true;
    }

    public Human(String name, int age, Boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
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
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public void introduction(){
        System.out.println("你好，我叫" + name + "今年" + age + "岁");
    }
}
