package com.rui.template.controller;

import com.rui.template.AbstractGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 * date: 2022/6/13 17:46
 *
 * @author rui
 */
@RestController
public class TemplateController {
    private AbstractGame abstractGame;

    @Autowired @Qualifier("act")
    public void setAbstractGame(AbstractGame abstractGame) {
        this.abstractGame = abstractGame;
    }

    @GetMapping("/fps")
    public String fps() {
        abstractGame.play();
        return "success";
    }
}
