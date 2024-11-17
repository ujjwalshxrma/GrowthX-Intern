package assignmentPortal.example.GrowthX.services;

import assignmentPortal.example.GrowthX.model.Assignment;
import assignmentPortal.example.GrowthX.repository.AssignmentRepository;
import assignmentPortal.example.GrowthX.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepository assignmentRepository;

    @Autowired
    private UserRepository userRepository;

    public Assignment uploadAssignment(Assignment assignment) {
        assignment.setStatus("Pending");
        return assignmentRepository.save(assignment);
    }

    public List<Assignment> getAssignmentsForAdmin(String admin) {
        return assignmentRepository.findByAdmin(admin);
    }

    public Assignment acceptAssignment(String id) {   Optional<Assignment> optionalAssignment = assignmentRepository.findById(id);
        if (optionalAssignment.isPresent()) {
            Assignment assignment = optionalAssignment.get();
            assignment.setStatus("Accepted");
            return assignmentRepository.save(assignment);
        } else {
            throw new RuntimeException("Assignment not found with id: " + id);
        } }

    public Assignment rejectAssignment(String id) { Optional<Assignment> optionalAssignment = assignmentRepository.findById(id);
        if (optionalAssignment.isPresent()) {
            Assignment assignment = optionalAssignment.get();
            assignment.setStatus("Rejected");
            return assignmentRepository.save(assignment);
        } else {
            throw new RuntimeException("Assignment not found with id: " + id);
        } }
}


