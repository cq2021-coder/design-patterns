package com.cq.clothes;

/**
 * 服饰（Decorator）
 *
 * @author 程崎
 * @date 2022/06/06
 */
public class FineryDecorator extends PersonComponent{
    private PersonComponent personComponent;

    public void setPersonComponent(PersonComponent personComponent) {
        this.personComponent = personComponent;
    }

    @Override
    public void show() {
        if (personComponent != null) {
            personComponent.show();
        }
    }
}
