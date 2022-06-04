package NTTDATA.msactiveaccount.entitty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "ActiveAccount")
public class ActiveAccount {

    @Id
    private  String id;

    private String numAccount;
    private String type; //1: personal 2 : empresrial
    private int limit;
    private String clientId;

}
