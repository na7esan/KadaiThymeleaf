package com.sutaruhin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {
//	postOutput
    @PostMapping("/output")
    public String postOutput(@RequestParam("val") String val, Model model) {
        model.addAttribute("msg", "入力された値は「" + val + "」です。");
        model.addAttribute("val", val);
        return "output";
    }

}
