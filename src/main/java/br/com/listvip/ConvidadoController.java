package br.com.listvip;

import br.com.listvip.model.Convidado;
import br.com.listvip.repository.ConvidadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConvidadoController {


    @Autowired
    private ConvidadosRepository repository;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("listaconvidados")
    public String listaConvidados(Model model){

        Iterable<Convidado> convidados =  repository.findAll();

        model.addAttribute("convidados", convidados);

        return "listaconvidados";
    }
}
