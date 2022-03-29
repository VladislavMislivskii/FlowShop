package com.epam;

import com.epam.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    @Autowired
    private ClientService clientService;


    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Client");
        clientService.getAll().forEach(System.out::println);

//        productService.add(new Product("candy", 150));
//        System.out.println("Product after");
//        productService.getAll().forEach(System.out::println);

    }
}
