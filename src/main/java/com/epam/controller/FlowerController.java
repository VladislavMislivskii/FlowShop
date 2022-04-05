package com.epam.controller;

import com.epam.dto.FlowerDTO;
import com.epam.dto.NewFlowerDTO;
import com.epam.entity.Flower;
import com.epam.service.FlowerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Flower")
public class FlowerController {

    private final FlowerService flowerService;

    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping()
    public List<FlowerDTO> getAll() {
        return flowerService.getAll();
    }

    @PostMapping() //Администирование
    public FlowerDTO create(@RequestBody NewFlowerDTO newFlowerDTO) {
        return flowerService.create(newFlowerDTO);
    }

    @DeleteMapping(path="/{id}")
    public void delete(@PathVariable Long id){
        flowerService.deleteById(id);
    }

    @GetMapping(path="/{id}") //Нужно отредачить
    public Optional<Flower> findById(@PathVariable(value = "id") Long flowerId) {
        return flowerService.findById(flowerId);
    }


}
