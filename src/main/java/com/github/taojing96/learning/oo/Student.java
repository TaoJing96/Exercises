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
        scores = new TreeMap<Subject, Integer>((o1, o2) -> {
            if(o1.getCredit() < o2.getCredit()){
                return -1;
            }else if(o1.getCredit() > o2.getCredit()){
                return 1;
            }else{
                return 0;
            }
        });
    }

    public Student() {
    }

    public Student(String name, int age, long sno, boolean male) {
        super(name, age, male);
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

    @Override
    public boolean equals(Object o) {
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        return hashCode() == ((Student)o).hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sno, grade);
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
        StringBuilder transcript = new StringBuilder();
        transcript.append(getName()).append("成绩单为");
        for (Subject subject : subjects) {
            transcript.append(subject.getName()).append(":").append(scores.get(subject)).append("   ");
        }
        System.out.println(transcript);
    }

    public void printAllChoosenSubjects(){
        if(choosenSubjects.size() == 0){
            return;
        }
        StringBuilder allChoosenSubjects = new StringBuilder();
        allChoosenSubjects.append(getName()).append("所选课程为 --->");
        for (Subject choosenSubject : choosenSubjects) {
            allChoosenSubjects.append(choosenSubjects).append("   ");
        }
        System.out.println(allChoosenSubjects);
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