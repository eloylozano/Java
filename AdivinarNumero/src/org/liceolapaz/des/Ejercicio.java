package org.liceolapaz.des;

import java.util.Scanner;

public class Ejercicio {

	public static void menu() {

		System.out.println("\nADIVINA EL NÚMERO");
		System.out.println("1. Del 1 al 10 (3 intentos)");
		System.out.println("2. Del 1 al 50 (5 intentos)");
		System.out.println("0. Salir");

	}

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);

		int opcion=0;
		int aleatorio=0;
		int numeroIntentos=0;
		int contadorIntentos=0;
		int respuesta=0;

		boolean fin=false;

		while (!fin) {

			menu();

			System.out.println("Escoja una opción: ");
			opcion=entrada.nextInt();

			switch (opcion) {
			case 1: 
				aleatorio=(int) (Math.random()*10)+1;
				numeroIntentos=3;
				contadorIntentos=1;

				while (numeroIntentos>0) {
					System.out.println("Escriba el numero: ");
					respuesta=entrada.nextInt();

					if (respuesta>aleatorio) {
						System.out.println("El número a adivinar es menor");
					}
					else if (aleatorio>respuesta) {
						System.out.println("El número a adivinar es mayor");
					}
					else {
						System.out.println("Has acertado el número en "+contadorIntentos+" intentos");
					}		

					contadorIntentos++;
					numeroIntentos--;

					if (numeroIntentos==0){						
						System.out.println("No ha acertado el número máximo de intentos. El número era "+aleatorio);
					}

				}

				break;
			case 2:

				aleatorio=(int) (Math.random()*50)+1;
				numeroIntentos=5;
				contadorIntentos=1;
				
				while (numeroIntentos>0) {
					System.out.println("Escriba el numero: ");
					respuesta=entrada.nextInt();

					if (respuesta>aleatorio) {
						System.out.println("El numero a adivinar es menor");
					}
					else if (aleatorio>respuesta) {
						System.out.println("El numero a adivinar es mayor");
					}
					else {
						System.out.println("Has acertado el número en "+contadorIntentos+" intentos");
						numeroIntentos=0;
					}		

					contadorIntentos++;
					numeroIntentos--;
					
					if (numeroIntentos==0){						
						System.out.println("No ha acertado el número máximo de intentos. El número era "+aleatorio);
					}

				}
				
				break;
			case 0: 
				fin=true;
				System.out.println("Programa finalizado");
				break;
			default: System.out.println("Opcion errónea");
			}

		}


		entrada.close();

	}

}
