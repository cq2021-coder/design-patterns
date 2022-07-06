package com.cq;

/**
 * 包含解释器之外的一些全局信息
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class Context {
    private String input;
    private String output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
