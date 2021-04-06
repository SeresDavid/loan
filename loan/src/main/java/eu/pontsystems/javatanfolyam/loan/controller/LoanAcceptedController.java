package eu.pontsystems.javatanfolyam.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.javatanfolyam.loan.service.LoanService;

@Controller
public class LoanAcceptedController {

	@Autowired
	private LoanService ls;
	
	@GetMapping("loan/accepted")
	public String viewAllAccepted(Model model) {
		model.addAttribute("loans",ls.getAllAccepted());
		return "loanlistaccepted";
	}
	
}
