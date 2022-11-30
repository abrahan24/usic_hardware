package usic.hardware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import usic.hardware.models.entity.Equipo;
import usic.hardware.models.entity.Unidad;
import usic.hardware.models.service.IEquipoService;
import usic.hardware.models.service.ITipoEquipoService;

@Controller
public class EquipoController {

    @Autowired
    private IEquipoService equipoService;
    @Autowired
    private ITipoEquipoService tipoEquipoService;

    //==========Mostrar Html=========
    @RequestMapping(value = "/add_Equipo",method = RequestMethod.GET)
    public String add_Equipo(Model model){
    model.addAttribute("equipo", new Equipo());
    model.addAttribute("tipoEquipos", tipoEquipoService.findAll());
        return "Add_Equipo";
    }

    //============================= Guardar =============================
    @RequestMapping(value = "/equipoF", method = RequestMethod.POST)
	public String equipoF(@Validated Equipo equipo, Model model) {
    equipo.setEstado_equipo("A");
    equipoService.save(equipo);
    

		return "redirect:/add_Equipo";
    }
    //======Listar=======
    @RequestMapping(value = "/equipoF", method = RequestMethod.GET) // Pagina principal
    public String equipoF(Model model) {
        
        model.addAttribute("equipos", equipoService.findAll());
        return "listarEquipo";
    }
    
}
