package com.epam.util;

import com.epam.dto.NewClientDTO;
import com.epam.dto.NewFlowerDTO;
import com.epam.entity.Client;
import com.epam.entity.Flower;

public class ConvertManager {

    public static Flower convert(NewFlowerDTO newFlowerDTO) {
        if (newFlowerDTO == null) {
            throw new IllegalArgumentException();
        }
        return new Flower(
                newFlowerDTO.getId(),
                newFlowerDTO.getName(),
                newFlowerDTO.getPrice(),
                newFlowerDTO.getAmount(),
                newFlowerDTO.getPhoto());
    }

    public static Client convert(NewClientDTO newClientDTO) {
        if (newClientDTO == null) {
            throw new IllegalArgumentException();
        }
        return new Client(
                newClientDTO.getId(),
                newClientDTO.getName(),
                newClientDTO.getSurname(),
                newClientDTO.getEmail(),
                newClientDTO.getPhone());
    }
}
