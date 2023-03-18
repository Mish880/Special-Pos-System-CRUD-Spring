package lk.Project.Spring.Boot.FullStack.service;

import lk.Project.Spring.Boot.FullStack.dto.ProductDto;

import java.util.List;

public interface ProductService {

    void SaveProduct(ProductDto dto);

    void DeleteProduct(int id);

    void UpdateProduct(ProductDto dto);

    ProductDto SearchProduct(int id);

    List<ProductDto> GetAllProduct();
}
