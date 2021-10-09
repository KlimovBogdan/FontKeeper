package com.epamHack.FontKeeper.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import static com.epamHack.FontKeeper.constants.EndPoints.*;

import com.epamHack.FontKeeper.services.FontService;

@RestController
public class FontController {

    private FontService fontService;

    @GetMapping(API_FONTS)
    public Set<FontDTO> getAllFonts() {
        return fontSevrise.findAll();
    }
}
