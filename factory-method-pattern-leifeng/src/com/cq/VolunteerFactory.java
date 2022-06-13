package com.cq;

/**
 * 志愿者工厂
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public class VolunteerFactory implements LeiFengFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
