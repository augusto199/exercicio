package br.com.augusto.exercicio;

import javax.swing.JOptionPane;

public class exercicio6 {

	public static void main (String [] args) {
		float media, n1, n2, n3;
		n1 = Float.parseFloat(JOptionPane.showInputDialog("digite a nota 1"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("digite a nota 2"));
		n3 = Float.parseFloat(JOptionPane.showInputDialog("digite a nota 3"));
		media = (n1*2+n2*3+n3*5)/10;
		JOptionPane.showMessageDialog(null, "a media e " + media ); 
	}
}
