package com.cq.clothes;

import com.cq.clothes.concrete_decorator.*;

/**
 * 服装装饰
 * 装饰模式是为已有功能动态的添加更多功能的一种方式
 * 当系统需要新功能时，向旧的类中添加新的代码。这些新加的代码通常装饰了原有类的核心职责或主要行为
 * 如果新加入的功能仅仅是为了满足一些只在特定环境下执行的功能，那么使用装饰器功能包装原有的对象，当出现特殊情况时，可以有选择性，有顺序性的包装对象了
 * 有效的把类的核心职责和装饰功能分离开
 *
 * @author 程崎
 * @date 2022/06/06
 */
public class ClothesShow {
    public static void main(String[] args) {

        PersonComponent personComponent = new PersonComponent("程崎");

        System.out.println("第一种装扮：");

        TShirtDecorator tShirtDecorator = new TShirtDecorator();
        SportsTrousersDecorator sportsTrousersDecorator = new SportsTrousersDecorator();
        SportsShoesDecorator sportsShoesDecorator = new SportsShoesDecorator();

        tShirtDecorator.setPersonComponent(personComponent);
        sportsTrousersDecorator.setPersonComponent(tShirtDecorator);
        sportsShoesDecorator.setPersonComponent(sportsTrousersDecorator);
        sportsShoesDecorator.show();

        System.out.println("第二种装扮：");

        WesternStyleDecorator westernStyleDecorator = new WesternStyleDecorator();
        JeansDecorator jeansDecorator = new JeansDecorator();
        SportsShoesDecorator sportsShoesDecorator2 = new SportsShoesDecorator();

        westernStyleDecorator.setPersonComponent(personComponent);
        jeansDecorator.setPersonComponent(westernStyleDecorator);
        sportsShoesDecorator2.setPersonComponent(jeansDecorator);
        sportsShoesDecorator2.show();
    }
}
