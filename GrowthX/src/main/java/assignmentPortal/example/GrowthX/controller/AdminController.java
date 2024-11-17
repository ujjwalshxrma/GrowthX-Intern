package assignmentPortal.example.GrowthX.controller;
import assignmentPortal.example.GrowthX.model.Assignment;
import assignmentPortal.example.GrowthX.services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AssignmentService assignmentService;

    @PostMapping("/upload")
    public Assignment uploadAssignment(@RequestBody Assignment assignment) {
        return assignmentService.uploadAssignment(assignment);
    }

    @GetMapping("/assignments")
    public List<Assignment> getAssignmentsForAdmin(@RequestParam String admin) {
        return assignmentService.getAssignmentsForAdmin(admin);
    }

    @PostMapping("/assignments/{id}/accept")
    public Assignment acceptAssignment(@PathVariable String id) {
        return assignmentService.acceptAssignment(id);
    }

    @PostMapping("/assignments/{id}/reject")
    public Assignment rejectAssignment(@PathVariable String id) {
        return assignmentService.rejectAssignment(id);
    }
}