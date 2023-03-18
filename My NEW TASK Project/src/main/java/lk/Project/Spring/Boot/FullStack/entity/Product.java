package lk.Project.Spring.Boot.FullStack.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Product {
    @Id
    private int product_id;
    private String product_name;
    private int product_quantity;
    private String product_price;
}

/*This is a Database Product Entity*/