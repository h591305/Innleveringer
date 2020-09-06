package no.hvl.dat100;


import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;


public class Oppgave4 {

	public static void main(String[] args) {
		
     //Lag et program som leser inn bruttoinntekt,
	// beregner og skriver ut trinnskatten.
		
		
		double inntekt = parseDouble(showInputDialog("Oppgi inntekt: "));
		double skatt = 0;
		
		double trinn_0 = 0;
        double trinn_1 = 0.0093;
        double trinn_2 = 0.0241;
        double trinn_3 = 0.1152;
        double trinn_4 = 0.1452;
        
        if ((inntekt>=0)&&(inntekt<=161000)) {
        	skatt = inntekt *trinn_0;
        }
        else if ((inntekt>=161001)&&(inntekt<=230950)) {
        	skatt = inntekt *trinn_1;
        }
        
        else if ((inntekt>=230951)&&(inntekt<=580650)) {
        	skatt = inntekt *trinn_2;
        }
        
        else if ((inntekt>=580651)&&(inntekt<=934050)) {
        	skatt = inntekt *trinn_3;
        }
        
        else if (inntekt>=934051) {
        	skatt = inntekt *trinn_4;
        }
	
     
	showMessageDialog(null,"Skatten du betaler er: " + skatt + " kr");
	}

}
