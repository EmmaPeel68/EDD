package fp;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Pattern;
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
		
		if (n==0){
			return null;
		}
		
		List<Integer> resultList = new ArrayList<Integer>();
		for (int i=20; i>0; i--){
			if (n%i==0){
				resultList.add(i);
			}
		}
		
		int result[] = new int[resultList.size()];
		for (int i=0;i<resultList.size(); i++){
			result[i] = resultList.get(i);
		}
		return result;
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		
		if ( cadena == null ){
			return false;
		}		

		String cadenaTemp = deAccent(cadena);	
		cadenaTemp = cadenaTemp.replaceAll("[^a-zA-Z0-9]", "");
		
		String cadenaTempRev = new StringBuilder(cadenaTemp).reverse().toString();
		
		return cadenaTemp.equalsIgnoreCase(cadenaTempRev);
	}

	/**
	 *  @see <a href="http://stackoverflow.com/questions/1008802/converting-symbols-accent-letters-to-english-alphabet"/>
	 */
	private static String deAccent(String str) {
	    String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD); 
	    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	    return pattern.matcher(nfdNormalizedString).replaceAll("");
	}	

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		
		if (n>=0 && n<100){
			
			if (n>=0 && n<30){
				return UNIDADES[n];
			} else {
				
				String text = DECENAS[n/10];
				
				
				if (n%10 != 0){
					
					text = text + " y ";
					text = text + UNIDADES[n%10].toLowerCase(); 
				} 
				return text;
			}
		} else {
			
			return null;
		}
		
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
