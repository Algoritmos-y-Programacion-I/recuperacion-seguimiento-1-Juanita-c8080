/*
* Analisis
* Descripcion del programa: Un programa con 5 ejercicios, cada uno completa una tarea diferente
* Entradas: int parametro1, parametro2, parametro3, entero;
	String nombre, palabra1, palabra2, palabra3, posicion1, posicion2;
	double a, b, c;
* Salidas: int cantidadIguales, longitudes;
	String holachao, buscariguales, x;
	double x1, x2;
* Ejemplo:
Hola, a continuación escribe 3 números, te dire cuantos son iguales
5
7
9
De los números dados hay 0 números iguales
Por favor dime tu nombre, después digita 1 o 0
valentina
0
Chao valentina
Ingresa tres palabras
feliz
arroz
piña
Las palabras con 4 caracteres o más son: 3
Regalame dos palabras más, te diré si hay una letra igual en la posición 2
sueños
televisor
false
Por último dame otros 3 números, con ellos calcularé las raices de una ecuación cuadrática de la forma: ax^2 + bx + c
15
21
6
los resultados de la fórmula cuadrática usando los números:
 A= 15.0
 B= 21.0
 C= 6.0
 Es:15.0
 x1= -0.4
 x2= -1.0
*/

package ui;

import java.util.Scanner;
import java.lang.Math;

public class RecuperacionSeguimiento1 {

	private Scanner escaner;

    // Declaracion de constantes 
	final int RAIZ_1 = -4;
	final int RAIZ_2 = 2;

	private RecuperacionSeguimiento1() {
		escaner = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		RecuperacionSeguimiento1 mainApp = new RecuperacionSeguimiento1();
		mainApp.run();
	}
	
	public void run() // Aqui en el metodo run hacemos lo de nuestro metodo main. Solo entrada de datos, mensajes al usuario y mostrar salidas
	{   
    
        //Ejercicio 1
		

		// Declaracion de info a pedir del usuario 
		int parametro1, parametro2, parametro3;
        
        // Pedir info al usuario 
		System.out.println("Hola, a continuación escribe 3 números, te dire cuantos son iguales");
        parametro1 = escaner.nextInt();
		parametro2 = escaner.nextInt();
		parametro3 = escaner.nextInt();
		escaner.nextLine(); //para evitar el bug del scanner

		// Declaracion de salidas calculadas 
		int cantidadIguales;
       
        // Calculo de salidas mediante metodos 
        cantidadIguales = ejercicio1 (parametro1, parametro2, parametro3);

        // Mostramos las salidas al usuario
		System.out.println("De los números dados hay " + cantidadIguales + " números iguales");
		

		//Ejercicio 2


		// Declaracion de info a pedir del usuario 
		int entero;
		String nombre;

		// Pedir info al usuario
		System.out.println("Por favor dime tu nombre, después digita 1 o 0");
		nombre = escaner.nextLine();
		entero = escaner.nextInt();
		escaner.nextLine();

		// Declaracion de salidas calculadas 
		String holachao;

		// Mostramos las salidas al usuario
		if (entero == 0 || entero == 1){
			System.out.println(holachao = ejercicio2(entero, nombre));
		}else {
			System.out.println("Error entradas inválidas");
		}


		//Ejercicio 3


		// Declaracion de info a pedir del usuario 
		String palabra1, palabra2, palabra3;

		// Pedir info al usuario
		System.out.println("Ingresa tres palabras");
		palabra1 = escaner.nextLine();
		palabra2 = escaner.nextLine();
		palabra3 = escaner.nextLine();

		// Declaracion de salidas calculadas 
		int longitudes;

		// Calculo de salidas mediante metodos 
		longitudes = ejercicio3 (palabra1,palabra2,palabra3);
		
		// Mostramos las salidas al usuario
		System.out.println("Las palabras con 4 caracteres o más son: "+ longitudes);
		

		//Ejercicio 4


		// Declaracion de info a pedir del usuario 
		String posicion1, posicion2;

		// Pedir info al usuario
		System.out.println("Regalame dos palabras más, te diré si hay una letra igual en la posición 2");
		posicion1 = escaner.nextLine();
		posicion2 = escaner.nextLine();

		// Declaracion de salidas calculadas 
		String buscariguales = "";

		// Calculo de salidas mediante metodos 
		if(posicion1.length() > 2 && posicion2.length() > 2){
			buscariguales += ejercicio4(posicion1, posicion2);
		} else {
			buscariguales += "Error entradas invalidas";
		}
		
		// Mostramos las salidas al usuario
		System.out.println(buscariguales);


		//Ejercicio 5


		// Declaracion de info a pedir del usuario 
		double a, b, c;

		// Pedir info al usuario
		System.out.println("Por último dame otros 3 números, con ellos calcularé las raices de una ecuación cuadrática de la forma: ax^2 + bx + c");
		a = escaner.nextDouble();
		b = escaner.nextDouble();
		c = escaner.nextDouble();
		escaner.nextLine();

		// Declaracion de salidas calculadas 
		double x1, x2;
		String x;

		// Calculo de salidas mediante metodos 
		x = ejercicio5 (a,b,c);

		// Mostramos las salidas al usuario
		System.out.println(x);
	}

