package eu.pontsystems.javatanfolyam.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.javatanfolyam.loan.entity.Loan;
import eu.pontsystems.javatanfolyam.loan.repository.LoanRepository;

@Service
public class LoanService {

	@Autowired
	private LoanRepository lr;
	
	public List<Loan> getAll(){
		return lr.findAll();
	}

	public void saveLoan(Loan loanObj) {
		if (loanObj.getId() == null) {
			loanObj.setStatus("IN_PROGRESS");
		}
		lr.save(loanObj);
	}

	public Loan getLoan(Long id) {
		return lr.getOne(id);
	}

	public void deleteLoan(Loan loanObj) {
		lr.delete(loanObj);
	}

	public List<Loan> getAllInProg() {
		return lr.findByStatus("IN_PROGRESS");
	}

	public void acceptLoan(Long id) {
		Loan loanObj = getLoan(id);
		if (loanObj.getStatus().equals("IN_PROGRESS")) {
			loanObj.setStatus("ACCEPTED");
		}
		saveLoan(loanObj);
	}

	public void rejectLoan(Long id) {
		Loan loanObj = getLoan(id);
		if (loanObj.getStatus().equals("IN_PROGRESS")) {
			loanObj.setStatus("REJECTED");
		}
		saveLoan(loanObj);
	}

	public List<Loan> getAllAccepted() {
		return lr.findByStatus("ACCEPTED");
	}

	public List<Loan> getAllRejected() {
		return lr.findByStatus("REJECTED");
	}
}
