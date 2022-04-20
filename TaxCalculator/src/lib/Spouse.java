package lib;

public class Spouse {
	private boolean isMarried;
	private String spouseName;
	private String spouseIdNumber;

	public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = spouseIdNumber;
	}

	public void setSpouseIdNumber(String spouseIdNumber) {
		this.spouseIdNumber = spouseIdNumber;
	}

	public String getSpouseIdNumber(){
		return this.spouseIdNumber;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getSpouseName(){
		return this.spouseName;
	}

	public void setIsMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public String getIsMarried(){
		return this.isMarried;
	}
}