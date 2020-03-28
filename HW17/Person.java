package bg.swift.HW17;

import java.util.List;

public class Person {
	private String name;
	private int age;
	private Address address;
	private List<PhoneNumber> phoneNumber;

	public Person(String name, int age, Address address, List<PhoneNumber> phoneNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	public List<PhoneNumber> getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		String output = String.format(
				"Name: %s%nage: %s%n%nAddress:%n" + address.toString() + "%nPhone number:%n" + phoneNumber.toString(),
				this.name, this.age);
		return output;
	}
}
