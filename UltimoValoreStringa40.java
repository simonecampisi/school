import java.util.Scanner;

public class ultimoValoreStringa {
	public static void main (String args[]) {
	   Scanner ins = new Scanner (System.in);
	   
	   String stringa = ins.next();
	   char c = stringa.charAt(stringa.length()-1);
	   System.out.println("C: "+c);
	   
	}
}
