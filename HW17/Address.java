package bg.swift.HW17;

public class Address {
	private String streetAddress;
	private String city;
	private String state;
	private int postalCode;

	public Address(String streetAddress, String city, String state, int postalCode) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getPostalCode() {
		return postalCode;
	}

	@Override
	public String toString() {
		String output = String.format("street: %s%ncity: %s%nstate: %s%npostal code: %d%n", this.streetAddress,
				this.city, this.state, this.postalCode);
		return output;
	}

}
