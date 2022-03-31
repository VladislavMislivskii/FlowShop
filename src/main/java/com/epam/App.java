package com.epam;

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


    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping
    public String hello(){
        return "Hello world";


    }
    @Override
    public void run(String... args) throws Exception{
           System.out.println("Request");
           RequestService.getAll().forEach(System.out::println);
    }

}
