package br.com.listvip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;

import javax.sql.DataSource;
import java.sql.DriverManager;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Configuracao {

//    @RequestMapping("/")
//    @ResponseBody
//    String ola(){
//        return "Olá, bem vindo ao sistema Lista VIPs";
//    }


    public static void main(String[] args) {

        SpringApplication.run(Configuracao.class, args);
    }

    @Bean
    public DataSource dataSource(){

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/listavip");
        dataSource.setUsername("username");
        dataSource.setPassword("password");

        return dataSource;
    }
}
