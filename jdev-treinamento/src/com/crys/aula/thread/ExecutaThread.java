package com.crys.aula.thread;

public class ExecutaThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		for(int pos =0; pos < 3; pos ++) {
			
			
//			Enviar emails respeitando faixa de tempo de espera de envio
//			Devemos tratar a exceção lançada pela thread 
			Thread.sleep(3000);
//			Vai esperar 1 segundo para enviar uma mensagem 
			System.out.println("Enviando email : id cliente " + pos);
			
//			Util para geração de pdf ou para envio de e-mail ser realizado pelo OS
		}
	}

}
