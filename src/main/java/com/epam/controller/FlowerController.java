package com.epam.controller;

import com.epam.entity.Flower;
import com.epam.service.FlowerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/flowers")
public class FlowerController {

    private final FlowerService flowerService;

    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping()
    public List<Flower> getAll() {
        return flowerService.getAll();
    }

    @PostMapping()
    public List<Flower> create(@RequestBody Flower flower) {
        flowerService.create(flower);
        return flowerService.list();
    }

}
