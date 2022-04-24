package com.crys.principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaBancaria conta = new ContaBancaria();
		
		conta.setDescricao("Conta do Crystyan");
		
		conta.soma100Reais();
		conta.soma100Reais();
		conta.soma100Reais();
		
		System.out.println(conta);
		
		conta.sacar(500);
		
		System.out.println(conta);
	}

}
