package lk.Project.Spring.Boot.FullStack.service.impl;

import lk.Project.Spring.Boot.FullStack.dto.ProductDto;
import lk.Project.Spring.Boot.FullStack.entity.Product;
import lk.Project.Spring.Boot.FullStack.repo.ProductRepo;
import lk.Project.Spring.Boot.FullStack.service.ProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void SaveProduct(ProductDto dto) {
        if (!productRepo.existsById(dto.getProduct_id())) {
            productRepo.save(mapper.map(dto, Product.class));
        } else {
            throw new RuntimeException("Product is Already Exist...!");
        }

    }

    @Override
    public void DeleteProduct(int id) {
        if (productRepo.existsById(id)) {
            productRepo.deleteById(id);
        } else {
            throw new RuntimeException("No Product for" + id + "...!");
        }
    }

    @Override
    public void UpdateProduct(ProductDto dto) {
        if (productRepo.existsById(dto.getProduct_id())) {
            productRepo.save(mapper.map(dto, Product.class));
        } else {
            throw new RuntimeException("No Such Product to Update..! Please check the ID");
        }
    }

    @Override
    public ProductDto SearchProduct(int id) {
        if (productRepo.existsById(id)) {
            return mapper.map(productRepo.findById(id).get(), ProductDto.class);

        } else {
            throw new RuntimeException("No Product For" + id + "...!");
        }
    }

    @Override
    public List<ProductDto> GetAllProduct() {
        return mapper.map(productRepo.findAll(), new TypeToken<List<ProductDto>>() {

        }.getType());
    }
}
