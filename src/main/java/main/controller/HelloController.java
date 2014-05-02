package main.controller;

import main.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author trkarlis (sezin.karli@eu.sony.com)
 * @since 3/19/14 3:42 PM
 *        User: Sezin Karli
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private HelloService service;

    @RequestMapping(value = "/{user}")
    public String handleOne(@PathVariable String user, ModelMap modelMap){
        String helloToken = service.sayHello() + " " + user;
        modelMap.put("token", helloToken);
        return "welcome-page";
    }
}