	/**
	 * Descripción: el método ejercicio1 compara los parámetros y dependiendo de cuantos sean iguales usando operadores lógicos, devuelve un valor. 
	 * @param int parametro1 el primer numero a comparar
	 * @param int parametro2 el segundo numero a comparar
	 * @param int parametro3 el tercer numero a comparar
	 * @return int el numero 3,2 o 0 dependiendo de cuantos parámetros sean iguales a otros
	 */
	public int ejercicio1(int parametro1, int parametro2, int parametro3) {
		
		if (parametro1 == parametro2 && parametro1 == parametro3 && parametro2 == parametro3){
			return 3;
		} else if (parametro1 == parametro2 || parametro1 == parametro3 || parametro2 == parametro3){
			return 2;
		}
		return 0;
	}

	/**
	 * Descripción: Le asigna a los enteros un String usando condicionales.
	 * @param int entero el número 1 o 0 
	 * @param String nombre corresponde al nombre que el usuario ya nos dio
	 * @return String una cadena dependiendo del condicional y un null si ninguno se cumple
	 */
	public String ejercicio2(int entero, String nombre) {
		if (entero == 1){
			return "Hola " + nombre;
		} else if (entero == 0){
			return "Chao " + nombre;
		} else {
			return null;
		}
	}

	/**
	 * Descripción: Usando la función .length() y un condicional evalua si los carácteres son suficientes, en caso de que lo sean, usa al contador para contarlo
	 * @param String palabra1 primera palabra que nos da el usuario
	 * @param String palabra2 segunda palabra que nos da el usuario
	 * @param String palabra3 tercera palabra que nos da el usuario
	 * @return int contador que cuenta las veces que se cumplió para devolver un número
	 */
	public int ejercicio3(String palabra1, String palabra2, String palabra3){
		int contador = 0;
		if (palabra1.length() >= 4){
			contador++;
		} 
		if (palabra2.length() >= 4){
			contador++;
		} 
		if (palabra3.length() >= 4){
			contador++;
		}   return contador;
	}

	/**
	 * Descripción: usa .charAt() para encontrar el caracter en la posición indicada
	 * @param String posicion1 primera palabra dada por el usuario
	 * @param String posicion2 segunda palabra dada por el usuario
	 * @return boolean devuelve verdadero o falso de acuerdo a sii se cumple el condicional o no
	 */
	public boolean ejercicio4(String posicion1, String posicion2) {
		boolean resultado = false;
		if(posicion1.charAt(2) == posicion2.charAt(2)){
				resultado = true;
		}
		return resultado;
	}

	/**
	 * Descripción: calcula la formula cuadrática usando 3 numeros
	 * @param a primera variable en una ecuación de segundo grado
	 * @param b segunda variable en una ecuación de segundo grado
	 * @param c tercera variable en una ecuación de segundo grado
	 * @return String, primero tiene un mensaje para números imaginarios, luego muestra mensajes que luego se pondran en un print en el main con las dos respuestas de la fórmula cuadrática
	 */
	public String ejercicio5 (double a, double b, double c) {
		double discriminante = (Math.pow (b,2))+(RAIZ_1*a*c);
		if (discriminante<0){
			return "La respuesta no es un número real";
		}
		double x1 = (-b+(Math.sqrt(discriminante)))/(RAIZ_2*a);
		double x2 = (-b-(Math.sqrt(discriminante)))/(RAIZ_2*a);
	
		return "los resultados de la fórmula cuadrática usando los números:"+
		"\n A= " + a +
		"\n B= " + b +
		"\n C= " + c +
		"\n Es:" + a +
		"\n x1= " + x1 +
		"\n x2= " + x2;
 
	}
}