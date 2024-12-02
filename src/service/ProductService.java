package service;

import repository.ProductRepository;

public class ProductService {
    private final ProductRepository productRepository;

    // Constructor Dependency injection
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



}
