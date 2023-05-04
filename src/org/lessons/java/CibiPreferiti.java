package org.lessons.java;



public class CibiPreferiti {
	public static void main(String[]args) {
		String[]classificaCibi = {"pasta","pizza","patatine","carne","gelato","carbonara"};
		System.out.println(classificaCibi.length);
		System.out.println(classificaCibi[0]);
		System.out.println(classificaCibi[classificaCibi.length - 1]);
		System.out.println(classificaCibi[(classificaCibi.length - 1) / 2]);
	}
}
