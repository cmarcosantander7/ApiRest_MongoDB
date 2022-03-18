package com.ms.crud.repository;

import com.ms.crud.models.ProductoDTO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDAO extends MongoRepository<ProductoDTO, String> {

}
