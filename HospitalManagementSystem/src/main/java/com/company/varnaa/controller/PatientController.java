package com.company.varnaa.controller;

import com.company.varnaa.entity.appointment;
import com.company.varnaa.service.appointmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private appointmentService service;
    
    
    
    @GetMapping("/myAppointments")
    public String myAppointments(Model model) {
        String patientName = "Guest"; // Placeholder for patient name
        List<appointment> listAppointments = service.findByPatientName(patientName);
        model.addAttribute("listAppointments", listAppointments);
        return "myAppointments";
    }
    
    @GetMapping("/cancelAppointment")
    public String cancelAppointment(Model model) {
        appointment cancelAppointment = new appointment();
        model.addAttribute("appointment", cancelAppointment);
        return "cancelAppointment";
    
    }
    
    
    
}
