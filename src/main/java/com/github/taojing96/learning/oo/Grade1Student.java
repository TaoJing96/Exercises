/**
 * @(#)Grade1Student.java, 10月 30, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.github.taojing96.learning.oo;

/**
 * @author wugx
 */
public class Grade1Student extends Student {

    public Grade1Student(String name, int age) {
        super(name, age);
        this.setGrade(1);
    }

    @Override
    public void sayName() {
        System.out.println("你好，我的名字叫" + getName());;
    }

    public static void main(String[] args) {
        Grade1Student grade1Student = new Grade1Student("", 1);
        int grade = grade1Student.getGrade();
    }
}