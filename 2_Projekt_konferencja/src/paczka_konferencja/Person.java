package paczka_konferencja;

import java.util.*;
import java.text.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.time.Period;
import java.util.Date;

public class Person {
	private String firstName;
	private String lastName;
	private Date datePerson;
	private int age;
	private final int MoveMonthIndexByOne = 1;

	public void giveMeAge() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(datePerson);
		LocalDate date = LocalDate.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + MoveMonthIndexByOne,
				cal.get(Calendar.DAY_OF_MONTH));
		int tempAge = Period.between(date, LocalDate.now()).getYears();
		setAge(tempAge);
	}

	public Person(String firstName, String lastName, Date datePerson) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.datePerson = datePerson;
		giveMeAge();
	}

	public String toString() {
		String separator = ",";
		return firstName + separator + lastName + separator + age + "\n";
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDatePerson() {
		return datePerson;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	private int getAge() {
		return age;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private void setDatePerson(Date datePerson) {
		this.datePerson = datePerson;
	}
}