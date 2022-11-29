package usic.hardware.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("persona")
public class personaController {
    

    @RequestMapping(value = "/add_persona",method = RequestMethod.GET)
    public String add_Persona(Model model){

        return "Add_Persona";
    }
}
