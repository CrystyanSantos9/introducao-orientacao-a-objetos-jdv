package com.crys.aula.tipos_e_variaveis;

public class ComandoSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int nota1 = 90;
			int nota2 = 90;
			int nota3 = 60;
			int nota4 = 25;	
			int media = 0;
			
			media = (nota1 + nota2 + nota3 + nota4)/4;
			
			switch(media) {
			case 70:
				System.out.println("Aluno aprovado" + media);
				break;
				
			default: System.out.println("Outro valor de média " + media);
			}

	}

}
