package com.lnzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ClassName：PayController
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/19 10:02
 * @Description:
 */
@Controller
@RequestMapping("/pay")
public class PayController {
    @GetMapping("/create")
    public ModelAndView create() {
        return new ModelAndView("create");
    }
}
