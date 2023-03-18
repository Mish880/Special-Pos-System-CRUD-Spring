package lk.Project.Spring.Boot.FullStack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ProductDto {
    private int product_id;
    private String product_name;
    private int product_quantity;
    private String product_price;
}
