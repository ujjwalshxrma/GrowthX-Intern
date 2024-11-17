package assignmentPortal.example.GrowthX.repository;
import assignmentPortal.example.GrowthX.model.Assignment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AssignmentRepository extends MongoRepository<Assignment, String> {
    List<Assignment> findByAdmin(String admin);
}
