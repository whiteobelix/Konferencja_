package paczka_konferencja;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.Scanner;

public class UserFunctionalities {

	static Pattern letterPattern = Pattern.compile("[a-ząęśźżćńółA-ZĄĘŚŹŻĆŃÓŁ]");
	static Pattern numberPattern = Pattern.compile("\\d+");

	public static String startUserFunctionalities(List<Person> personsDataList) {
		String messageForTyping = "Wprowadź pierwszą literę nazwiska lub liczbę osób w każdej grupie: ";
		String inputString = getInputStringFromUser(messageForTyping);
		String s;
		
			if (inputValidation(inputString, personsDataList)) {
				s = inputString;
			}
			else {
				s = null;
			}
		return s;
	}

	public static String getInputStringFromUser(String messageForTyping) {
		System.out.println(messageForTyping);
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		return s;
	}

	public static Boolean inputValidation(String s, List<Person> personsDataList){
		Boolean isLetterOrNumber = false;
		if (checkIsLetter(s)){
			isLetterOrNumber = true;
		}
		else if (checkIsNumber(s)){
			if (checkIsDivisible(s, personsDataList)==true){
				isLetterOrNumber = true;
			}
			else{
				System.out.println("Lista niepodzielna przez daną liczbę. Wprowadź inną liczbę:/n");
			}
		}
		return isLetterOrNumber;
	}
	
	public static Boolean checkIsNumber(String s){
		Matcher matcher = numberPattern.matcher(s);
		return matcher.matches();
	}
	
	public static Boolean checkIsLetter(String s){
		Matcher matcher = letterPattern.matcher(s);
		return matcher.matches();
	}
	
	public static Boolean checkIsDivisible(String s, List<Person> personsDataList){
		int inputNumber = Integer.parseInt(s);
		Boolean isDivisible = false;
		if((personsDataList.size() % inputNumber)==0){
			isDivisible = true;
		}
		return isDivisible;
	}
}