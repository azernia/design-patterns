package com.rui.dependencyinversion;

/**
 * @author rui
 * @description 投注用户
 * @date 2022/5/31 14:01
 */
public class BetUser {
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户权重
     */
    private int userWeight;

    public BetUser(String username, int userWeight) {
        this.username = username;
        this.userWeight = userWeight;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }
}
