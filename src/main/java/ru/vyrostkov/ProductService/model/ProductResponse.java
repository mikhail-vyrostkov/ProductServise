package ru.vyrostkov.ProductService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by @m.vyrostkov on 23.04.2023 18:00
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private String productName;
    private long productId;
    private long price;
    private long quantity;
}
