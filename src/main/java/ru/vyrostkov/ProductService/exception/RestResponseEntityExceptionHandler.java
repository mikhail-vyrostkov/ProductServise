package ru.vyrostkov.ProductService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.vyrostkov.ProductService.model.ErrorResponse;

/**
 * Created by @m.vyrostkov on 24.04.2023 10:39
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ProductServiceCustomException.class)
    public ResponseEntity<ErrorResponse> handleProductException(ProductServiceCustomException exception) {
    return new ResponseEntity<>(new ErrorResponse().builder()
            .errorMessage(exception.getMessage())
            .errorCode(exception.getErrorCode())
            .build(), HttpStatus.NOT_FOUND);
    }
}
