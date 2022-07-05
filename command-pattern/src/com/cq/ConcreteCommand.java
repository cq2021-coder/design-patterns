package com.cq;

/**
 * Command的实现类
 * 本类持有命令接收和执行者Receiver的实例
 * 实现类Command接口中的execute方法
 * 具体操作是在ConcreteCommand接收到命令后，调用Receiver的action方法将命令交给Receiver执行
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/05
 */
public class ConcreteCommand implements Command{

    private final Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String command) {
        receiver.action(command);
    }
}
