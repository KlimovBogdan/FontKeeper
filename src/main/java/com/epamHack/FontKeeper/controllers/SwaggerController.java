package com.epamHack.FontKeeper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.epamHack.FontKeeper.constants.EndPoints.*;

@Controller
public class SwaggerController {

    @RequestMapping(value = SWAGGER_URL_REDIRECT)
    public String swaggerHtml() {
        return "redirect:" + SWAGGER_URL;
    }
}

