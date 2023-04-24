package ru.vyrostkov.ProductService.exception;

import lombok.Data;

/**
 * Created by @m.vyrostkov on 24.04.2023 10:33
 */
@Data
public class ProductServiceCustomException extends RuntimeException {
    private String errorCode;

    public ProductServiceCustomException(String massage, String errorCode) {
        super(massage);
        this.errorCode = errorCode;
    }
}
