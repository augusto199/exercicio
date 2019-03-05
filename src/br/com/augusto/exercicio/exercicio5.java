package br.com.augusto.exercicio;

import javax.swing.JOptionPane;

public class exercicio5 {
	
	public static void main (String [] args) {
		int evento, segundos, minutos, horas;
		evento = Integer.parseInt(JOptionPane.showInputDialog("digite o tempo do evento em segundos"));
		horas = evento/3600;
		segundos = evento - 3600*horas;
		minutos = segundos/60;
		segundos = segundos - minutos *60; 
		JOptionPane.showMessageDialog(null, horas + "h:" + minutos + "m:" + segundos+"s");
		
	}

}
