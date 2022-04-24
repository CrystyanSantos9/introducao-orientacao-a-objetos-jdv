package com.crys.aula.thread;

import javax.swing.JOptionPane;

public class ExecutaRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criando objeto thread passando interface como argumento
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();
		
		
	
	}
	
	//Criando thread através de interface
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			//Rotina pesada
			
			for(int pos =0; pos < 3; pos ++) {	
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Enviando email : id cliente " + pos);
					JOptionPane.showMessageDialog(null, "Processamento do cliente " + pos + " chegou ao fim.");
					
				}
			
		}
	};

	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int pos =0; pos < 3; pos ++) {
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
//				Vai esperar 1 segundo para enviar uma mensagem 
				System.out.println("Enviando Nota Fiscal : Nº " + pos);
//				JOptionPane.showMessageDialog(null, "Envio de NTF nº " + pos + " chegou ao fim.");
				
			}
		}
	};
}
