package com.Group1;
import com.Group1.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication// автоматическая настройка

public class App implements CommandLineRunner { //запуск кода при запуске приложения
    @Autowired //Контроль зависимостей
    private ClientService clientService;


    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Client");
        clientService.getAll().forEach(System.out::println);

    }
}