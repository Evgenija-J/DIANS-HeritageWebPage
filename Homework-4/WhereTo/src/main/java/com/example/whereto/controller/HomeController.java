package com.example.whereto.controller;

import com.example.whereto.model.heritage_table;
import com.example.whereto.service.MonumentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/home")
public class HomeController {

    private MonumentService monumentService;

    public HomeController(MonumentService monumentService) {
        this.monumentService = monumentService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    ModelAndView index() {

        ModelAndView mav = new ModelAndView("home");

        ArrayList<heritage_table> monuments = monumentService.findAll();
        mav.addObject("monuments", monuments);

        return mav;

    }

}
