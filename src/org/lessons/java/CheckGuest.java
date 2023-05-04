package org.lessons.java;
import java.util.Arrays;
import java.util.Scanner;


public class CheckGuest {
	public static void main(String[]args) {
	String[] listaInvitati = {"Dua Lipa", 
			"Paris Hilton", 
			"Manuel Agnelli", 
			"J-Ax", 
			"Francesco Totti", 
			"Ilary Blasi", 
			"Bebe Vio", 
			"Luis", 
			"Pardis Zarei", 
			"Martina Maccherone", 
			"Rachel Zeilic"};
	try (Scanner in = new Scanner (System.in)) {
		System.out.println("Scrivi il tuo nome");
		String userStr = in.nextLine();
		if(Arrays.asList(listaInvitati).contains(userStr)) {
			System.out.println("Sei invitato");
		} else System.out.println("Non sei invitato");
	}
	
};
		
}
