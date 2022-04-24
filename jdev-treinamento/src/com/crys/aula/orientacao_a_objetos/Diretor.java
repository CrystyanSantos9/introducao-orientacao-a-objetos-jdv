package com.crys.aula.orientacao_a_objetos;

import com.crys.interfaces.jdev.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {
	
	private String RegistroEducao;
	private int TempoDirecao;
	private String Titulacao;
	
	private String login;
	private String password;
	
	public Diretor(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public Diretor() {
		
	}
	
	
	public String getRegistroEducao() {
		return RegistroEducao;
	}
	
	public void setRegistroEducao(String registroEducao) {
		RegistroEducao = registroEducao;
	}
	public int getTempoDirecao() {
		return TempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		TempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return Titulacao;
	}
	public void setTitulacao(String titulacao) {
		Titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Diretor [RegistroEducao=" + RegistroEducao + ", TempoDirecao=" + TempoDirecao + ", Titulacao="
				+ Titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomPai="
				+ nomPai + "]";
	}

	@Override
	public double Salario() {
		// TODO Auto-generated method stub
		return 4900.50;
	}
	
	@Override
	public boolean autenticar(String login, String password) {
		
		this.login = login;
		this.password = password;
		
		return autenticar();
	}
	
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("admin") && password.equals("admin");
	}
	

	
}
