package com.crys.aula.tipos_e_variaveis;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		System.out.println("A quantidade carros � : " + carros);

		double carrosNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		
		int divisao = (int) (carrosNumero / pessoaNumero);
		
		double resto = carrosNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null , "Raz�o de carros por pessoa : " + divisao);
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver quantos carros sobraram?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null , "Carros que sobraram : " + resto);
		}
	}

}
