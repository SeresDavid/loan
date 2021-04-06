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
public class LoanEditController {

	@Autowired
	private LoanService ls;
	
	@GetMapping("loan/edit/{id}")
	public String viewEditLoan(Model model,  @PathVariable("id") Long id) {
		model.addAttribute("loan", ls.getLoan(id));
		return "editloan";
	}
	
	@PostMapping("loan/edit/{id}")
	public String editLoan(Loan loanObj) {
		ls.saveLoan(loanObj);
		return "redirect:/loan/list";
	}
	
	
}
