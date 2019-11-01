package com.github.taojing96.learning.oo;

import java.util.HashSet;
import java.util.Objects;

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

    public Teacher(String name, int age, Boolean male, Department dept) {
        super(name, age, male);
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

    @Override
    public boolean equals(Object o) {
        if(o == null || o.getClass() != getClass()){
            return false;
        }
        return hashCode() == ((Teacher)o).hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dept);
    }
}
