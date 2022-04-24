package com.crys.aula.thread;

import javax.swing.JOptionPane;

public class ExecutaThread2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		Inicia o processamento paralelo - não trava a linha de execução principal
		
		new Thread() {
			
//			Executa a rotina pesada 
			public void run () {
				for(int pos =0; pos < 3; pos ++) {
					
					
//					Enviar emails respeitando faixa de tempo de espera de envio
//					Devemos tratar a exceção lançada pela thread 
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
//					Vai esperar 1 segundo para enviar uma mensagem 
					System.out.println("Enviando email : id cliente " + pos);
					JOptionPane.showMessageDialog(null, "Processamento do cliente " + pos + " chegou ao fim.");
					
//					Util para geração de pdf ou para envio de e-mail ser realizado pelo OS
				}
			}
			
		}.start();  /* Ligando a thread - iniciando a execução */
		
		
		
//		O código acima - o Thread.sleep travaria a linha de execução principal do Sistema
//		Essa parte só apareceria após o término da thread
		System.out.println("Chegou ao fim do código de teste da thread");
		JOptionPane.showMessageDialog(null, "Sistema continua executando em background");

	}

}
