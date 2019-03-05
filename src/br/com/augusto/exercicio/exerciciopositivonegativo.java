package br.com.augusto.exercicio;

import javax.swing.JOptionPane;

public class exerciciopositivonegativo {
	public static void main (String [] args) { 
		int numero; 
		numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
		
		if (numero>0){
			JOptionPane.showMessageDialog(null, "esse numero e positivo");
		
		}
		else {
			JOptionPane.showMessageDialog(null, "esse numero e negativo");
		}
	}

}
