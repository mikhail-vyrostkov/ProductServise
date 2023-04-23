package ru.vyrostkov.ProductService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vyrostkov.ProductService.entity.Product;

/**
 * Created by @m.vyrostkov on 23.04.2023 16:59
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
