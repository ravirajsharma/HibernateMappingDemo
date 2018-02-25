package onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employeeInfo1")
class Emp
{
	@Id
	private int empId;
	private String empName;
	private int empSalary;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Employer employer;

	
	
	
	
	public Emp()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int empId, String empName, int empSalary, Employer employer)
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.employer = employer;
	}

	public int getEmpId()
	{
		return empId;
	}

	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public String getEmpName()
	{
		return empName;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public int getEmpSalary()
	{
		return empSalary;
	}

	public void setEmpSalary(int empSalary)
	{
		this.empSalary = empSalary;
	}

	public Employer getEmployer()
	{
		return employer;
	}

	public void setEmployer(Employer employer)
	{
		this.employer = employer;
	}

	@Override
	public String toString()
	{
		return "\nEmp [empId=" + empId + ", empName=" + empName + ", empSalary="
				+ empSalary + ", employer=" + employer + "]";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;

		return true;
	}
	
	
	
	
	
	
	
	
}