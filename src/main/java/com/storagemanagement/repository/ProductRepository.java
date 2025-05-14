package com.storagemanagement.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.storagemanagement.model.ProductModel;

@Repository
public interface ProductRepository  extends JpaRepository<ProductModel, UUID>{

}
