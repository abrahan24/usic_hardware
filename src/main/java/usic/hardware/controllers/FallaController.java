package usic.hardware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import usic.hardware.models.dao.IFallaDao;
import usic.hardware.models.entity.Falla;
import usic.hardware.models.service.IFallaService;

@Controller
public class FallaController {
    
    @Autowired
    private IFallaService fallaService;

    @RequestMapping(value = "/add_Falla",method = RequestMethod.GET)
    public String add_Falla(Model model){
    model.addAttribute("falla", new Falla());
        return "Add_Falla";
    }

    //============================= Guardar =============================
    @RequestMapping(value = "/fallaF", method = RequestMethod.POST)
	public String fallaF(@Validated Falla falla, Model model) {
        falla.setEstado_falla("A");
        fallaService.save(falla);

		return "redirect:/add_Falla";
    }
}
