package com.base;

import com.base.strategy.impl.OpAdd;

/**
 * description:
 * date: 2022/6/10 17:27
 *
 * @author rui
 */
public class TestMain {
    public static void main(String[] args) {
        Execute execute = new Execute(new OpAdd());
        System.out.println("execute.execute(1, 2) = " + execute.execute(1, 2));
    }
}
