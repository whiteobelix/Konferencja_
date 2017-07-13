package paczka_konferencja;

import java.util.ArrayList;
import java.util.List;


public class OdczytIZapis{
	
	Lista<String> List(){
	System.out.println("Moduł wczytujący dane z pliku.");
//	BufferedReader d = new BufferedReader(new InputStreamReader(in));
	
//	Lista lista
	
	
	
	
	

	}	
/*	private List<String> loadFile() {
		List<String> result = new ArrayList<String>();
		try {
			LineNumberReader r = new LineNumberReader(new FileReader(_filename));
			String line;
			do {
				line = r.readLine();
				if (line == null) {
					break;
				}
				result.add(line);
			} while (true);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return result;
	}
}
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

/*package com.capgeminisdm.education.programmer.debug;

import com.capgeminisdm.education.programmer.debug.application.Application;
import com.capgeminisdm.education.programmer.debug.util.ParamHelper;

public class Startup {

	public static void main(String[] args) {
		System.out.println("Simple File Dump Application");
		System.out.println("============================");
		Application app = new Application(ParamHelper.getFilename(args));
		app.start();
	}
}
*/




/*

package com.capgeminisdm.education.programmer.debug.application;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;


public class Application {

	private String _filename;

	public Application(String filename) {
		System.out.println("Dumping '" + filename + "'...");
		init(filename);
	}

	private void checkFilename(String filename) {
		/* Filename must end with ".dump" */
		/*if (filename.toLowerCase().endsWith(".dump")) {
			return;
		}
		throw new IWontUseThisFileException();
	}

	public void start() {
		List<String> list = loadFile();
		dump(list);
	}

	private List<String> loadFile() {
		List<String> result = new ArrayList<String>();
		try {
			LineNumberReader r = new LineNumberReader(new FileReader(_filename));
			String line;
			do {
				line = r.readLine();
				if (line == null) {
					break;
				}
				result.add(line);
			} while (true);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	private String trim(String line) {
		String trimmed = line.trim();
		return trimmed;
	}

	private void dump(List<String> list) {
		System.out.println("'" + _filename + "' contains:");
		int size = list.size();
		for (int i = 0; i < size; i++) {
			String line = list.remove(list.size() - 1);
			String trimmed = trim(line);
			System.out.println("Line No " + i + " is: '" + trimmed + "'.");
		}
	}

	private void init(String filename) {
		checkFilename(filename);
		/* Add suffix automatically for convenience */
		/*_filename = filename /*+ ".dump";*/
	/*}
}
*/
