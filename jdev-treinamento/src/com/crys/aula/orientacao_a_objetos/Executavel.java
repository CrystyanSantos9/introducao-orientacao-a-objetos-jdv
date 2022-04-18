package com.crys.aula.orientacao_a_objetos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import constantes.StatusAluno;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		for (int qtd =0; qtd<= 5; qtd++) { 
		
		String nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		
		for(int pos=1; pos <=1; pos++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if(escolha == 0) {
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while(continuarRemover == 0) {
			String discipliaRemover = JOptionPane.showInputDialog("Qual disciplina gostaria de remover ? 1, 2, 3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(discipliaRemover).intValue() - posicao);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");
			
			}
			
		}
		
			alunos.add(aluno1);
		
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno: alunos) {
			
			if(aluno.isAprovado().equalsIgnoreCase(StatusAluno.APROVADO)){
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.isAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else if (aluno.isAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
			
		}
		
		
		System.out.println("---------------------------- Lista dos Aprovados -----------------------------");
		for (Aluno aluno: maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado = "+ aluno.isAprovado() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("---------------------------- Lista dos Recuperados -----------------------------");
		for (Aluno aluno: maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado = "+ aluno.isAprovado() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("---------------------------- Lista dos Reprovados -----------------------------");
		for (Aluno aluno: maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado = "+ aluno.isAprovado() + " com média de = " + aluno.getMediaNota());
		}
	
	}

}
