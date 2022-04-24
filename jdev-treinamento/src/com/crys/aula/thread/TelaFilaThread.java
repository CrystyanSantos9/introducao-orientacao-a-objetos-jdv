package com.crys.aula.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaFilaThread extends JDialog {
	
	//Criando um painel - Painel de componentes  - GridBagLayout para informar que ele é controlável   //Declaracao Global
		private JPanel  jPanel = new JPanel(new GridBagLayout());
		
		
		//componentes que ficarão no painel   //Declaracao Global
		private JLabel descricaoHora = new JLabel("Nome: ");
		private JTextField textoMostraTempo = new JTextField();
		
		//componentes que ficarão no painel 
		private JLabel descricaoHora2 = new JLabel("E-mail: ");
		private JTextField textoMostraTempo2 = new JTextField();
			
		
		//Componentes de ação   //Declaracao Global
		private JButton jButtonStart = new JButton("Add Lista");
		private JButton jButtonStop = new JButton("Stop");
		

		ImplementaFilaThread fila = new ImplementaFilaThread();
		
		//Criando o uma referência para objeto Thread que executará a rotina runnable - chamada dentro da action do Button 
		private Thread thread1Time;
		private Thread thread2Time;
		
		
		// Configurações iniciais da tela - ocorre na instanciação do objeot
		public TelaFilaThread() {
			
			//titulo da tela px
			setTitle("Tela de Time com Thread");
			
			//tamanho da tela
			setSize(new Dimension(240, 240));
			
			//centraliza a tela de acordo com algum componente existente
			setLocationRelativeTo(null);
			
			//não permitir redimensionar a tela
			setResizable(false);
			
			
			
			//Controlador de posicionamento de elementos na tela - usado para botões também
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			
			//iniciando posicionamento no eixo x ( da esquerda para a direita ) e y ( primeira linha de cima para baixo ) 
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			
			//funciona como o padding do html - espaço interno dos componentes em relação ao Painel
			gridBagConstraints.insets = new Insets(5,10,5,5);
			
			//Alinha componentes a esquerda do painel
			gridBagConstraints.anchor = GridBagConstraints.WEST;
			
			//informa numero de colunas que os inputs vão ocupar na tela no eixo x 
			gridBagConstraints.gridwidth = 2; //semelhante ao colspan do HTML 
			
			//Dimensionando componente na tela 
			descricaoHora.setPreferredSize(new Dimension(200, 25));
			//adicionando componente no painel
			jPanel.add(descricaoHora, gridBagConstraints);
			
			//Adicionando campo de entrada de texto
			textoMostraTempo.setPreferredSize(new Dimension(200, 25));
			//Andando 1 linha para baixo 
			gridBagConstraints.gridy ++;
			
			//adiciona texo no painel
			jPanel.add(textoMostraTempo, gridBagConstraints);
			
			// ----------  Campo do componente 2  ---------------- 
			
			
			//Title dimensão
			descricaoHora2.setPreferredSize(new Dimension(200, 25));
			
			//Andando 1 linha para baixo 
			gridBagConstraints.gridy ++;
			
			//adicionando no painel
			jPanel.add(descricaoHora2, gridBagConstraints);
			
			//Adicionando campo de entrada de texto
			textoMostraTempo2.setPreferredSize(new Dimension(200, 25));	
			//Andando 1 linha para baixo 
			gridBagConstraints.gridy ++;
			
		
			//Add componente ao painel
			jPanel.add(textoMostraTempo2, gridBagConstraints);
			
			//informa numero de colunas que os botões vão ocupar na tela no eixo x 
			//voltar a ser 1 
			gridBagConstraints.gridwidth = 1;
			
			//Add botões 
			jButtonStart.setPreferredSize(new Dimension(92, 25));
			//Andando 1 linha para baixo 
			gridBagConstraints.gridy ++;
			//add botao no painel 
			jPanel.add(jButtonStart, gridBagConstraints);
			
			//-----------------------------------ADICIONANDO ACAO ---------- -----------------------//
			
			jButtonStart.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					if(fila == null ) {
						fila = new ImplementaFilaThread();
						fila.start();
					}
					
					for(int qtd = 0; qtd < 100; qtd ++) {
						
					
					ObjetoFilaThread objetoEmProcessamento = new ObjetoFilaThread();
					objetoEmProcessamento.setNome(textoMostraTempo.getText() + "Id processo : " + qtd);
					objetoEmProcessamento.setEmail(textoMostraTempo2.getText());
					
					fila.add(objetoEmProcessamento);
					
					}
					
				}
				
			});
			
			jButtonStop.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					try {
						
						if(fila == null ) {
							JOptionPane.showMessageDialog(null, "É necessário iniciar um fila.");
						}
						
						fila.stop();	
						fila = null; 
						
					} catch (Exception e1) {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Tente novamente.");
					}
					
				}
			});
			
			
			//Add botões 
			jButtonStop.setPreferredSize(new Dimension(92, 25));
			//Andando 1 linha para baixo 
			gridBagConstraints.gridx ++;
			jPanel.add(jButtonStop, gridBagConstraints);
		
			fila.start();
			//Adicionando painel e posicionando a esquerda do Tela principal 
			add(jPanel, BorderLayout.WEST);
			
			// Último comando a ser executado. 
			setVisible(true); // deixar tela visível  - 
			
		}
	
}
