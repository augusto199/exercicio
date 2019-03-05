package br.com.augusto.exercicio;

import javax.swing.JOptionPane;

public class exercicioparimpar {
	public static void main (String [] args) { 
		int resto, numero; 
		numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
		resto = numero%2; 
		if (resto == 0) {
			JOptionPane.showMessageDialog(null, "esse numero e par");
			
		}else {
			JOptionPane.showMessageDialog(null, "esse numero e impar");
		}
		
	}

}
