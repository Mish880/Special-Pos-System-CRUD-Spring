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
public class Customer {

    @Id
    private int customer_id;
    private String customer_name;
    private String email;
    private String shipping_address;

}

/*This is a Database Customer Entity*/