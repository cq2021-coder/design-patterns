package com.cq.abstract_interface;

import com.cq.entity.User;

/**
 * 用户接口
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/17
 */
public interface UserInterface {
    /**
     * 插入
     *
     * @param user 用户
     */
    void insert(User user);

    /**
     * 获取用户
     *
     * @param id id
     * @return {@link User}
     */
    User getUser(int id);

}
