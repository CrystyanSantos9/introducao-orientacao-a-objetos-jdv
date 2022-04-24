package com.crys.aula.classesauxiliares;

import com.crys.interfaces.jdev.PermitirAcesso;

public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

	public boolean autenticarClasse() {
		return permitirAcesso.autenticar();
	}
}
