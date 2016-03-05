package fp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.GregorianCalendar;

public class Calculator {
	
	/*
	* CONSTANTE PARA DECENAS
	*/
	private static final String[] DECENAS = {
	    "",
	    "Diez",
	    "Veinte",
	    "Treinta",
	    "Cuarenta",
	    "Cincuenta",
	    "Sesenta",
	    "Setenta",
	    "Ochenta",
	    "Noventa"
	  };
	
	/*
	* CONSTANTE PARA UNIDADES
	*/
	 private static final String[] UNIDADES = {
		    "Cero",
		    "Uno",
		    "Dos",
		    "Tres",
		    "Cuatro",
		    "Cinco",
		    "Seis",
		    "Siete",
		    "Ocho",
		    "Nueve",
		    "Diez",
		    "Once", 
		    "Doce",
		    "Trece",
		    "Catorce",
		    "Quince",
		    "Dieciseis",
		    "Diecisiete",
		    "Dieciocho",
		    "Diecinueve",
		    "Veinte",
		    "Veintiuno",
		    "Veintidos",
		    "Veintitres",
		    "Veinticuatro",
		    "Veinticinco",
		    "Veintiseis",
		    "Veintisiete",
		    "Veintiocho",
		    "Veintinueve"
		  };

	/*
     * este metodo devuelve el Class del object que le pasamos
     */
	public static Class classTypeOf(Object x) {
		return x.getClass();
	}


	/*
     * devuelve una lista con los n números de la serie de fibonacci.
     */
	public static List<Integer> fibonacci(int n) {
		
		List<Integer> resultList = new ArrayList<Integer>();
		
		
		int fibo1 = 1;
		int fibo2 = 1;
		
		
		resultList.add(fibo2);
		for(int i=2; i<=n;i++){
			resultList.add(fibo2);
			fibo2 = fibo1+fibo2;
			fibo1 = fibo2-fibo1;
		}
		return resultList;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		
		List<Integer> resultList = new ArrayList<Integer>();
		
		
		while (number > step) {
			number = number-step;
			resultList.add(number);
		}
		
		
		int result[] = new int[resultList.size()];
		for (int i=0;i<resultList.size(); i++){
			result[i] = resultList.get(i);
		}
		return result;
	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		throw  new NotImplementedException();
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		throw  new NotImplementedException();
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		throw  new NotImplementedException();
	}
}
