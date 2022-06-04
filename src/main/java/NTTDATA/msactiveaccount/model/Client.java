package NTTDATA.msactiveaccount.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    private String dni;
    private String name;
    private String phone;
    private String address;
    private String typeClient;
    private  int age;
}
