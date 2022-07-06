package com.cq;

/**
 * 中介者模式入口函数
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class MediatorMain {
    public static void main(String[] args) {
        //定义房客同事类
        Colleague colleagueTenant = new ColleagueTenant();
        //定义房东同事类
        Colleague colleagueLandlord = new ColleagueLandlord();
        //创建一个具体的中介
        ConcreteMediator concreteMediator = new ConcreteMediator(colleagueTenant, colleagueLandlord);
        if (concreteMediator.notifyColleagueTenant("想租2室1厅的吗？")) {
            concreteMediator.notifyColleagueLandlord("租客愿意");
        }else {
            concreteMediator.notifyColleagueLandlord("租客不愿意");
        }
    }
}
