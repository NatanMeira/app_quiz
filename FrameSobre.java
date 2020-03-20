package aps.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

class FrameSobre {
	public FrameSobre() {
			//////////////////////////////////////////////////////////////////////
			//                         Frame - SOBRE                            //
			//////////////////////////////////////////////////////////////////////
			//Cria o frame
			JFrame frameS = new JFrame();
			frameS.getContentPane().setVisible(true);
			frameS.setBounds(100, 100, 800, 600);
			frameS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frameS.getContentPane().setLayout(null);
			frameS.setVisible(true);
			
			//Cria o panel
			JPanel telaGrupo = new JPanel();
			telaGrupo.setBounds(0, 0, 784, 561);
			frameS.getContentPane().add(telaGrupo);
			telaGrupo.setLayout(null);
			
			//Componentes
			JLabel lbl_sobre = new JLabel("SOBRE");
			lbl_sobre.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_sobre.setBounds(300, 11, 164, 38);
			telaGrupo.add(lbl_sobre);
			
			JTextArea txtr_sobretexto = new JTextArea();
			txtr_sobretexto.setFont(new Font("Tahoma", txtr_sobretexto.getFont().getStyle(), telaGrupo.getFont().getSize() + 3));
			txtr_sobretexto.setBackground(SystemColor.menu);
			txtr_sobretexto.setLineWrap(true);
			txtr_sobretexto.setWrapStyleWord(true);
			txtr_sobretexto.setEditable(false);
			txtr_sobretexto.setText("");
			txtr_sobretexto.setBounds(117, 70, 540, 208);
			telaGrupo.add(txtr_sobretexto);
			
			JLabel lbl_grupo = new JLabel("Grupo");
			lbl_grupo.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_grupo.setBounds(300, 289, 164, 38);
			telaGrupo.add(lbl_grupo);
			
			JTextArea txtr_nome1 = new JTextArea();
			txtr_nome1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtr_nome1.setBackground(SystemColor.menu);
			txtr_nome1.setEditable(false);
			txtr_nome1.setText("Nome: Natan Meira \nR.A.:   N2826G2");
			txtr_nome1.setBounds(300, 330, 217, 38);
			telaGrupo.add(txtr_nome1);
			
			JTextArea txtr_nome2 = new JTextArea();
			txtr_nome2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtr_nome2.setBackground(SystemColor.menu);
			txtr_nome2.setEditable(false);
			txtr_nome2.setText("Nome: Natan Meira \nR.A.:   N2826G2");
			txtr_nome2.setBounds(300, 330 + 40, 217, 38);
			telaGrupo.add(txtr_nome2);
			
			JTextArea txtr_nome3 = new JTextArea();
			txtr_nome3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtr_nome3.setBackground(SystemColor.menu);
			txtr_nome3.setEditable(false);
			txtr_nome3.setText("Nome: Natan Meira \nR.A.:   N2826G2");
			txtr_nome3.setBounds(300, 330 + 80, 217, 38);
			telaGrupo.add(txtr_nome3);
			
			JTextArea txtr_nome4 = new JTextArea();
			txtr_nome4.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txtr_nome4.setBackground(SystemColor.menu);
			txtr_nome4.setEditable(false);
			txtr_nome4.setText("Nome: Natan Meira \nR.A.:   N2826G2");
			txtr_nome4.setBounds(300, 330 + 120, 217, 38);
			telaGrupo.add(txtr_nome4);
			
			JButton btn_voltar = new JButton("voltar");
			btn_voltar.setBounds(10, 11, 89, 23);
			btn_voltar.setBackground(new Color(77, 166, 255));
			telaGrupo.add(btn_voltar);
			
			//ações
			btn_voltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				frameS.dispose();
				new FrameJogo();
			}});
	}
		
}
