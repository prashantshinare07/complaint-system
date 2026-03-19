package com.prashant.complaintsystem.service;

import com.prashant.complaintsystem.model.Complaint;
import com.prashant.complaintsystem.model.User;
import com.prashant.complaintsystem.repository.ComplaintRepository;
import com.prashant.complaintsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ComplaintServiceImpl implements ComplaintService {

    private final ComplaintRepository complaintRepo;
    private final UserRepository userRepo;

    public ComplaintServiceImpl(ComplaintRepository complaintRepo, UserRepository userRepo) {
        this.complaintRepo = complaintRepo;
        this.userRepo = userRepo;
    }

    @Override
    public Complaint createComplaint(Complaint complaint) {
        User user = userRepo.findById(1L).orElseThrow();
        complaint.setUser(user);
        complaint.setStatus("Pending");
        complaint.setCreatedAt(LocalDateTime.now());
        return complaintRepo.save(complaint);
    }

    @Override
    public List<Complaint> getAllComplaints() {
        return complaintRepo.findAll();
    }

    @Override
    public Complaint updateStatus(Long id, String status) {
        Complaint c = complaintRepo.findById(id).orElseThrow();
        c.setStatus(status);
        return complaintRepo.save(c);
    }
}