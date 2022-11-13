package com.example.discography;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class DiscController {

    @Resource
    private DiscRepository discRepo;

    @RequestMapping("/discs")
    public String findAllDiscs(Model model) {
        model.addAttribute("discsModel", discRepo.findAll());
        return "discsTemplate";
    }

    @RequestMapping("/disc")
    public String findOneDisc(@RequestParam(value = "id") Long id, Model model) throws DiscNotFoundException {
        if(discRepo.findOne(id) == null) {
            throw new DiscNotFoundException();
        }

        model.addAttribute("discModel", discRepo.findOne(id));
        return "discTemplate";
    }

}
