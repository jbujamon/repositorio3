package svn;

import java.util.ArrayList;
import java.util.List;





public class operarArrays {

	int[]array=new int[20];
	
	private int numAzar;
	private int suma = 0;
	
	
	/*Método que median un Math.random genera y devuelve un número al azar entre dos limites introducidos manualmente*/
	public static int obtenerNumeroAzar (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;
	}
	
	
	/*Método en el cual utilizamos un bucle for donde durante la longuitud del array especificada anteriormente,
	 generamos un numero al azar entre 1 y 20 , donde cada uno de ellos se va insertado en una posición del array
	 uno a continuación del otro*/
	public void rellanaArray (){
		for(int i = 0; i < array.length;i++) {
			numAzar = obtenerNumeroAzar(1,20);
			 array[i]=numAzar;
		}
		imprimirArray();
		sumarArray();
		elementosImpares();
	}
	
	
	/*Método que devuelve un String sacando por pantalla los numeros introducidos en el array*/
	public String imprimirArray() {
		return "Los numero introducidos en el array son :" + array;
	}
	
	
	/*Método que devuelve un Strind sacando por pantalla la suma de los elementos del array
	 después de hacerle un recorrido al array ya relleno para sacar la suma de sus elementos 
	 y los elementos menores de 10*/
	public String sumarArray() {
		for(int i =0; i < array.length; i++) {
			suma+= array[i];
			if( i < 10) {
				return"Los numero menores de 10 son: " + array[i];
			}
		}		
		
		return "La suma de los elementos es: " + suma;
	}
	
	/*Método que muestra los elementos impares dentro del array*/
	public String elementosImpares() {
		for(int i=0; i < array.length;i++) {
			if(array[i] % 2 != 0){
				return"Los elementos impares son: " +array[i];
			}
		}
		return"No hay elementos impares";
	}
	
	/*Método que muestra los elementos pares dentro del array*/
	public String mostrarPares() {
		for(int i = 0; i < array.length;i++) {
			if(array[i] % 2 == 0 ) {
				 return"Los numeros pares son: " + i;
			}
		} 
		return"No hay numeros pares";
	}
	
	/*
	 * Método que saca por pantalla "Todo va bien"
	 */
	public void nuevoMetodo2(){
		System.out.println("Todo va bien 2");
	}
}
