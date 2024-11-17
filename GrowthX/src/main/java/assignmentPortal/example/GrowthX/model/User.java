package assignmentPortal.example.GrowthX.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String role; // "USER" or "ADMIN"
}
