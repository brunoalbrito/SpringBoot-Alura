package br.com.listvip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Configuracao {

    @RequestMapping("/")
    @ResponseBody
    String ola(){
        return "Olá, bem vindo ao sistema Lista VIPs";
    }


    public static void main(String[] args) {
        SpringApplication.run(Configuracao.class, args);
    }
}
