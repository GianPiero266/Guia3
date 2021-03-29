package Guia3;

import java.util.Scanner;

public class Caso6 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nr = 0, edad = 0, num_aptos=0;
		String nombre = "", estado = "", continuar = "S";
		
		while (continuar.equals("S") || continuar.equals("s") ) {
			nr++;
			System.out.println("----------------------");
			System.out.println("-------REGISTRO[" + nr + "]-------");
			System.out.println("----------------------");
			
			System.out.println("Ingrese nombre de participante.......: ");
			nombre = sc.nextLine();
			
			System.out.println("Ingrese edad del participante...: ");
			edad = sc.nextInt(); 
			
			if (edad>=18) {
				estado = "Si es apto para votar";
				num_aptos++;
			}	
			else 
				estado = "Menor de edad";
			
			
			System.out.println("ESTADO---: " + estado);
			
			
			sc.nextLine();
			
			System.out.println("¿Desea resgitrar otro participante <S/N>: ");
			continuar = sc.nextLine();
			
			}
		
		System.out.println("-- R E S U M E N --");
		System.out.println("Cantidad de participantes....:" + nr);
		System.out.println("Participantes aptos para votar..: " + num_aptos);
	
		
	}
	
}
	


