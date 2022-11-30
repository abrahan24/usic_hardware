package usic.hardware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import usic.hardware.models.entity.Predio;
import usic.hardware.models.service.IPredioService;

@Controller
public class PredioController {
    
    @Autowired
    private IPredioService predioService;

    @RequestMapping(value = "/add_Predio",method = RequestMethod.GET)
    public String add_Cargo(Model model){
    model.addAttribute("predio", new Predio());
        return "Add_Predio";
    }

    //============================= Guardar =============================
    @RequestMapping(value = "/predioF", method = RequestMethod.POST)
	public String predioF(@Validated Predio predio, Model model) {
        predio.setEstado_predio("A");
        predioService.save(predio);

		return "redirect:/add_Predio";
    }
    //======Listar=======
    @RequestMapping(value = "/predioL", method = RequestMethod.GET) // Pagina principal
    public String predioL(Model model) {
        
        model.addAttribute("predios", predioService.findAll());
        return "listarPredio";
    }
    
}
