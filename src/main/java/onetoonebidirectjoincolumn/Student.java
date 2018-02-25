package onetoonebidirectjoincolumn;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_id")
	private long studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="course_name")
	private String courseName;
	
	
	/*There are 3 types of Unidirectional mapping
    1) Unidirectional - join column
        eg-
        @OneToOne
    	@JoinColumn(name="ADDRESS_ID")
    	private Address studentAddress;



   	2) Unidirectional - join Table
   		eg-
      	@OneToOne(cascade=CascadeType.ALL)
      	@JoinTable(name="Join_Table",joinColumns=@JoinColumn(name="Stud_id"),inverseJoinColumns=@JoinColumn(name="Add_id"))


	3) Unidirectional - Primary Key Join column
		eg-
	   	@OneToOne(cascade=CascadeType.ALL)
	   	@PrimaryKeyJoinColumn*/
	 
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address studentAddress;

	public Student()
	{
		super();
	}

	public Student(String studentName, String courseName)
	{
		super();
		this.studentName = studentName;
		this.courseName = courseName;
	}

	public long getStudentId()
	{
		return studentId;
	}

	public void setStudentId(long studentId)
	{
		this.studentId = studentId;
	}

	public String getStudentName()
	{
		return studentName;
	}

	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}

	public String getCourseName()
	{
		return courseName;
	}

	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}

	public Address getStudentAddress()
	{
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress)
	{
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString()
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseName=" + courseName
				+ ", studentAddress=" + studentAddress + "]";
	}
	
	

}
