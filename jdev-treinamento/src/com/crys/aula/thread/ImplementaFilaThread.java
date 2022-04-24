package com.crys.aula.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementaFilaThread extends Thread{
	
		private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
									new ConcurrentLinkedQueue<ObjetoFilaThread>() {};
			
		public static void add(ObjetoFilaThread objetoDaFilaThread) {
			pilha_fila.add(objetoDaFilaThread);
		}
		
		@Override
		public void run() {
			
			System.out.println(" ------------  Fila em execução ---------------");
			
			while(true) {
				
				Iterator iteracao = pilha_fila.iterator();
				
				synchronized(iteracao) {
			
					while(iteracao.hasNext()) {
						
						ObjetoFilaThread processaRotina = (ObjetoFilaThread) iteracao.next(); 
						
						/*
						 *  Aqui recebemos uma outra classe java que faria a operação em backgrou
						 *  
						 *  Exemplo:
						 *  
						 *  Processar 10 mil notas fiscais
						 *  
						 *  Gerar lista enorme de PDF 
						 *  
						 *  Gerar um envio em massa de email
						 *  
						 */
						
						System.out.println("Processando cliente : " + processaRotina.getNome());
						System.out.println("Enviando e-mail : " + processaRotina.getEmail());
						
						
						iteracao.remove();
						
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
			
			//Mais um tempinho fora do while para não sobrecarrregarmos o sistema
			//limpar a memória do sistema, para receber um nova carga de dados
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
				
}
