package br.com.augusto.exercicio;

import javax.swing.JOptionPane;

public class exerciciopolegadas3 {
	
	public static void main (String [] args) {
		float polegadas, equivalencia;
		String polegadasstr, equivalenciastr;
		polegadasstr = JOptionPane.showInputDialog("digite a medida em polegadas");
		polegadasstr = polegadasstr.replace(",", ".");
		polegadas = Float.parseFloat(polegadasstr);
		equivalencia = polegadas*2.54f;  
		equivalenciastr = String.valueOf(equivalencia);
		equivalenciastr = equivalenciastr.replace(".", ",");
		JOptionPane.showMessageDialog(null, "a equivalencia em cm e "+equivalenciastr);	
	}
}
