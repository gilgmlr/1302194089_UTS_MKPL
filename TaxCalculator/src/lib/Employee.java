package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee extends Salary, Spouse, Child {

	private enum Gender {
		LAKI_LAKI,
		PEREMPUAN
	}

	private String employeeId;
	private String fullName;
	private Address address;

	private LocalDate joinDate;
	private int monthWorkingInYear;

	private boolean isForeigner;
    private Gender gender; 

	private List<Child> child;

	public Employee(String employeeId, String fullName, Address address, Gender gender) {
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.address = address;
		this.isForeigner = address.getIsForeigner();
		this.gender = gender;

		childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
		setJoinDate(LocalDate.now());
	}

	public void setJoinDate(LocalDate joinDate){
		this.joinDate = joinDate;
	}

	public void addChild(String childName, String childIdNumber) {
		this.child.add(new Child(childNames, childIdNumbers));
	}
	
}