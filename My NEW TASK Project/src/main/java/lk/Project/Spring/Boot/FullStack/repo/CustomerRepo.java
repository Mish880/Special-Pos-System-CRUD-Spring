package lk.Project.Spring.Boot.FullStack.repo;

import lk.Project.Spring.Boot.FullStack.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {



}
