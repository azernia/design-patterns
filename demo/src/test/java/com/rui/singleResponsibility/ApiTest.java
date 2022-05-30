package com.rui.singleResponsibility;

/**
 * create date 2022/5/30 09:30
 *
 * @author rui
 */
public class ApiTest {
    public static void main(String[] args) {
        VideoUserService videoUserService = new VideoUserService();
        videoUserService.serveGrade("vip");
        videoUserService.serveGrade("normal");
        videoUserService.serveGrade("visitor");
    }
}
