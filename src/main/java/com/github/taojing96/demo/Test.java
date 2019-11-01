/**
 * @(#)HelloWorld.java, Oct 21, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.github.taojing96.demo;

import com.github.taojing96.learning.oo.Department;
import com.github.taojing96.learning.oo.Student;
import com.github.taojing96.learning.oo.Subject;
import com.github.taojing96.learning.oo.Teacher;

import java.util.List;

/**
 * @author tj
 */

public class Test {

    public static void main(String[] args) {
        /*
        * 定义课程信息
        * */
        System.out.println("assd".concat("as"));
        Subject math = new Subject("数学", 001, 2);
        Subject chn = new Subject("语文", 002, 3);
        Subject eng = new Subject("英语", 003, 1);

        /*
         * 定义学生,老师信息
         * */
        Student jack = new Student("jack", 21, 201729373);
        Student lucy = new Student("lucy", 14, 201742434,false);
        Teacher mike = new Teacher("mike", 30, true, new Department("信息系", 101));
        /*
         * 学生选课
         * */

        jack.chooseSubject(math);
        jack.chooseSubject(eng);
        lucy.chooseSubject(eng);
        lucy.chooseSubject(chn);
        /*
         * 老师教课
         * */
        mike.addSubject(math);

        /*
         * 记录分数
         * */
        jack.addScore(math, 81);
        jack.addScore(eng, 90);
        lucy.addScore(chn, 88);
        lucy.addScore(eng, 100);

        /*
         * 查看2个人都选了的课
         * */

        List<Subject> commonSubjects = jack.getCommonSubjects(lucy);
        if(commonSubjects.size() > 0) {
            System.out.print(jack.getName() + "与" + lucy.getName() + "都选了 ");
            for (Subject commonSubject : commonSubjects) {
                System.out.print(commonSubject.getName() + " ");
            }
            System.out.println();
        }

        /*
         * 打印成绩单
         * */
        jack.printTranscript();
        lucy.printTranscript();
    }

}