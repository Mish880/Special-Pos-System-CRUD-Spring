package lk.Project.Spring.Boot.FullStack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CustomerDto {
    private int customer_id;
    private String customer_name;
    private String email;
    private String shipping_address;
}
