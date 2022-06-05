package com.cq;

import com.cq.operationImpl.OperationAdd;
import com.cq.operationImpl.OperationDel;
import com.cq.operationImpl.OperationDiv;
import com.cq.operationImpl.OperationMul;

/**
 * 工厂操作
 *
 * @author 程崎
 * @date 2022/06/02
 */
public class OperationFactory {
    public static Operation createOperation(String operate) {
        return switch (operate) {
            case "+" -> new OperationAdd();
            case "-" -> new OperationDel();
            case "*" -> new OperationMul();
            case "/" -> new OperationDiv();
            default -> throw new NullPointerException("此操作符不存在");
        };
    }
}
