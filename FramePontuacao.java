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

class FramePontuacao {
	public FramePontuacao(Usuario usuario)
	{
		////////////////////////////////////////////////////////////
		//                 Frame - PONTUAÇÃO                      //
		////////////////////////////////////////////////////////////
		JFrame frameP = new JFrame();
		frameP.getContentPane().setVisible(true);
		frameP.setBounds(100, 100, 800, 600);
		frameP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameP.getContentPane().setLayout(null);
		frameP.setVisible(true);
	
		//Panel 
		JPanel panelP = new JPanel();
		panelP.setLayout(null);
		frameP.getContentPane().add(panelP);
		frameP.setContentPane(panelP);
		
		//Components
		JLabel lbl_pontuacao = new JLabel(Integer.toString(usuario.getPontos()));
		lbl_pontuacao.setFont(new Font("Tahoma", Font.PLAIN, 150));
		lbl_pontuacao.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pontuacao.setBounds(212, 165, 353, 156);
		panelP.add(lbl_pontuacao);
		
		JLabel lbl_pontos = new JLabel("PONTOS :");
		lbl_pontos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbl_pontos.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pontos.setBounds(212, 101, 353, 53);
		panelP.add(lbl_pontos);
		
		JButton btn_menu = new JButton("VOLTAR AO MENU");
		btn_menu.setBounds(289, 364, 189, 23);
		btn_menu.setBackground(new Color(77, 166, 255));
		panelP.add(btn_menu);
		
		JButton btn_sair = new JButton("SAIR");
		btn_sair.setBounds(289, 398, 189, 23);
		btn_sair.setBackground(Color.red);
		panelP.add(btn_sair);
		
		//Ações
		btn_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frameP.dispose();
				usuario.setPontos(0);
				new FrameJogo();
			}});
		
		btn_sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frameP.dispose();
			}});
	}
}

