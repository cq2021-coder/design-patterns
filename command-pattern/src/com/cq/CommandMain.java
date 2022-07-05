package com.cq;

/**
 * 命令模式启动类
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/05
 */
public class CommandMain {
    public static void main(String[] args) {
        //定义命令的接收和执行者
        Receiver receiver = new Receiver();
        //定义命令实现类
        Command command = new ConcreteCommand(receiver);
        //定义命令调用者
        Invoker invoker = new Invoker(command);
        //命令调用
        invoker.action("command");
    }
}
