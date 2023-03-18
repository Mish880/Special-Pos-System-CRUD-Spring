package lk.Project.Spring.Boot.FullStack.controller;

import lk.Project.Spring.Boot.FullStack.dto.CustomerDto;
import lk.Project.Spring.Boot.FullStack.service.CustomerService;
import lk.Project.Spring.Boot.FullStack.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil GetAllCustomer() {
        return new ResponseUtil(200,"OK",customerService.GetAllCustomer());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil SaveCustomer(@ModelAttribute CustomerDto customer) {
        customerService.SaveCustomer(customer);
       return new ResponseUtil(200,"Save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil UpdateCustomer(@RequestBody CustomerDto customer) {
        customerService.UpdateCustomer(customer);
        return new ResponseUtil(200,"Updated",null);
    }


}
