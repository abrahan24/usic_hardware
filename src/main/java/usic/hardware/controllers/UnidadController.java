package usic.hardware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import usic.hardware.models.entity.Unidad;
import usic.hardware.models.service.IPredioService;
import usic.hardware.models.service.IUnidadService;

@Controller
public class UnidadController {

    @Autowired
    private IUnidadService unidadService;
    @Autowired
    private IPredioService predioService;

    
    @RequestMapping(value = "/add_Unidad",method = RequestMethod.GET)
    public String add_Unidad(Model model){
    model.addAttribute("unidad", new Unidad());
    model.addAttribute("predios", predioService.findAll());
        return "Add_Unidad";
    }

    //============================= Guardar =============================
    @RequestMapping(value = "/unidadF", method = RequestMethod.POST)
	public String unidadF(@Validated Unidad unidad, Model model) {
        unidad.setEstado_unidad("A");
        unidadService.save(unidad);

		return "redirect:/add_Unidad";
    }
    //======Listar=======
    @RequestMapping(value = "/unidadL", method = RequestMethod.GET) // Pagina principal
    public String unidadL(Model model) {

        model.addAttribute("unidades", unidadService.findAll());
        model.addAttribute("predios", predioService.findAll());
        return "listarUnidad";
    }
}

