package eu.pontsystems.javatanfolyam.loan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import eu.pontsystems.javatanfolyam.loan.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

	List<Loan> findByStatus(String string);
	
	@Query("SELECT l FROM Loan l WHERE l.status = ?1")
	List<Loan> findLoanByStatus(String status);
}
