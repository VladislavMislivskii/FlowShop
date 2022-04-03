package com.epam;

import com.epam.service.BouquetService;
import com.epam.service.FlowerService;
import com.epam.service.BouqcompflowService;
import com.epam.service.ReqproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.epam.service.RequestService;


@SpringBootApplication
@RestController

public class App implements CommandLineRunner {
    @Autowired
    private RequestService RequestService;
    @Autowired
    private FlowerService FlowerService;
    @Autowired
    private BouquetService BouquetService;
    @Autowired
    private ReqproductService ReqproductService;



    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping
    public String hello(){
        return "Hello world";


    }
    @Override
    public void run(String... args) throws Exception{
    }

}
