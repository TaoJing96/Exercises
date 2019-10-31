package com.github.taojing96.learning.oo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/**
 * @author tj
 */
public class Department {
    private String name;
    private int deptId;
    private HashSet<Teacher> teachers;

    {
        teachers = new HashSet<>();
    }

    public Department(String name, int deptId) {
        this.name = name;
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public void addTeacher(Teacher teacher){
        if(teacher != null){
            teachers.add(teacher);
        }
    }

    public boolean judgeTeacherInOrNot(Teacher teacher){
        if(teacher == null){
            return false;
        }
        return teachers.contains(teacher);
    }

    public List<Teacher> getTeachers(){
        return new ArrayList<>(this.teachers);
    }
}
