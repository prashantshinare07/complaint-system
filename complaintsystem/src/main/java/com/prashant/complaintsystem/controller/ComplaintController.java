package com.prashant.complaintsystem.controller;

import com.prashant.complaintsystem.model.Complaint;
import com.prashant.complaintsystem.service.ComplaintService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {

    private final ComplaintService service;

    public ComplaintController(ComplaintService service) {
        this.service = service;
    }

    @PostMapping
    public Complaint create(@Valid @RequestBody Complaint complaint) {
        return service.createComplaint(complaint);
    }

    @GetMapping
    public List<Complaint> getAll() {
        return service.getAllComplaints();
    }

    @PutMapping("/{id}")
    public Complaint update(@PathVariable Long id,
                            @RequestParam String status) {
        return service.updateStatus(id, status);
    }
}