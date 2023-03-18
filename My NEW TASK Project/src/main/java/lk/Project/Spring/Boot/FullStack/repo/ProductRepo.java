package lk.Project.Spring.Boot.FullStack.repo;

import lk.Project.Spring.Boot.FullStack.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
