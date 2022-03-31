//package com.epam;
//
//import com.epam.entity.Transport;
//import com.epam.service.ClientService;
//import com.epam.service.DecorationService;
//import com.epam.service.FlowerService;
//import com.epam.service.BouquetService;
//import com.epam.service.PositionService;
//import com.epam.service.ReqStatusService;
//import com.epam.service.TransportService;
//import com.epam.service.RequestService;
//import com.epam.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@SpringBootApplication
//@RestController
//public class App implements CommandLineRunner {
//    @Autowired
//    private ClientService clientService;
//    @Autowired
//    private PositionService positionService;
//    @Autowired
//    private FlowerService flowerService;
//    @Autowired
//    private DecorationService DecorationService;
//    @Autowired
//    private BouquetService BouquetService;
//    @Autowired
//    private ReqStatusService ReqStatusService;
//    @Autowired
//    private TransportService TransportService;
//    @Autowired
//    private RequestService RequestService;
//    @Autowired
//    private OrderService OrderService;
//
//
//    public static void main( String[] args ) {
//        SpringApplication.run(App.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//            System.out.println("Client");
//            clientService.getAll().forEach(System.out::println);
//          System.out.println("Position");
//
//              System.out.println("Order");
//              OrderService.getAll().forEach(System.out::println);
//
//        @GetMapping
//        public String hello() {
//            return ("Hello world");
//        }
//
//    }
//}