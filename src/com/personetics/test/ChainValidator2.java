package com.personetics.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChainValidator2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String regex = "[0-9]+"; // aceita somente caracteres numéricos [0-9] e não aceita espaços em branco
		Pattern padrao = Pattern.compile(regex);
		String[] nomes = new String[5];
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Escreva o número aqui : ");
			nomes[i] = scan.nextLine();
			
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Resposta logo abaixo: ");
		System.out.println("----------------------------------------------------");
		List<String> letras = new ArrayList<String>();
		letras.addAll(Arrays.asList(nomes));

		for (String string : letras) {
			Matcher matcher = padrao.matcher(string);
			if (matcher.matches() == true) {
				System.out.println(string);
			} else {
				System.out.println("false");
			}
		}

		scan.close();

	}

}
