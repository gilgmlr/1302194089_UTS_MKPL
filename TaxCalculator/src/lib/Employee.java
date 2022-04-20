package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee extends Salary{

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

	private String spouseName;
	private String spouseIdNumber;

	private List<String> childNames;
	private List<String> childIdNumbers;

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

	public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
	}

	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
	
}
