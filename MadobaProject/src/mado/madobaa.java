package mado;

import java.util.Scanner;

public class madobaa {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Por favor, introduce un número para 'y modaba': ");
	        int n = scanner.nextInt();

	        System.out.print("Por favor, introduce el texto 'y': ");
	        String y = scanner.next();

	        System.out.println("Resultado:");
	        generarModaba(y, n);

	        scanner.close();
	    }

	    public static void generarModaba(String y, int n) {
	        for (int i = 1; i <= n; i++) {
	            String modaba = y + " modaba";
	            for (int j = 0; j < i; j++) {
	                modaba += "a";
	            }
	            System.out.println(modaba);
	        }
	    }
	}


