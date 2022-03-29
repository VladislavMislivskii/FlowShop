package com.epam;

import com.epam.service.ClientService;
import com.epam.service.PositionService;
import com.epam.service.EmployeeService;
import com.epam.service.CourTypeService;
import com.epam.service.CourierService;
import com.epam.service.TransportService;
import com.epam.service.RouteService;
import com.epam.service.OrdStatusService;
import com.epam.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    @Autowired
    private ClientService clientService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private EmployeeService EmployeeService;
    @Autowired
    private CourTypeService CourTypeService;
    @Autowired
    private CourierService CourierService;
    @Autowired
    private TransportService TransportService;
    @Autowired
    private RouteService RouteService;
    @Autowired
    private OrdStatusService OrdStatusService;
    @Autowired
    private OrderService OrderService;


    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("Client");
//        clientService.getAll().forEach(System.out::println);

//        System.out.println("Position");
//        positionService.getAll().forEach(System.out::println);

//        productService.add(new Product("candy", 150));
//        System.out.println("Product after");
//        productService.getAll().forEach(System.out::println);
//        System.out.println("Employee");
//        EmployeeService.getAll().forEach(System.out::println);
//                System.out.println("COURTYPE");
//        CourTypeService.getAll().forEach(System.out::println);

//        System.out.println("COUR");
//        CourierService.getAll().forEach(System.out::println);

//        System.out.println("Transport");
//        TransportService.getAll().forEach(System.out::println);

//        System.out.println("Route");
//        RouteService.getAll().forEach(System.out::println);

//        System.out.println("ordStatus");
//        OrdStatusService.getAll().forEach(System.out::println);

        System.out.println("Order");
        OrderService.getAll().forEach(System.out::println);

    }
}
