package eu.pontsystems.javatanfolyam.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.javatanfolyam.loan.entity.Loan;
import eu.pontsystems.javatanfolyam.loan.service.LoanService;

@Controller
public class LoanDeleteController {

	@Autowired
	private LoanService ls;
	
	@GetMapping("loan/delete/{id}")
	public String viewDeleteLoan(Model model, @PathVariable("id") Long id) {
		model.addAttribute("loan", ls.getLoan(id));
		return "deleteloan";
	}
	
	@PostMapping("loan/delete/{id}")
	public String deleteLoan(Loan loanObj) {
		ls.deleteLoan(loanObj);
		return "redirect:/loan/list";
	}
	
}
