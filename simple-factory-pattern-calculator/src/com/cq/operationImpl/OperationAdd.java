package com.cq.operationImpl;

import com.cq.Operation;

/**
 * 加法
 *
 * @author 程崎
 * @date 2022/06/02
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getNumA() + getNumB();
    }
}
