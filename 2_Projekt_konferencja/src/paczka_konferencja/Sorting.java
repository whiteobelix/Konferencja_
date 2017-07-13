package paczka_konferencja;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Sorting {
	private List<Person> personsDataList;
	private List<Person> listWithSimilarLastName;
	private List<Person> sortedList;
	private SaveConferenceFile saveConferenceFile;

	public Sorting(List<Person> personsDataList) {
		super();
		this.personsDataList = personsDataList;
	}

	public void sortByLetterOrNumber(String inputString) {
		if (UserFunctionalities.checkIsLetter(inputString)) {
			sortByLetter(inputString);
		} else {
			sortByNumber(inputString);
		}
	}

	private void sortByNumber(String inputString) {
		personsDataList.sort(Comparator.comparing(Person::getLastName));
		List<Person> listByNumber = new ArrayList<>();
		int personsPerEachList = Integer.parseInt(inputString);
		int howManyFiles = personsDataList.size() / personsPerEachList;
		int numberOfFile = 0;
		for (int i = 0; i < howManyFiles; i++) {
			numberOfFile = i + 1;
			listByNumber = personsDataList.subList(i * personsPerEachList, (i + 1) * personsPerEachList);
			saveConferenceFile = new SaveConferenceFile(listByNumber,
					"uczestnicy_po_" + personsPerEachList + "_osób_" + numberOfFile + ".csv");
			saveConferenceFile.saveFile();
		}
		System.out.println("Zapisano pliki z uczestnikami po " + personsPerEachList + " osób.");
	}

	private void sortByLetter(String inputString) {
		makeListWithSimilarLastName(inputString);
		sortListByFirstName(listWithSimilarLastName);
		saveConferenceFile = new SaveConferenceFile(sortedList, "uczestnicy_" + inputString + ".csv");
		saveConferenceFile.saveFile();
		System.out.println("Zapisano plik: uczestnicy_" + inputString + ".csv");
	}

	private void makeListWithSimilarLastName(String inputString) {
		listWithSimilarLastName = new ArrayList<Person>();
		for (Person p : personsDataList) {
			if (p.getLastName().charAt(0) == inputString.toLowerCase().charAt(0)
					|| p.getLastName().charAt(0) == inputString.toUpperCase().charAt(0)) {
				listWithSimilarLastName.add(p);
			}
		}
	}

	private void sortListByFirstName(List<Person> everyList) {
		// int size = everyList.size();
		List<Person> tempList = new ArrayList<Person>();
		tempList.addAll(everyList);
		sortedList = new ArrayList<Person>();

		for (int i = 0; i < everyList.size(); i++) {
			int theCurrentLowest = 0;
			for (int j = 0; j < tempList.size(); j++) {
				if (tempList.get(j).getFirstName().compareTo(tempList.get(theCurrentLowest).getFirstName()) < 0) {
					theCurrentLowest = j;
				}
			}
			sortedList.add(tempList.remove(theCurrentLowest));
		}
	}

	public List<Person> getPersonsDataList() {
		return personsDataList;
	}

	public void setPersonsDataList(List<Person> personsDataList) {
		this.personsDataList = personsDataList;
	}

	public List<Person> getListWithSimilarLastName() {
		return listWithSimilarLastName;
	}

	public void setListWithSimilarLastName(List<Person> listWithSimilarLastName) {
		this.listWithSimilarLastName = listWithSimilarLastName;
	}

	public List<Person> getSortedList() {
		return sortedList;
	}

	public void setSortedList(List<Person> sortedList) {
		this.sortedList = sortedList;
	}

}
