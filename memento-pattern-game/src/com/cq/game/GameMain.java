package com.cq.game;

/**
 * 备忘录模式示例入口
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/23
 */
public class GameMain {
    public static void main(String[] args) {
        //大战，前三项指标都为100
        GameRole gameRole = new GameRole();
        gameRole.getInitState();
        gameRole.stateDisplay();

        //保存进度
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(gameRole.saveState());

        //战斗后
        gameRole.fight();
        gameRole.stateDisplay();

        //恢复之前的状态(魔法点不存档)
        gameRole.recoveryState(caretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
