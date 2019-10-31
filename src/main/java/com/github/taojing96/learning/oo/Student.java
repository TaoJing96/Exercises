/**
 * @(#)Student.java, 10月 30, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.github.taojing96.learning.oo;

import java.util.*;

/**
 * @author tj
 */
public class Student extends Human{

    private int grade;
    private HashSet<Subject> choosenSubjects;
    private TreeMap<Subject, Integer> scores;
    private long sno;

    {
        choosenSubjects = new HashSet<>();
        scores = new TreeMap<>();
    }

    public Student() {
    }

    public Student(String name, int age, long sno, boolean isMale) {
        super(name, age, isMale);
        this.grade = grade;
        this.sno = sno;
    }

    public Student(String name, int age, long sno) {
        super(name, age);
        this.grade = grade;
        this.sno = sno;
    }

    public void sayName(){
        System.out.println("My name is " + getName());
    }

    public long getSno() {
        return sno;
    }

    public void setSno(long sno) {
        this.sno = sno;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public HashSet<Subject> getChoosenSubjects() {
        return choosenSubjects;
    }

    public void chooseSubject(Subject subject){
        if(subject != null){
            choosenSubjects.add(subject);
        }
    }

    public boolean judgeSubjectChoosenOrNot(Subject subject){
        return choosenSubjects.contains(subject);
    }

    public void addScore(Subject subject, int score){
        if(subject == null || score < 0 || score > 100 || !choosenSubjects.contains(subject)){
            return;
        }
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
        List<Subject> commonSubjects = new ArrayList<>();
        if(student == null){
            return commonSubjects;
        }
        for (Subject subject : student.choosenSubjects) {
            if(choosenSubjects.contains(subject)){
                commonSubjects.add(subject);
            }
        }
        return commonSubjects;
    }


}