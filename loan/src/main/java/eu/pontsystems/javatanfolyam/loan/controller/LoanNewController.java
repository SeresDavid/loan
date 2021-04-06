package eu.pontsystems.javatanfolyam.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.javatanfolyam.loan.entity.Loan;
import eu.pontsystems.javatanfolyam.loan.service.LoanService;

@Controller
public class LoanNewController {

	@Autowired
	private LoanService ls;
	
	@GetMapping("loan/new")
	public String viewNew(Model model) {
		return "newloan";
	}
	
	@PostMapping("loan/new")
	public String saveNewLoan(Loan loanObj) {
		
		ls.saveLoan(loanObj);
		return "redirect:list";
		
	}
	
	
}
