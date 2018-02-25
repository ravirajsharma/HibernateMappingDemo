package onetoonebidirectjoincolumn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
	private long addressId;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;
	
	@OneToOne
	@JoinColumn
	private Student student;

	public Address()
	{
		super();
	}

	public Address(String street, String city, String country)
	{
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}

	public long getAddressId()
	{
		return addressId;
	}

	public void setAddressId(long addressId)
	{
		this.addressId = addressId;
	}

	public String getStreet()
	{
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}
	
	

	public Student getStudent()
	{
		return student;
	}

	public void setStudent(Student student)
	{
		this.student = student;
	}

	@Override
	public String toString()
	{
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", country=" + country
				+ "]";
	}
	
	

}
