package com.cq;

/**
 * 命令
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/05
 */
public interface Command {
    /**
     * Command的执行方法
     *
     * @param command 命令
     */
    void execute(String command);
}
