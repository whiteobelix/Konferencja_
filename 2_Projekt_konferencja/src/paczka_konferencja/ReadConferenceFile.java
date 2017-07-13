package paczka_konferencja;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import java.util.stream.Collectors;

public class ReadConferenceFile {

	public static List<String> readFile(String address) {
		List<String> entryList = new ArrayList<>();

		try (BufferedReader buforOdczytu = Files.newBufferedReader(Paths.get(address))) {
			entryList = buforOdczytu.lines().collect(Collectors.toList());
		} catch (IOException e) {
			System.out.println("Błąd: nie można odczytać pliku.");
		}
		return entryList;
	}

}
