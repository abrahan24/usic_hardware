package usic.hardware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import usic.hardware.models.entity.TipoEquipo;
import usic.hardware.models.service.ITipoEquipoService;

@Controller
public class TipoEquipoController {
    
    @Autowired
    private ITipoEquipoService tipoEquipoService;


    //====== Muestra en html
    @RequestMapping(value = "/add_TipoEquipo",method = RequestMethod.GET)
    public String add_TipoEquipo(Model model){
    model.addAttribute("tipoEquipo", new TipoEquipo());
        return "Add_TipoEquipo";
    }

    //============================= Guardar =============================
    @RequestMapping(value = "/TipoEquipoF", method = RequestMethod.POST)
	public String tipoEquipoF(@Validated TipoEquipo tipoEquipo, Model model) {
        tipoEquipo.setEstado_tipoequipo("A");
        tipoEquipoService.save(tipoEquipo);
        

		return "redirect:/add_TipoEquipo";
    }

     //======Listar=======
    @RequestMapping(value = "/TipoEquipoF", method = RequestMethod.GET) // Pagina principal
    public String tipoEquipoF(Model model) {

        model.addAttribute("tipoEquipos", tipoEquipoService.findAll());
        return "listarTipoEquipo";
    }

}
