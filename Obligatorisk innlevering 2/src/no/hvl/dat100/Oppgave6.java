package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;


public class Oppgave6 {

	public static void main(String[] args) {
		//Lag et program som leser inn et heltall n > 0, 
		//beregner verdien n! (n fakultet) 
		//og skriver verdien til n! der n! = 1\*2\*3\*…\*(n-1)\*n.

		int n = parseInt(showInputDialog("Skriv inn et tall"));
		int svar = 1;
		
		for (int i = 1; i<=n; i++) {
		if (n>0) { 
         	 
		 svar=svar * i;
		 }
		showMessageDialog(null,svar);
		}
		}
		 
}
