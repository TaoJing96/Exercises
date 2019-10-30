/**
 * @(#)HelloWorld.java, Oct 21, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.github.taojing96.demo;

import com.github.taojing96.learning.oo.Student;
import com.github.taojing96.learning.oo.Subject;

/**
 * @author wugx
 */
public class HelloWorld {

    public static void main(String[] args) {
        Subject math = new Subject("数学", 001, 2);
        Subject chn = new Subject("语文", 002, 3);
        Subject eng = new Subject("英语", 003, 1);

        Student jack = new Student("jack", 21);
        Student lucy = new Student("lucy", 14);

        jack.addScore(math, 81);
        jack.addScore(eng, 90);
        jack.addScore(chn, 100);

        jack.printTranscript();
        jack.introduction();
    }

}