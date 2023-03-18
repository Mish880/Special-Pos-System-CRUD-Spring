package lk.Project.Spring.Boot.FullStack.service.impl;

import lk.Project.Spring.Boot.FullStack.dto.CustomerDto;
import lk.Project.Spring.Boot.FullStack.entity.Customer;
import lk.Project.Spring.Boot.FullStack.repo.CustomerRepo;
import lk.Project.Spring.Boot.FullStack.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void SaveCustomer(CustomerDto dto) {
        if (!customerRepo.existsById(dto.getCustomer_id())) {
            customerRepo.save(mapper.map(dto, Customer.class));
        } else {
            throw new RuntimeException("Customer is Already Exist...!");
        }
    }

    @Override
    public void DeleteCustomer(int id) {
        if (customerRepo.existsById(id)) {
            customerRepo.deleteById(id);
        } else {
            throw new RuntimeException("No Customer for" + id + "...!");
        }
    }

    @Override
    public void UpdateCustomer(CustomerDto dto) {
        if (customerRepo.existsById(dto.getCustomer_id())) {
            customerRepo.save(mapper.map(dto, Customer.class));
        } else {
            throw new RuntimeException("No Such Customer To ...! Please Check the ID...!");
        }
    }

    @Override
    public CustomerDto SearchCustomer(int id) {
        if (customerRepo.existsById(id)) {
            return mapper.map(customerRepo.findById(id).get(), CustomerDto.class);
        } else {
            throw new RuntimeException("No Customer For" + id + "..!");

        }
    }

    @Override
    public List<CustomerDto> GetAllCustomer() {
        return mapper.map(customerRepo.findAll(), new TypeToken<List<CustomerDto>>() {

        }.getType());
    }
}
