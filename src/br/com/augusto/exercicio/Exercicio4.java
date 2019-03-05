package br.com.augusto.exercicio;


import javax.swing.JOptionPane;import com.sun.webkit.ContextMenu.ShowContext;

public class Exercicio4 {
	

	public static void main (String[] args) {
		float desconto10, desconto5, salario, salarioliquido;
		desconto10 = 0.9f;
		desconto5 = 0.95f;
		salario = Float.parseFloat(JOptionPane.showInputDialog("digite o valor do salario"));
		salarioliquido = desconto10*salario;
		salarioliquido = desconto5*salarioliquido;
		JOptionPane.showMessageDialog(null, "o salario liquido e " + salarioliquido);
		
	}
	
}
