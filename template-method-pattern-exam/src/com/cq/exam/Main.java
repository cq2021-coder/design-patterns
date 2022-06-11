package com.cq.exam;

/**
 * 模板方法例子
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/11
 */
public class Main {
    public static void main(String[] args) {
        TestPaper testPaper;

        //甲抄的试卷
        testPaper = new TestPaperA();
        testPaper.testQuestion1();
        testPaper.testQuestion2();
        testPaper.testQuestion3();

        //乙抄的试卷
        testPaper = new TestPaperB();
        testPaper.testQuestion1();
        testPaper.testQuestion2();
        testPaper.testQuestion3();

    }
}
