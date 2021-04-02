package com.guitarsales.guitarsale.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guitar")
public class Controller {

    @GetMapping("/selam")
    public String dondur()
    {
        return "selam";
    }
}
