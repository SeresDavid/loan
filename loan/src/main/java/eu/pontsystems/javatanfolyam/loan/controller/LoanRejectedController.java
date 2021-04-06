package eu.pontsystems.javatanfolyam.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.javatanfolyam.loan.service.LoanService;

@Controller
public class LoanRejectedController {

	@Autowired
	private LoanService ls;
	
	@GetMapping("loan/rejected")
	public String viewAllRejected(Model model) {
		model.addAttribute("loans",ls.getAllRejected());
		return "loanlistrejected";
	}
	
}
