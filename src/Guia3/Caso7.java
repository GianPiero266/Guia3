package Guia3;

import java.util.Scanner;

public class Caso7 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre..: ");
		String n = sc.nextLine();
		
		for (int x = 1 ; x <= 10 ; x++)
			System.out.println(x + " Bienvenido " + n + " al ciclo");
		
		for (int j = 10 ; j>= 0 ; j-=2)
		    System.out.println("valor " + j);
			
	}
	

}
