package eu.pontsystems.javatanfolyam.loan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fullName;
	private Integer amount;
	private String status;
	
	public Loan(Long id, String fullName, Integer amount, String status) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.amount = amount;
		this.status = status;
	}
	
	public Loan() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString() {
		return "Loan [id= "+id+", fullName ="+fullName+", amount="+amount
				+", status = "+status+"]";
	}
}
