package assignmentPortal.example.GrowthX.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Getter
@Setter
@Document(collection = "assignments")
public class Assignment {
    @Id
    private String id;
    private String userId;
    private String task;
    private String admin;
    private String status; // "PENDING", "ACCEPTED", "REJECTED"
    private DateTime timestamp;
}
