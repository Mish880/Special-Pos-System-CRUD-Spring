package lk.Project.Spring.Boot.FullStack.service;

import lk.Project.Spring.Boot.FullStack.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    void SaveCustomer(CustomerDto dto);

    void DeleteCustomer(int id);

    void UpdateCustomer(CustomerDto dto);

    CustomerDto SearchCustomer(int id);

    List<CustomerDto> GetAllCustomer();
}
