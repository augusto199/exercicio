package br.com.augusto.exercicio;

import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main (String [] args) {
		float N;
		N = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero"));
		if ( N<=10 ) {
			JOptionPane.showMessageDialog(null, "F1");
		} else if(N>10 && N <= 100) {
			JOptionPane.showMessageDialog(null, "F2");
		} else {
			JOptionPane.showMessageDialog(null, "F3");
		}
	}
}
