package paczka_konferencja;

import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MakeAPerson {

	public static List<Person> analyzeList(List<String> entryList) {
		int size = entryList.size();
		List<Person> personsDataList = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			entryList.get(i).replace(" ", "");
			String[] eachData = entryList.get(i).split(",");
			createPerson(eachData, personsDataList);
		}

		return personsDataList;
	}

	public static void createPerson(String[] eachData, List<Person> personsDataList) {
		try {
			Date date = toSimpleDateFormat(eachData[2]);
			if (date != null) {
				Person eachPerson = new Person(eachData[0], eachData[1], date);
				personsDataList.add(eachPerson);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Błąd tablicy uczestników");
		}
	}

	static DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public static Date toSimpleDateFormat(String dataFromEntryList) {

		Date date = null;
		try {
			date = simpleDateFormat.parse(dataFromEntryList);
		} catch (ParseException e) {
			System.out.println("Błąd odczytu daty");
		}
		return date;
	}
}
