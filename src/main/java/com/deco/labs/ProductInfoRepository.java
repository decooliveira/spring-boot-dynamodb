package com.deco.labs;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface ProductInfoRepository extends
        CrudRepository<ProductInfo, String> {

    Optional<ProductInfo> findById(String id);
}
