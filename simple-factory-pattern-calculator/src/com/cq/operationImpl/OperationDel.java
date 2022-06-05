package com.cq.operationImpl;

import com.cq.Operation;

/**
 * 减法
 *
 * @author 程崎
 * @date 2022/06/02
 */
public class OperationDel extends Operation {

    @Override
    public double getResult() {
        return getNumA() - getNumB();
    }
}
