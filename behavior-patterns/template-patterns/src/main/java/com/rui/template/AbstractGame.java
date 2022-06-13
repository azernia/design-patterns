package com.rui.template;

/**
 * description:
 * date: 2022/6/13 17:34
 *
 * @author rui
 */
public abstract class AbstractGame {
    protected abstract void init();

    protected abstract void start();

    protected abstract void end();

    public final void play() {
        init();

        start();

        end();
    }
}
