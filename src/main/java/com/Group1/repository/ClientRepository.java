package com.Group1.repository;

import com.Group1.entity.Client; //Подключаем объект
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends CrudRepository<Client, String> { //указываем, что мы будем манипулировать с данными
}
