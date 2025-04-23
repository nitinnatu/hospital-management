package com.company.varnaa.controller;

import com.company.varnaa.entity.appointment;
import com.company.varnaa.entity.invoice;
import com.company.varnaa.service.appointmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/receptionist")
public class receptionistController {

	@Autowired
	private appointmentService service = new appointmentService();
	
	@GetMapping("/receptionistAppointments")
	public String showReceptionistAppointments(Model model) {
		List<appointment> listAppointments = service.listAll();
		model.addAttribute("listAppointments",listAppointments);
		
		String confirmed = "confirmed";
		model.addAttribute("confirmed",confirmed);
		return "receptionistAppointments";
		
	}
	
	@GetMapping("/confirmm")
	public String showConfirmm(Model model) {
		appointment confirmation = new appointment();
		model.addAttribute("confirmation",confirmation);
		return "confirm";
	}
	
	@RequestMapping("/createInvoice")
	public String createInvoice(Model model) {
		invoice i = new invoice();
		model.addAttribute("invoice",i);
		return "invoice";
	}
	
}
