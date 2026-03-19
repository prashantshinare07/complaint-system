package com.prashant.complaintsystem.repository;

import com.prashant.complaintsystem.model.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
}
