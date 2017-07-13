package paczka_konferencja;

import java.io.PrintWriter;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;

public class SaveConferenceFile {

	private List<Person> personsDataList;
	private String fileName;
	PrintWriter fileToSave;

	public SaveConferenceFile(List<Person> personsDataList, String fileName) {
		super();
		this.fileName = fileName;
		this.personsDataList = personsDataList;
	}

	public void saveFile() {
		try {
			fileToSave = new PrintWriter(new File(fileName));
			for (Person eachPerson : personsDataList) {
				fileToSave.write(eachPerson.toString());
			}
			fileToSave.close();
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		}
	}
}