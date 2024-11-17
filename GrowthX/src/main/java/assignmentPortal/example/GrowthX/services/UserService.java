package assignmentPortal.example.GrowthX.services;

import assignmentPortal.example.GrowthX.model.User;
import assignmentPortal.example.GrowthX.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Registration logic
    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword())); // Encode the password
        user.setRole("user"); // Default role
        return userRepository.save(user); // Save user to the database
    }

    // Login logic
    public User loginUser(String username, String password) {
        // Fetch user by username
        Optional<User> optionalUser = Optional.ofNullable(userRepository.findByUsername(username));

        if (optionalUser.isPresent()) { // Check if user is found
            User user = optionalUser.get(); // Get the User object

            // Validate the password
            if (passwordEncoder.matches(password, user.getPassword())) {
                return user; // Return the user if authentication is successful
            } else {
                throw new RuntimeException("Invalid password.");
            }
        } else {
            throw new RuntimeException("User not found.");
        }
    }
}
