package com.ELane;

/**
 * Created by User on 4/19/2017.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(path="/demo")
public class GreetingController {
    @Autowired
    private ConsumerRepository consumerRepository;

    //@RequestMapping("/greeting")@ResponseBody
    @GetMapping(path="/signup")
    public String signup() {
        return "signup";
    }

   /* @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false) Consumer name, Model model) {
        List<Consumer> list=consumerRepository.findByUsernameAndPassword("rr","rr");
        name=list.get(0);
         model.addAttribute("name", name);
        return "greeting";
    }*/
    @RequestMapping("/greeting")
    public String showAllStudent(Model model) {
        Iterable<Consumer> allStudents = consumerRepository.findAll();
        model.addAttribute("allStudent", allStudents);
        return "call";
    }

}