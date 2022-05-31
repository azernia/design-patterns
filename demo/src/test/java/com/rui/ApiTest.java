package com.rui;

import com.alibaba.fastjson.JSON;
import com.rui.dependencyinversion.BetUser;
import com.rui.dependencyinversion.DrawController;
import com.rui.dependencyinversion.DrawRandom;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rui
 * @description
 * @date 2022/5/31 14:13
 */
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void testDependencyInversion() {
        List<BetUser> betUserList = new ArrayList<>();
        betUserList.add(new BetUser("花花", 65));
        betUserList.add(new BetUser("豆豆", 43));
        betUserList.add(new BetUser("小白", 72));
        betUserList.add(new BetUser("笨笨", 89));
        betUserList.add(new BetUser("丑蛋", 10));
        DrawController drawController = new DrawController();
        List<BetUser> prizeRandomUserList = drawController.doDraw(new DrawRandom(), betUserList, 3);
        logger.info("随机抽奖，中奖用户名单：{}", JSON.toJSON(prizeRandomUserList));
    }
}
