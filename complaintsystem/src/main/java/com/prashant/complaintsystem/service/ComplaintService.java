package com.prashant.complaintsystem.service;

import com.prashant.complaintsystem.model.Complaint;
import java.util.List;

public interface ComplaintService {
    Complaint createComplaint(Complaint complaint);
    List<Complaint> getAllComplaints();
    Complaint updateStatus(Long id, String status);
}