package com.rui.basic;

import com.rui.basic.group.FPS;

/**
 * description:
 * date: 2022/6/13 17:14
 *
 * @author rui
 */
public class TestMain {
    public static void main(String[] args) {
        Game game = new FPS();
        game.play();
    }
}
