package lib;

public class Child {
	private String childName;
	private String childIdNumber;

	public void setChild(String childName, String childIdNumber) {
		this.childName = childName;
		this.childIdNumber = childIdNumber;
	}

	public void setChildIdNumber(String childIdNumber) {
		this.childIdNumber = childIdNumber;
	}

	public String getChildIdNumber(){
		return this.childIdNumber;
	}

	public void setChildName(String spouseName) {
		this.childName = childName;
	}

	public String getChildName(){
		return this.childName;
	}
}