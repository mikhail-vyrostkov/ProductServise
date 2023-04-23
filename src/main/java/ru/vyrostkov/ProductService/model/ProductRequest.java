package ru.vyrostkov.ProductService.model;

import lombok.Data;

/**
 * Created by @m.vyrostkov on 23.04.2023 17:04
 */
@Data
public class ProductRequest {

    private String name;
    private long price;
    private long quantity;
}
