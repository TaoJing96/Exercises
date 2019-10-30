package com.github.taojing96.learning.oo;

public class Subject implements Comparable<Subject>{
    private String name;
    private int subjectId;
    private int credit;

    public Subject(){

    }

    public Subject(String name, int subjectId, int credit) {
        this.name = name;
        this.subjectId = subjectId;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public int compareTo(Subject sub) {
        if(this.credit < sub.credit){
            return -1;
        }else if(this.credit > sub.credit){
            return 1;
        }else{
            return 0;
        }
    }
}
