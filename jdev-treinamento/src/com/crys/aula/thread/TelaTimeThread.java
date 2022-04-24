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
import javax.swing.JPanel;
import javax.swing.JTextField;

// Estendemos o JDialog que faz parte do framework swing 

public class TelaTimeThread extends JDialog {
	 
	//Criando um painel - Painel de componentes  - GridBagLayout para informar que ele é controlável   //Declaracao Global
	private JPanel  jPanel = new JPanel(new GridBagLayout());
	
	
	//componentes que ficarão no painel   //Declaracao Global
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField textoMostraTempo = new JTextField();
	
	//componentes que ficarão no painel 
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField textoMostraTempo2 = new JTextField();
		
	
	//Componentes de ação   //Declaracao Global
	private JButton jButtonStart = new JButton("Start");
	private JButton jButtonStop = new JButton("Stop");
	
	
	//Criando o objeto Runnable = rotina //Declaracao Global
	private Runnable thread1 = new Runnable() {
		@Override
		public void run() {
			//Rodar infinitamente esse processo 
			//SimpleDateFormat retora um string no formato que passamos em seu argumento 
			//format é quem de fato recebe o valor de data que vem do classe Calendar 
			while(true) {
				textoMostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss")
						.format(Calendar.getInstance().getTime()));
				
				//para não travar o computador 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	
	//Criando o objeto Runnable = rotina //Declaracao Global
	private Runnable thread2 = new Runnable() {
		@Override
		public void run() {
			//Rodar infinitamente esse processo 
			//SimpleDateFormat retora um string no formato que passamos em seu argumento 
			//format é quem de fato recebe o valor de data que vem do classe Calendar 
			while(true) {
				textoMostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss")
						.format(Calendar.getInstance().getTime()));
				
				//para não travar o computador 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	
	//Criando o uma referência para objeto Thread que executará a rotina runnable - chamada dentro da action do Button 
	private Thread thread1Time;
	private Thread thread2Time;
	
	
	// Configurações iniciais da tela - ocorre na instanciação do objeot
	public TelaTimeThread() {
		
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
		//Não permite edição no campo de input 1
		textoMostraTempo.setEditable(false);
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
		
		//nao permite edicao no campo de input 2 
		textoMostraTempo2.setEditable(false);
		
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
				// TODO Auto-generated method stub
				
				thread1Time = new Thread(thread1);
				thread1Time.start();			
				
				//` ------ Poderíamos também fazer assim ---------
				
				/*
				
				thread2Time = new Thread(thread1);
				thread2Time.start();		
				  
				 */
				
				//Desabilita botão start - habilita stop
				jButtonStart.setEnabled(false);
				jButtonStop.setEnabled(true);
			}
		});
		
		jButtonStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				thread2Time = new Thread(thread2);
				thread2Time.start();			
				}
		});
		
		
		jButtonStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//como ja instanciei - só chamo o stop
				thread1Time.stop();			
				
				jButtonStart.setEnabled(true);
				jButtonStop.setEnabled(false);
			}
		});
		
		//Button 2 ------------ Button ---------------- ACTION click
		
		jButtonStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//como ja instanciei - só chamo o stop
				thread2Time.stop();			}
		});
		
		
		//Add botões 
		jButtonStop.setPreferredSize(new Dimension(92, 25));
		//Andando 1 linha para baixo 
		gridBagConstraints.gridx ++;
		jPanel.add(jButtonStop, gridBagConstraints);
		
		//Iniciando botão de Stop como falso - não pode ser clicado assim que abrir a tela
		//Será habilitado dentro do Evento de click - do start do botão 
		jButtonStop.setEnabled(false);
		
		//Adicionando painel e posicionando a esquerda do Tela principal 
		add(jPanel, BorderLayout.WEST);
		
		// Último comando a ser executado. 
		setVisible(true); // deixar tela visível  - 
		
	}
}
