package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave1
{
		
	public static void main(String[] args) {
		String pris = showInputDialog("Tast inn pris");
		String bel�p = showInputDialog("Tast inn betalt bel�p");
		int p = parseInt (pris);
		int b = parseInt (bel�p);
		// v = vekslepenger 
		int v = b - p;
		
		if (b < p) {
			showMessageDialog (null,"Kundern har betalt for lite");
		}else {
				 				
		int tikroner = v/10;
		int enkroner = v%10;			
		
		showMessageDialog (null,"vekslepenger totalt er " + v +"\n"
		+ tikroner+" tiere" +"\n"
		+ enkroner+" en kroner" );
	}
	}
}
