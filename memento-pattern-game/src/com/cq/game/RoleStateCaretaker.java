package com.cq.game;

/**
 * 角色状态管理者
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/23
 */
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
