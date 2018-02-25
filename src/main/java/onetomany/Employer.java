package onetomany;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CompanyInfo1")
class Employer
{

	@Id
	private int registrationId;
	private String companyName;
	private String companyAddress;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(
	            name = "Company_Employee",
	            joinColumns = @JoinColumn(name = "registrationId"),
	            inverseJoinColumns = @JoinColumn(name = "empId")
	    )
	private Set<Emp> employees;

	
	
	
	public Employer()
	{
		super();
	}


	@Override
	public String toString()
	{
		return "\nEmployer [registrationId=" + registrationId + ", companyName="
				+ companyName + ", companyAddress=" + companyAddress
				+ ", employees=" + employees + "]";
	}

	
	
	
	public Employer(int registrationId, String companyName,
			String companyAddress, Set<Emp> employees)
	{
		super();
		this.registrationId = registrationId;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.employees = employees;
	}




	public int getRegistrationId()
	{
		return registrationId;
	}

	public void setRegistrationId(int registrationId)
	{
		if(registrationId<=0)
			 this.registrationId=ThreadLocalRandom.current().nextInt(100,500);
		else	
			this.registrationId = registrationId;
	}

	public String getCompanyName()
	{
		return companyName;
	}

	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}

	public String getCompanyAddress()
	{
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress)
	{
		this.companyAddress = companyAddress;
	}

	public Set<Emp> getEmployees()
	{
		return employees;
	}

	public void setEmployees(Set<Emp> employees)
	{
		this.employees = employees;
	}
	
	
}
