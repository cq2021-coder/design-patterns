package com.cq;

/**
 * 具体中介
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class ConcreteMediator extends Mediator{
    public ConcreteMediator(Colleague colleagueTenant, Colleague colleagueLandlord) {
        super(colleagueTenant, colleagueLandlord);
    }

    @Override
    public boolean notifyColleagueTenant(String message) {
        if (colleagueTenant != null) {
            return colleagueTenant.operation(message);
        }
        return false;
    }

    @Override
    public boolean notifyColleagueLandlord(String message) {
        if (colleagueLandlord != null) {
            return colleagueLandlord.operation(message);
        }
        return false;
    }
}
