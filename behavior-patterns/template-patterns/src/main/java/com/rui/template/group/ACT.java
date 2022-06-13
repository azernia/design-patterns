package com.rui.template.group;

import com.rui.template.AbstractGame;
import org.springframework.stereotype.Component;

/**
 * description:
 * date: 2022/6/13 17:42
 *
 * @author rui
 */
@Component("act")
public class ACT extends AbstractGame {
    @Override
    protected void init() {
        System.out.println("ACT game init...");
    }

    @Override
    protected void start() {
        System.out.println("ACT game start...");
    }

    @Override
    protected void end() {
        System.out.println("ACT game end...");
    }
}
