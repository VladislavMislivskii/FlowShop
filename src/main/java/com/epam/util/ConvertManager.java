package com.epam.util;

import com.epam.dto.NewClientDTO;
import com.epam.dto.NewFlowerDTO;
import com.epam.dto.NewRequestDTO;
import com.epam.entity.Client;
import com.epam.entity.Flower;
import com.epam.entity.ReqStatus;
import com.epam.entity.Request;

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

    public static Request convert(NewRequestDTO newRequestDTO) {
        if (newRequestDTO == null) {
            throw new IllegalArgumentException();
        }
        return new Request(
                newRequestDTO.getId(),
                new Client(newRequestDTO.getClientId()),
                new ReqStatus(newRequestDTO.getReqStatusId()),
                newRequestDTO.getAddress(),
                newRequestDTO.getShipping_cost(),
                newRequestDTO.getCost(),
                newRequestDTO.isPaid(),
                newRequestDTO.getDelivery_time());

    }
}
