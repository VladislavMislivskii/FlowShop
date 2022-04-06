package com.epam.service;

import com.epam.dto.FlowerDTO;
import com.epam.dto.NewFlowerDTO;
import com.epam.entity.Flower;
import com.epam.repository.FlowerRepository;
import com.epam.util.ConvertManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
public class FlowerService {
    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<FlowerDTO> getAll() {
        Iterable<Flower> queryResult = flowerRepository.findAll();

        return StreamSupport.stream(queryResult.spliterator(), false)
                .map(FlowerDTO::new)
                .collect(Collectors.toList());
    }

    public FlowerDTO create(NewFlowerDTO newFlowerDTO) {
        flowerRepository.save(ConvertManager.convert(newFlowerDTO)).getId();
        Flower queryResult = flowerRepository.findFirstByOrderByIdDesc();
        FlowerDTO flowerDTO = new FlowerDTO(queryResult);
        return flowerDTO;
    }



    public void deleteById(Long id) {
        flowerRepository.deleteById(id);
    }

    public FlowerDTO findById(Long flowerId) {

        Flower queryResult = flowerRepository.findById(flowerId);
        FlowerDTO flowerDTO = new FlowerDTO(queryResult);
        return flowerDTO;
    }

}
