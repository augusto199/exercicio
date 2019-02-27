package br.com.augusto.exercicio;


import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main (String[] args) {
		float raio, area; 
		raio = Float.parseFloat(JOptionPane.showInputDialog("digite o valor do raio"));
		area = (float) (Math.PI*Math.pow(raio, 2));
		JOptionPane.showMessageDialog(null, "a area do circulo e "+area);
	}
}
