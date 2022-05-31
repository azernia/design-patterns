package com.rui.dependencyinversion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author rui
 * @description 随机抽奖
 * @date 2022/5/31 14:06
 */
public class DrawRandom implements Draw{
    @Override
    public List<BetUser> prize(List<BetUser> list, int count) {
        // 集合数量很小直接返回
        if (list.size() <= count) return list;
        // 乱序集合
        Collections.shuffle(list);
        // 取出指定数量的中奖用户
        List<BetUser> prizeList = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            prizeList.add(list.get(i));
        }
        return prizeList;
    }
}
