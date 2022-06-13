package com.rui.basic;

/**
 * description: 游戏模板
 * 定义游戏执行顺序
 * date: 2022/6/13 17:06
 *
 * @author rui
 */
public abstract class Game {
    /**
     * 初始化游戏
     */
    protected abstract void init();

    /**
     * 开始游戏
     */
    protected abstract void start();

    /**
     * 结束游戏
     */
    protected abstract void end();

    /**
     * 确保方法不会被重写
     */
    public final void play() {
        init();

        start();

        end();
    }
}
