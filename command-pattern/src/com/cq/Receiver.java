package com.cq;

/**
 * 命令的接收和执行者类，并在action中接收和执行命令
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/05
 */
public class Receiver {
    public void action(String command) {
        System.out.println("\n接收到命令，开始执行命令" + command);
    }
}
