package ru.vyrostkov.ProductService.service;


import ru.vyrostkov.ProductService.model.ProductRequest;
import ru.vyrostkov.ProductService.model.ProductResponse;

/**
 * Created by @m.vyrostkov on 23.04.2023 16:47
 */
public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);
}
