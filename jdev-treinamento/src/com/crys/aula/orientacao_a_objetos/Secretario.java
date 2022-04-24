package com.crys.aula.orientacao_a_objetos;

import com.crys.interfaces.jdev.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
	
	private String Registro;
	private String NivelCargo;
	private String Experiencia;
	
	private String login;
	private String password;
	
	
	public Secretario(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public Secretario() {
		
	}
	
	
	
	

	public String getRegistro() {
		return Registro;
	}
	
	public void setRegistro(String registro) {
		Registro = registro;
	}
	public String getNivelCargo() {
		return NivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		NivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return Experiencia;
	}
	public void setExperiencia(String experiencia) {
		Experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [Registro=" + Registro + ", NivelCargo=" + NivelCargo + ", Experiencia=" + Experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomPai=" + nomPai + "]";
	}
	@Override
	public double Salario() {
		// TODO Auto-generated method stub
		return 3500;
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
