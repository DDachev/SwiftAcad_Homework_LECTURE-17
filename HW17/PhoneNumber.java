package bg.swift.HW17;

public class PhoneNumber {
	private String type;
	private String number;

	public PhoneNumber(String type, String number) {
		this.type = type;
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public String getNumber() {
		return number;
	}

	public String toString() {
		String output = String.format("type: %s number: %s ", this.type, this.number);
		return output;
	}
}
