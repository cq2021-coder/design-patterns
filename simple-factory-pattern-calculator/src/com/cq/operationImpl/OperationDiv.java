package com.cq.operationImpl;

import com.cq.Operation;

/**
 * 除法
 *
 * @author 程崎
 * @date 2022/06/02
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (getNumB() == 0) {
            throw new ArithmeticException("除数不能为0");
        }
        return getNumA() / getNumB();
    }
}
