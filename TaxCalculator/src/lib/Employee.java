package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee extends Salary {

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

	public Employee(String employeeId, String fullName, String address, LocalDate joinDate, boolean isForeigner,
			Gender gender) {
		this.employeeId = employeeId;
		this.firstName = fullName;
		this.address = address;
		this.joinDate = joinDate;
		this.isForeigner = isForeigner;
		this.gender = gender;

		childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
	}

	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
}
