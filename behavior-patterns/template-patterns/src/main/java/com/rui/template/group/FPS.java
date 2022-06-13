package com.rui.template.group;

import com.rui.template.AbstractGame;
import org.springframework.stereotype.Component;

/**
 * description:
 * date: 2022/6/13 17:42
 *
 * @author rui
 */
@Component("fps")
public class FPS extends AbstractGame {
    @Override
    protected void init() {
        System.out.println("FPS game init...");
    }

    @Override
    protected void start() {
        System.out.println("FPS game start...");
    }

    @Override
    protected void end() {
        System.out.println("FPS game end...");
    }
}
