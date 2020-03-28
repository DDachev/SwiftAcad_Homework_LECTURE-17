package bg.swift.HW17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;

public class JsonDemo {

	public static void main(String[] args) {
		writeToJsonFile("Person.json");
		readFromJsonFile("Person.json");
	}

	private static void writeToJsonFile(String input) {
		try (FileOutputStream fos = new FileOutputStream(input)) {
			Person person = new Person("John Smith", 25, new Address("21 2nd Street", "New York", "NY", 10021),
					Arrays.asList(new PhoneNumber("home", "212 555-1234"), new PhoneNumber(null, "646 555-4567")));
			Gson gson = new Gson();
			String fromJson = gson.toJson(person);
			fos.write(fromJson.getBytes());
		} catch (FileNotFoundException e) {
			System.out.println("Can't found file with this name.");
		} catch (IOException e) {
			System.out.println("Error.");
		}
	}
	
	private static void readFromJsonFile(String input) {
		try(BufferedReader br = new BufferedReader(new FileReader(input))){
			Gson gson = new Gson();
			String jsonObject = br.readLine();
			Person person = gson.fromJson(jsonObject, Person.class);
			System.out.println(person.toString());
		} catch (FileNotFoundException e) {
			System.out.println("Can't found file with this name.");
		} catch (IOException e) {
			System.out.println("Error.");
		}
	}
}
