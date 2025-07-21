package com.company.varnaa.controller;

import java.util.List;

import com.company.varnaa.entity.appointment;
import com.company.varnaa.service.appointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/doctors")
public class doctorController {

    @Autowired
    private appointmentService service;
    
    @RequestMapping("/doctorAppointments")
    public String showDoctorAppointments(Model model) {
        String doctorName = "Doctor"; // Placeholder for doctor name
        List<appointment> doctorAppointments = service.findByDoctorName(doctorName);
        model.addAttribute("doctorAppointments", doctorAppointments);
        return "doctorAppointments.html";
    }
    
    @RequestMapping("/createPrescription")
    public String createPrescription() {
        return "createPrescription";
    }
}
