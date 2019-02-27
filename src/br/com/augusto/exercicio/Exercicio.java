package br.com.augusto.exercicio;

import javax.swing.JOptionPane;

public class Exercicio {
	public static void main(String args[]) {
		float base, altura, area;
		base = Float.parseFloat(JOptionPane.showInputDialog("digite o valor da base em cm"));
		altura = Float.parseFloat(JOptionPane.showInputDialog("digite o valor da altura em cm"));
		area = base * altura;
		JOptionPane.showMessageDialog(null, "o retangulo tem "+area+" cm2");
	}
}
