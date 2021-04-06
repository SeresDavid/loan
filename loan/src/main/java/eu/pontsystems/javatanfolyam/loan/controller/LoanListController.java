package eu.pontsystems.javatanfolyam.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.javatanfolyam.loan.entity.Loan;
import eu.pontsystems.javatanfolyam.loan.service.LoanService;

@Controller
public class LoanListController {

	@Autowired
	private LoanService ls;
	
	@GetMapping("loan/list")
	public String viewList(Model model) {
		List<Loan> all = ls.getAll();
		
		model.addAttribute("loans", all);
		return "loanlist";
	}
	
	
}
