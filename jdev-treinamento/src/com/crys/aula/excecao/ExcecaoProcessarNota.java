package com.crys.aula.excecao;

public class ExcecaoProcessarNota extends Exception {

	public ExcecaoProcessarNota(String erro) {
		super("Erro ao processar arquivo com nota do aluno :: " + erro);
	}
	
}
