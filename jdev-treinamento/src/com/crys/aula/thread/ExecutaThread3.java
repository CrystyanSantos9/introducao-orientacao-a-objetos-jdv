package com.crys.aula.thread;

import javax.swing.JOptionPane;

public class ExecutaThread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Inicia o processamento paralelo - n�o trava a linha de execu��o principal
		
		new Thread() {
			
//			Executa a rotina de envio de email
			public void run () {
				for(int pos =0; pos < 3; pos ++) {
					
					
//					Enviar emails respeitando faixa de tempo de espera de envio
//					Devemos tratar a exce��o lan�ada pela thread 
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
//					Vai esperar 1 segundo para enviar uma mensagem 
					System.out.println("Enviando email : id cliente " + pos);
//					JOptionPane.showMessageDialog(null, "Envio de email do cliente " + pos + " chegou ao fim.");
					
//					Util para gera��o de pdf ou para envio de e-mail ser realizado pelo OS
				}
			}
			
		}.start();  /* Ligando a thread - iniciando a execu��o */
		
		
		
		/* --------------------------------------------------- */
//		Rotina de envio de nota fiscal 
	  new Thread() {
			
//			Executa a rotina de envio de email
			public void run () {
				for(int pos =0; pos < 3; pos ++) {
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
//					Vai esperar 1 segundo para enviar uma mensagem 
					System.out.println("Enviando Nota Fiscal : N� " + pos);
//					JOptionPane.showMessageDialog(null, "Envio de NTF n� " + pos + " chegou ao fim.");
					
				}
			}
			
		}.start();  /* Ligando a thread - iniciando a execu��o */
		
		
//		Threads v�o intercalar - trablahando paralelamente 
		
//		O c�digo acima - o Thread.sleep travaria a linha de execu��o principal do Sistema
//		Essa parte s� apareceria ap�s o t�rmino da thread
		System.out.println("Chegou ao fim do c�digo de teste da thread");
		JOptionPane.showMessageDialog(null, "Sistema continua executando em background");
		
	}

}
