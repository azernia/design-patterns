package com.rui.dependencyinversion;

import java.util.List;

/**
 * @author rui
 * @description
 * @date 2022/5/31 14:04
 */
public class DrawController {
    private Draw draw;

    public List<BetUser> doDraw(Draw draw, List<BetUser> betUserList, int count) {
        return draw.prize(betUserList, count);
    }
}
