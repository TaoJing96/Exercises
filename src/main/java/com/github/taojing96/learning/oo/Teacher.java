package com.github.taojing96.learning.oo;

import java.util.HashSet;
/**
 * @author tj
 */
public class Teacher extends Human {

    private Department dept;
    private HashSet<Subject> teachingSubject;


    {
        teachingSubject = new HashSet<>();
    }

    public Teacher(){

    }

    public Teacher(String name, int age, Department dept) {
        super(name, age);
        this.dept = dept;
    }

    public Teacher(String name, int age, Boolean isMale, Department dept) {
        super(name, age, isMale);
        this.dept = dept;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public void addSubject(Subject subject){
        if(subject != null){
            teachingSubject.add(subject);
        }
    }

    private boolean judgeSubjectIsTeachedOrNot(Subject subject){
        return teachingSubject.contains(subject);
    }

    public static void main(String[] args) {
        System.out.println(new Teacher().getAge());
        System.out.println(new Teacher().judgeSubjectIsTeachedOrNot(null));
    }
}
