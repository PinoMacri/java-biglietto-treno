package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
public static void main(String[]args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Quanti KM vuoi percorrere?");
	int userStr = in.nextInt();
	System.out.println("Qual'è la tua età?");
	int userStr2 = in.nextInt();
	if (userStr2 < 18) {
		int scontoMinorenni = userStr*20/100;
		userStr = userStr - scontoMinorenni;
	}
	if (userStr2 > 65) {
		int scontoOver = userStr*40/100;
		userStr = userStr-scontoOver;
	}
	System.out.println(userStr * 0.21);
	in.close();
}
}
