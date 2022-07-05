package com.cq;

/**
 * 调用者Invoker
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/05
 */
public class Invoker {
    private final Command command;

    private static boolean flag = true;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(String commandMessage) {
        System.out.print("发送命令");

        new Thread(() -> {
            while (flag) {
                System.out.print(".");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"Command").start();
        try {
            Thread.sleep(3000);
            flag = false;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        command.execute(commandMessage);
    }
}
