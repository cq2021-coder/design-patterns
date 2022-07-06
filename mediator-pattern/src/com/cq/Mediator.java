package com.cq;

/**
 * 本类持有租客和房东类的实例
 * 定义了notifyColleagueTenant和notifyColleagueLandlord分别向房客和房东传递信息
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public abstract class Mediator {
    protected Colleague colleagueTenant;

    protected Colleague colleagueLandlord;

    public Mediator(Colleague colleagueTenant, Colleague colleagueLandlord) {
        this.colleagueTenant = colleagueTenant;
        this.colleagueLandlord = colleagueLandlord;
    }

    /**
     * 通知租户
     *
     * @param message 消息
     * @return boolean
     */
    public abstract boolean notifyColleagueTenant(String message);

    /**
     * 通知房东
     *
     * @param message 消息
     * @return boolean
     */
    public abstract boolean notifyColleagueLandlord(String message);
}
