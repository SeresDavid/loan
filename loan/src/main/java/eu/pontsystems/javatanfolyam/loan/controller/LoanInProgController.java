package eu.pontsystems.javatanfolyam.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eu.pontsystems.javatanfolyam.loan.service.LoanService;

@Controller
public class LoanInProgController {

	@Autowired
	private LoanService ls;
	
	@GetMapping("loan/inprog")
	public String viewList(Model model) {
		model.addAttribute("loans", ls.getAllInProg());
		return "loanlistinprog";
	}
	
	@GetMapping("loan/accept/{id}")
	public String acceptLoan(Model model, @PathVariable("id") Long id) {
		model.addAttribute("loan",ls.getLoan(id));
		ls.acceptLoan(id);
		return "redirect:/loan/list";
	}
	
	/*
	 * @GetMapping("/loan/accept2") public String acceptLoan2(Model model,
	 * HttpServletRequest request) { long id =
	 * Long.parseLong(request.getParameter("id"));
	 * model.addAttribute("loan",ls.getLoan(id)); ls.acceptLoan(id); return
	 * "redirect:/loan/list"; }
	 */
	
	@GetMapping("loan/reject/{id}")
	public String rejectLoan(Model model, @PathVariable("id") Long id) {
		model.addAttribute("loan",ls.getLoan(id));
		ls.rejectLoan(id);
		return "redirect:/loan/list";
	}
	
	
}
