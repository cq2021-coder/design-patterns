package com.cq.exam;

/**
 * 试卷A
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/11
 */
public class TestPaperA extends TestPaper{
    @Override
    String answer1() {
        return "a";
    }

    @Override
    String answer2() {
        return "c";
    }

    @Override
    String answer3() {
        return "b";
    }
}
