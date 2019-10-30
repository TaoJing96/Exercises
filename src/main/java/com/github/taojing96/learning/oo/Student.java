/**
 * @(#)Student.java, 10月 30, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.github.taojing96.learning.oo;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author tj
 */
public class Student extends Human{

    private int grade;
    private List<Subject> choosenSubjects;
    private TreeMap<Subject, Integer> scores;

    {
        choosenSubjects = new LinkedList<>();
        scores = new TreeMap<>();
    }

    public Student() {
    }

    public Student(String name, int age) {
        super.setAge(age);
        super.setName(name);
    }

    public Student(String name, int grade, int age, boolean isMale) {
        this.grade = grade;
        super.setAge(age);
        super.setName(name);
        super.setMale(isMale);
    }

    public void sayName(){
        System.out.println("My name is " + getName());
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public List<Subject> getChoosenSubjects() {
        return choosenSubjects;
    }

    public void chooseSubject(Subject subject){
        if(!choosenSubjects.contains(subject)){
            choosenSubjects.add(subject);
        }
    }

    public boolean judgeSubjectChoosenOrNot(Subject subject){
        return choosenSubjects.contains(subject);
    }

    public void addScore(Subject subject, int score){
        scores.put(subject, score);
    }

    public void printTranscript(){
        if(scores.size() == 0){
            return;
        }
        Set<Subject> subjects = scores.keySet();
        System.out.print(this.getName() + "成绩单为 -->");
        for (Subject subject : subjects) {
            System.out.print(subject.getName() + ":" + scores.get(subject) + "  ");
        }
        System.out.println();
    }

    public void printAllChoosenSubjects(){
        if(choosenSubjects.size() == 0){
            return;
        }
        System.out.print(getName() + "所选课程为 --->");
        for (Subject choosenSubject : choosenSubjects) {
            System.out.print(choosenSubjects + "  ");
        }
    }

    public List<Subject> getCommonSubjects(Student student){
        List<Subject> commonSubjects = new LinkedList<>();
        if(student == null){
            return commonSubjects;
        }
        for (Subject subject : student.getChoosenSubjects()) {
            if(choosenSubjects.contains(subject)){
                commonSubjects.add(subject);
            }
        }
        return commonSubjects;
    }


}