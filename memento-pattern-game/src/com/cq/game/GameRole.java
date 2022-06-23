package com.cq.game;

/**
 * 游戏角色
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/23
 */
public class GameRole {
    /**
     * 生命力
     */
    private int vit;

    /**
     * 攻击力
     */
    private int atk;

    /**
     * 防御力
     */
    private int def;

    /**
     * 魔法点，此属性不保存
     */
    private int magic;


    /**
     * 状态显示
     */
    public void stateDisplay() {
        System.out.println("角色当前状态：");
        System.out.println("体力：" + this.vit);
        System.out.println("攻击力：" + this.atk);
        System.out.println("防御力：" + this.def);
        System.out.println("魔法点：" + this.magic);
        System.out.println("");
    }


    /**
     * 保存角色状态
     *
     * @return {@link RoleStateMemento}
     */
    public RoleStateMemento saveState() {
        return (new RoleStateMemento(vit, atk, def));
    }


    /**
     * 恢复角色状态
     *
     * @param memento 纪念品
     */
    public void recoveryState(RoleStateMemento memento) {
        this.vit = memento.vit();
        this.atk = memento.atk();
        this.def = memento.def();
    }


    /**
     * 初始化状态
     */
    public void getInitState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
        this.magic = 100;
    }


    /**
     * 战斗
     */
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
        this.magic = 0;
    }
}
