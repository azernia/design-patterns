package com.rui.interfaceSegregation.impl;

import com.rui.interfaceSegregation.SkillArchery;
import com.rui.interfaceSegregation.SkillInvisible;
import com.rui.interfaceSegregation.SkillSilent;

/**
 * create date 2022/5/31 13:57
 *
 * @author rui
 */
public class HeroHouYi implements SkillArchery, SkillInvisible, SkillSilent {
    @Override
    public void doArchery() {
        System.out.println("后裔的灼日之矢");
    }

    @Override
    public void doInvisible() {
        System.out.println("后裔的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("后裔的沉默技能");
    }
}
