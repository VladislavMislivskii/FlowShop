package com.epam.util;

import com.epam.entity.Client;

public class ConvertManager {

    public static Client convert(Client newClientDTO) {
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
