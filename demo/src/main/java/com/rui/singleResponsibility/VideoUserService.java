package com.rui.singleResponsibility;

/**
 * create date 2022/5/30 09:26
 *
 * @author rui
 */
public class VideoUserService {
    public void serveGrade(String userType) {
        if ("vip".equalsIgnoreCase(userType)) {
            System.out.println("VIP 1080p");
        } else if ("normal".equalsIgnoreCase(userType)) {
            System.out.println("normal 720p");
        } else if ("visitor".equalsIgnoreCase(userType)) {
            System.out.println("visitor 480p");
        }
    }
}
