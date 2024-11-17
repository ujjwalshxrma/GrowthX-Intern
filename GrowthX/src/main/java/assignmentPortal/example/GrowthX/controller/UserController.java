package assignmentPortal.example.GrowthX.controller;
import assignmentPortal.example.GrowthX.model.User;
import assignmentPortal.example.GrowthX.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class UserController {
    @Autowired
    private UserService UserService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return UserService.registerUser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {
        return UserService.loginUser(user.getUsername(), user.getPassword());
    }
}
