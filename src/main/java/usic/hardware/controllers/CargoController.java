package usic.hardware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import usic.hardware.models.entity.Cargo;
import usic.hardware.models.service.ICargoService;

@Controller
//@RequestMapping("cargo")
public class CargoController {

    @Autowired
    private ICargoService cargoService;
    
    @RequestMapping(value = "/add_Cargo",method = RequestMethod.GET)
    public String add_Cargo(Model model){
    model.addAttribute("cargo", new Cargo());
        return "Add_Cargo";
    }

    //============================= Guardar =============================
    @RequestMapping(value = "/cargoF", method = RequestMethod.POST)
	public String cargoF(@Validated Cargo cargo, Model model) {
        cargo.setEstado_cargo("A");
        cargoService.save(cargo);

		return "redirect:/add_Cargo";
    }
}
