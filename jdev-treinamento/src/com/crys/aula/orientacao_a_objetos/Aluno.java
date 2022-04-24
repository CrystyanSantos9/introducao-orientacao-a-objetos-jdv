package com.crys.aula.orientacao_a_objetos;

import java.util.ArrayList;
import java.util.List;

import constantes.StatusAluno;

public class Aluno extends Pessoa {
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
    private List<Disciplina> disciplinas = new ArrayList<>();
    
    public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
    
    public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	


	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}



	public double getMediaNota(){
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina: disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / disciplinas.size();
	}

	

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String isAprovado() {
		double media = this.getMediaNota();
	
		if(media >= 50) {
			if(media >=70) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}
	

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	
	

	
	


	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + ", nome=" + nome + ", idade=" + idade
				+ ", dataNascimento=" + dataNascimento + ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf
				+ ", nomeMae=" + nomeMae + ", nomPai=" + nomPai + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}

	
	
	@Override
	public boolean pessoaMaiorIdadade() {
		// TODO Auto-generated method stub
		return idade >= 21;
	}
	
	public String msgMaiorDeIdade() {
		return this.pessoaMaiorIdadade() ? "Aluno é maior de idade." : "Aluno é menor de idade.";
	}

	@Override
	public double Salario() {
		// TODO Auto-generated method stub
		return 700;
	}
	
	
}

