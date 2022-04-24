package com.crys.principio.responsabilidade;

public class ContaBancaria {
	private double saldo = 8000;
	private String descricao;
	
	public void soma100Reais() {
		saldo += 100; 
	}
	
	public void diminui100Reais() {
		saldo -= 100; 
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo -= valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [saldo=" + saldo + ", descricao=" + descricao + "]";
	}
	
	
	
	
}
