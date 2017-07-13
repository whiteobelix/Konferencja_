package paczka_konferencja;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class Konferencja {

	public static void main(String[] args) {
		new Konferencja().program();
	}

	public static void program() {

		List<String> entryList = ReadConferenceFile.readFile("Konferencja.csv");

		List<Person> personsDataList = MakeAPerson.analyzeList(entryList);
		String inputString = null;

		while (inputString == null) {
			inputString = UserFunctionalities.startUserFunctionalities(personsDataList);
		}

		Sorting sorting = new Sorting(personsDataList);
		sorting.sortByLetterOrNumber(inputString);
	}
}
