package br.com.augusto.exercicio;


import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		float kmh , ms; 
		kmh = Float.parseFloat(JOptionPane.showInputDialog("digite a velocidade em km/h"));
		ms = kmh/3.6f; 
		JOptionPane.showMessageDialog(null, "a velocidade e "+ms+" m/s");
	}
}
