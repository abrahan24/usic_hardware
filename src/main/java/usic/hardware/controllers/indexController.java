package usic.hardware.controllers;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/index")
public class indexController {


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String Login(Model model ){

        return "";

    }
}
