package aps.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

class FrameDificuldade {
	private static String dificuldade;
	public static String getDificuldade() {
		return dificuldade;
	}
	public static void setDificuldade(String dificuldade) {
		FrameDificuldade.dificuldade = dificuldade;
	}
	
	public FrameDificuldade() 
	{	
		//////////////////////////////////////////////////////////////////////
		//                      Frame - DIFICULDADE                         //
		//////////////////////////////////////////////////////////////////////
		//Cria o Frame
		JFrame frameS = new JFrame();
		frameS.getContentPane().setVisible(true);
		frameS.setBounds(100, 100, 800, 600);
		frameS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameS.getContentPane().setLayout(null);
		frameS.setVisible(true);
		
		//Cria o Panel
		JPanel telaDificuldade = new JPanel();
		telaDificuldade.setBounds(0, 0, 784, 561);
		frameS.getContentPane().add(telaDificuldade);
		telaDificuldade.setLayout(null);
		
		//Componentes
		JButton btn_facil = new JButton("F\u00C1CIL");
		btn_facil.setBackground(new Color(50, 205, 50));
		btn_facil.setBorder(new LineBorder(new Color(77, 166, 255), 5));
		btn_facil.setBorderPainted(false);
		btn_facil.setBounds(190, 100, 400, 50);
		telaDificuldade.add(btn_facil);
		
		JButton btn_medio = new JButton("M\u00C9DIO");
		btn_medio.setBackground(new Color(255, 215, 0));
		btn_medio.setBorder(new LineBorder(new Color(77, 166, 255), 5));
		btn_medio.setBorderPainted(false);
		btn_medio.setBounds(190, 100+80, 400, 50);
		telaDificuldade.add(btn_medio);
		
		JButton btn_dificil = new JButton("DIF\u00CDCIL");
		btn_dificil.setBackground(new Color(255, 0, 0));
		btn_dificil.setBorder(new LineBorder(new Color(77, 166, 255), 5));
		btn_dificil.setBorderPainted(false);
		btn_dificil.setBounds(190, 180+80, 400, 50);
		telaDificuldade.add(btn_dificil);
		
		JButton btn_extreme = new JButton("EXTREME");
		btn_extreme.setBackground(new Color(154, 27, 0));
		btn_extreme.setBorder(new LineBorder(new Color(77, 166, 255), 5));
		btn_extreme.setBorderPainted(false);
		btn_extreme.setBounds(190, 260+80, 400, 50);
		telaDificuldade.add(btn_extreme);
		
		JButton btn_comecar = new JButton("COMEÇAR");
		btn_comecar.setBackground(new Color(77, 166, 255));
		btn_comecar.setVisible(false);
		btn_comecar.setBounds(190-25, 340+80, 450, 60);
		telaDificuldade.add(btn_comecar);
		
		JButton btn_voltar = new JButton("voltar");
		btn_voltar.setBackground(new Color(77, 166, 255));
		btn_voltar.setBounds(10, 11, 89, 23);
		telaDificuldade.add(btn_voltar);
		
		//Ações
		btn_voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameS.dispose();
				new FrameJogo();
		}});
		
		btn_facil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setDificuldade("facil");	
				FrameJogo.setCor(Color.green);
				FrameJogo.setQtdquestoes(15);
				
				btn_comecar.setVisible(true);
				btn_facil.setBorderPainted(true);
				btn_medio.setBorderPainted(false);
				btn_dificil.setBorderPainted(false);
				btn_extreme.setBorderPainted(false);
			
		}});
		btn_medio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setDificuldade("medio");
				FrameJogo.setCor(Color.yellow);
				FrameJogo.setQtdquestoes(15);
				
				btn_comecar.setVisible(true);
				btn_facil.setBorderPainted(false);
				btn_medio.setBorderPainted(true);
				btn_dificil.setBorderPainted(false);
				btn_extreme.setBorderPainted(false);
		}});
		
		btn_dificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setDificuldade("dificil");
				FrameJogo.setCor(Color.red);
				FrameJogo.setQtdquestoes(15);
	
				btn_comecar.setVisible(true);
				btn_facil.setBorderPainted(false);
				btn_medio.setBorderPainted(false);
				btn_dificil.setBorderPainted(true);
				btn_extreme.setBorderPainted(false);
		}});
		
		btn_extreme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setDificuldade("extreme");
				FrameJogo.setCor(new Color(154, 27, 0));
				FrameJogo.setQtdquestoes(30);
				
				btn_comecar.setVisible(true);
				btn_extreme.setBorderPainted(true);
				btn_facil.setBorderPainted(false);
				btn_medio.setBorderPainted(false);
				btn_dificil.setBorderPainted(false);
		}});
		
		//Ações
		btn_comecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Cria o Dialog
				JDialog dialog = new JDialog();
				dialog.setBounds(250, 250, 500, 350);
				dialog.getContentPane().setLayout(null);
				dialog.setVisible(true);
				
				//Componentes
				JButton btn_ok = new JButton("OK");
				btn_ok.setBounds(175, 246, 136, 37);
				dialog.getContentPane().add(btn_ok);
				
				JTextArea txtr_regras = new JTextArea();
				txtr_regras.setFont(new Font("Tahoma", Font.BOLD, 14));
				txtr_regras.setBackground(SystemColor.menu);
				txtr_regras.setLineWrap(true);
				txtr_regras.setWrapStyleWord(true);
				txtr_regras.setEditable(false);
				txtr_regras.setText("\tRegras do QUIZ:\n\n• O QUIZ............");
				txtr_regras.setBounds(63, 24, 353, 211);
				dialog.getContentPane().add(txtr_regras);
				
				btn_ok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dialog.dispose();
					frameS.dispose();	
					new FrameQuestao();
			}});
		}});
	}

}
