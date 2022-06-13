package com.rui.basic.group;

import com.rui.basic.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * description:
 * date: 2022/6/13 17:09
 *
 * @author rui
 */
public class ACT extends Game {

    private final Logger logger = LoggerFactory.getLogger(ACT.class);

    @Override
    protected void init() {
        logger.info("ACT game init...");
    }

    @Override
    protected void start() {
        logger.info("ACT game start...");
    }

    @Override
    protected void end() {
        logger.info("ACT game end...");
    }
}
