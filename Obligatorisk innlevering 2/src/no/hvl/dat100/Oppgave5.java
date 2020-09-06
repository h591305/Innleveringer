package no.hvl.dat100;


import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave5 {

	public static void main(String[] args) {
	
		
		//Lag et program som leser inn en poengsum (heltall)
		//som en student har oppnådd på en prøve, 
		//og finn og skriv ut den karakteren A-F dette tilsvarer.
		
		
		
		for (int elever=0;  elever<=10 ; elever++) {
		
		int poeng = parseInt(showInputDialog("Oppgi poengsum: "));
		String karakter =null; 	
	
		
		if (poeng >= 0 && poeng<=39) {
			karakter = "F";	
		}
		
		else if (poeng >= 40 && poeng<=49) {
			karakter = "E";	
			}
	
		else if (poeng >= 50 && poeng<=59) {
			karakter = "D";	
			}
	
		else if (poeng >= 60 && poeng<=79) {
			karakter = "C";	
			}
	
		else if (poeng >= 80 && poeng<=89) {
			karakter = "B";	
			}
		
		else if (poeng >= 90 && poeng<=100) {
			karakter = "A" ;	
			}
		
		if (poeng<=100 && poeng>=0) {	
		showMessageDialog(null,"Karakteren blir: " + karakter );
		}
		
		if (poeng>100 || poeng<0) {
			showMessageDialog(null,"Feilmelding: Ugyldig poengsum! ");
		}
		
        if(poeng>100 || poeng<0) { 		
		showInputDialog("Skriv inn poengsum på nytt");
		
		}
		
		}
	}
}
	
	

