package com.github.taojing96.learning.oo;

import java.util.Objects;

/**
 * @author tj
 */

public class Subject {
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
    public boolean equals(Object obj) {
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        return hashCode() == ((Subject)obj).hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, credit, subjectId);
    }
}
