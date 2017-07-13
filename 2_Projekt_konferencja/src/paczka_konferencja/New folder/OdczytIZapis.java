package paczka_konferencja;

import java.io.*;
import java.nio.*;
import java.util.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class OdczytIZapis {

	public void odczyt() throws FileNotFoundException{	
String fileName = "c://konferencja.csv";
		
			System.out.println("Moduł‚ wczytujący dane z pliku uruchomiony. " );
			int i=1;
			try (Stream<String> lista = Files.lines(Paths.get(fileName))) {

				lista.forEach(System.out::println);
//				System.out.print("Dane osoby to: "+ lista.get(i));
//				System.out.print("Dane osoby to: "+ lista.size());
				
				
				
			} catch (IOException e) {
				e.printStackTrace();	
			}
			
			

			while(true){
//				System.out.print("Dane osoby to: "+ lista.get(i));
			i++;
			
			
			
			
			
			
			
/*			
			Scanner dane = new Scanner(new File ("konferencja.csv"));
//			String daneJednejOsoby = null;
			Scanner daneOsoby = new Scanner(dane.next());
			int j = 0;
			while (daneOsoby.hasNext()){
			daneOsoby = new Scanner(dane.next());
			j++;
			}
//			Scanner daneOsoby = dane;
//		//	daneOsoby.useDelimiter(",");
	        ArrayList<String> lista = new ArrayList<String>();
	        int i=0;	    
	        Scanner poleOsoby = daneOsoby;
	        while(dane.hasNext()){
	        	daneOsoby.next();
	        	dane.useDelimiter("\n");
	        	System.out.print("PoleOsoby to: "+ daneOsoby.next());								//Scanner daneOsoby = new Scanner(dane.next());
//	        												System.out.print("Dane to: "+ dane.next());
//	        	while(daneOsoby.hasNext()){	   
//	        		daneOsoby.next();
//	        		poleOsoby = daneOsoby; 
//	        		System.out.print("PoleOsoby to: "+ daneOsoby.next());
//	        		daneOsoby.next();
//	        	}
	        	
	        	
//	        	lista.add(dane.next());
//	            System.out.print(dane.next());
	        	i++;
	        }
*/	        
	      		
			break;
		}
	}	
}
