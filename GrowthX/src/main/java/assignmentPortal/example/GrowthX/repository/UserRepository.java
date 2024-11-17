package assignmentPortal.example.GrowthX.repository;
import assignmentPortal.example.GrowthX.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
