package aps.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class FrameJogo {
	//private static String dificuldade;
	private static Color cor;
	public static Color getCor() {
		return cor;
	}
	public static void setCor(Color cor) {
		FrameJogo.cor = cor;
	}
	public static int getQtdquestoes() {
		return qtdquestoes;
	}
	public static void setQtdquestoes(int qtdquestoes) {
		FrameJogo.qtdquestoes = qtdquestoes;
	}
	private static int qtdquestoes;

	public FrameJogo() {
		
			////////////////////////////////////////////////////////////
			//					  Frame - INICIO                      //
			////////////////////////////////////////////////////////////
			//Cria o Frame
			JFrame frame = new JFrame();
			frame.getContentPane().setVisible(true);
			frame.setBounds(100, 100, 800, 600);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			//Cria o Panel
			JPanel panel = new JPanel();
			panel.setLayout(null);
			frame.getContentPane().add(panel);
			frame.setContentPane(panel);
			
			//Componentes
			JLabel lbl_titulo = new JLabel("QUIZ");
			lbl_titulo.setBounds(0, 40, 784, 285);
			lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_titulo.setFont(new Font("Tahoma", Font.BOLD, 120));
			panel.add(lbl_titulo);
			
			JButton btn_jogar = new JButton("JOGAR");
			btn_jogar.setBackground(new Color(77, 166, 255));
			btn_jogar.setBounds(347, 310, 89, 23);
			panel.add(btn_jogar);
			
			JButton btn_sobre = new JButton("SOBRE");
			btn_sobre.setBackground(new Color(77, 166, 255));
			btn_sobre.setBounds(347, 310 + 30, 89, 23);
			panel.add(btn_sobre);
			
			JButton btn_sair = new JButton("SAIR");
			btn_sair.setBackground(Color.red);
			btn_sair.setBounds(347, 340 + 30, 89, 23);
			panel.add(btn_sair);
			
			//Ações
			btn_sobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frame.setVisible(false);
			new FrameSobre();
			
			}});
			
			btn_sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frame.dispose();		
			}});
			
			btn_jogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frame.setVisible(false);
			new FrameDificuldade();
			
			}});
	}

}
