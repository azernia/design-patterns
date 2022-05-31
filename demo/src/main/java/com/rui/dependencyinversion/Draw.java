package com.rui.dependencyinversion;

import java.util.List;

/**
 * 抽奖
 */
public interface Draw {
    List<BetUser> prize(List<BetUser> list, int count);
}
