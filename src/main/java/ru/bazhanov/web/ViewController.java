package ru.bazhanov.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.bazhanov.utils.StringUtils;


@Controller
public class ViewController {

    @GetMapping("/")
    public ModelAndView indexGet(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @PostMapping("/")
    public ModelAndView indexPost(String currentString){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("string",currentString);
        mv.addObject("charactersMap", StringUtils.accountingForCharactersInString(currentString));
        return mv;
    }
}
