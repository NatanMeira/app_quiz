package aps.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

class FrameQuestao {
	static int[] selecionado = new int[30];
	static int rodada=0;
	static char escolha;
	
	public FrameQuestao() 
	{
		//numerosDasQuestoes(FrameDificuldade.getDificuldade());
		selecionado[0]=0;
		Usuario usuario = new Usuario();
		Questao questao = new Questao();
		
		//////////////////////////////////////////////////////////////////////
		//                       Frame - QUESTAO                            //
		//////////////////////////////////////////////////////////////////////
		
		//Cria o Frame
		JFrame frameQ = new JFrame();
		frameQ.getContentPane().setVisible(true);
		frameQ.setBounds(100, 100, 800, 600);
		frameQ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameQ.getContentPane().setLayout(null);
		frameQ.setVisible(true);
		
		//Cria o Panel
		JPanel panelQ = new JPanel();
		panelQ.setLayout(null);
		frameQ.getContentPane().add(panelQ);
		frameQ.setContentPane(panelQ);
		
		//Componentes
		//Texto da questão
		JTextArea txtr_texto = new JTextArea();
		txtr_texto.setFont(new Font("Tahoma", txtr_texto.getFont().getStyle() | Font.BOLD, txtr_texto.getFont().getSize() + 8));
		txtr_texto.setBackground(SystemColor.menu);
		txtr_texto.setLineWrap(true);
		txtr_texto.setWrapStyleWord(true);
		txtr_texto.setEditable(false);
		txtr_texto.setBounds(85, 99, 607, 170);
		panelQ.add(txtr_texto);
		
		JLabel lbl_alternativa = new JLabel("Alternativas :");
		lbl_alternativa.setBounds(50, 280, 109, 23);
		panelQ.add(lbl_alternativa);
		
		JLabel lbl_Questao = new JLabel("QUEST\u00C3O");
		lbl_Questao.setBounds(32, 30, 74, 35);
		panelQ.add(lbl_Questao);
		
		JLabel lbl_NQuestao = new JLabel();
		lbl_NQuestao.setBounds(100, 40, 46, 14);
		panelQ.add(lbl_NQuestao);
		
		JLabel lbl_resultado = new JLabel("");
		lbl_resultado.setBounds(320, 460, 218, 23);
		lbl_resultado.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelQ.add(lbl_resultado);
		
		JLabel lbl_resultado2 = new JLabel("");
		lbl_resultado2.setBounds(280, 450+23, 218, 23);
		lbl_resultado2.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelQ.add(lbl_resultado2);
		
		JLabel lbl_faixa = new JLabel();
		lbl_faixa.setOpaque(true);
		lbl_faixa.setBounds(0, 30, 784, 35);
		lbl_faixa.setBackground(FrameJogo.getCor());
		panelQ.add(lbl_faixa);
		
		JButton btn_proximo = new JButton("Proxima quest\u00E3o");
		btn_proximo.setBounds(269, 511, 218, 23);
		btn_proximo.setVisible(false);
		btn_proximo.setBackground(Color.green);
		panelQ.add(btn_proximo);
		
		JButton btn_confirmar = new JButton("Confirmar");
		btn_confirmar.setBounds(269, 511, 218, 23);
		btn_confirmar.setVisible(false);
		btn_confirmar.setBackground(Color.green);
		panelQ.add(btn_confirmar);
		
		//Alternativas								
		JRadioButton rdbtn_alternativaA = new JRadioButton();
		rdbtn_alternativaA.setBounds(109, 310, 583, 35);
		panelQ.add(rdbtn_alternativaA);
		
		JTextArea txtr_alternativaA = new JTextArea();
		txtr_alternativaA.setFont(new Font("Tahoma", txtr_texto.getFont().getStyle() | Font.BOLD, txtr_texto.getFont().getSize() + 11));
		txtr_alternativaA.setBackground(SystemColor.menu);
		txtr_alternativaA.setLineWrap(true);
		txtr_alternativaA.setWrapStyleWord(true);
		txtr_alternativaA.setEditable(false);
		txtr_alternativaA.setBounds(85, 99, 607, 170);
		panelQ.add(txtr_alternativaA);
		
		JRadioButton rdbtn_alternativaB = new JRadioButton();
		rdbtn_alternativaB.setBounds(109, 348, 583, 35);
		panelQ.add(rdbtn_alternativaB);
		
		JRadioButton rdbtn_alternativaC = new JRadioButton();
		rdbtn_alternativaC.setBounds(109, 386, 583, 35);
		panelQ.add(rdbtn_alternativaC);
		
		JRadioButton rdbtn_alternativaD = new JRadioButton();
		rdbtn_alternativaD.setBounds(109, 424, 583, 35);
		panelQ.add(rdbtn_alternativaD);
		
		//Seta a questão
		setarQuestao(questao,lbl_NQuestao,txtr_texto,rdbtn_alternativaA,rdbtn_alternativaB,rdbtn_alternativaC,rdbtn_alternativaD);
		
		//Ações		
		rdbtn_alternativaA.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if(rdbtn_alternativaA.isSelected()) {
				btn_confirmar.setVisible(true);
			}
			else {
				btn_confirmar.setVisible(false);
			}
			rdbtn_alternativaB.setSelected(false);
			rdbtn_alternativaC.setSelected(false);
			rdbtn_alternativaD.setSelected(false);
			escolha='A';								
		}});
		
		rdbtn_alternativaB.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if(rdbtn_alternativaB.isSelected()) {
				btn_confirmar.setVisible(true);
			}
			else {
				btn_confirmar.setVisible(false);
			}
			
			rdbtn_alternativaA.setSelected(false);
			rdbtn_alternativaC.setSelected(false);
			rdbtn_alternativaD.setSelected(false);
			escolha='B';									
		}});
		
		rdbtn_alternativaC.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if(rdbtn_alternativaC.isSelected()) {
				btn_confirmar.setVisible(true);
			}
			else {
				btn_confirmar.setVisible(false);
			}
			
			rdbtn_alternativaB.setSelected(false);
			rdbtn_alternativaA.setSelected(false);
			rdbtn_alternativaD.setSelected(false);
			escolha='C';								
		}});
		
		rdbtn_alternativaD.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			if(rdbtn_alternativaD.isSelected()) {
				btn_confirmar.setVisible(true);
			}
			else {
				btn_confirmar.setVisible(false);
			}
			
			rdbtn_alternativaB.setSelected(false);
			rdbtn_alternativaC.setSelected(false);
			rdbtn_alternativaA.setSelected(false);
		
			escolha='D';
			
		}});
		btn_confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Desabilita as alternativas
				rdbtn_alternativaA.setEnabled(false);
				rdbtn_alternativaB.setEnabled(false);
				rdbtn_alternativaC.setEnabled(false);
				rdbtn_alternativaD.setEnabled(false);
				
				//Acertou
				
				if (questao.getResposta()=='A') {
					rdbtn_alternativaA.setBackground(Color.green);
					rdbtn_alternativaB.setBackground(Color.red);
					rdbtn_alternativaC.setBackground(Color.red);
					rdbtn_alternativaD.setBackground(Color.red);
				}
				if (questao.getResposta()=='B') {
					rdbtn_alternativaB.setBackground(Color.green);
					rdbtn_alternativaA.setBackground(Color.red);
					rdbtn_alternativaC.setBackground(Color.red);
					rdbtn_alternativaD.setBackground(Color.red);
				}
				if (questao.getResposta()=='C') {
					rdbtn_alternativaC.setBackground(Color.green);
					rdbtn_alternativaB.setBackground(Color.red);
					rdbtn_alternativaA.setBackground(Color.red);
					rdbtn_alternativaD.setBackground(Color.red);
				}
				if (questao.getResposta()=='D') {
					rdbtn_alternativaD.setBackground(Color.green);
					rdbtn_alternativaB.setBackground(Color.red);
					rdbtn_alternativaC.setBackground(Color.red);
					rdbtn_alternativaA.setBackground(Color.red);
				}
				
				//
				
				//soma a pontuação
				
				if(escolha == questao.getResposta())
				{
					usuario.setPontos(usuario.getPontos()+questao.getValor());
					lbl_resultado.setText("Você Acertou!");
					
					
				}
				else
				{
					lbl_resultado.setText("Você Errou!");
					lbl_resultado2.setText("A alternativa correta era: "+questao.getResposta());
				}

				rodada++;								
				btn_confirmar.setVisible(false);
				btn_proximo.setVisible(true);
				
				btn_proximo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
							
						
							//
							rdbtn_alternativaA.setBackground(SystemColor.menu);
							rdbtn_alternativaB.setBackground(SystemColor.menu);
							rdbtn_alternativaC.setBackground(SystemColor.menu);
							rdbtn_alternativaD.setBackground(SystemColor.menu);
							
							//
							lbl_resultado.setText("");
							lbl_resultado2.setText("");
							
							btn_proximo.setVisible(false);
							rdbtn_alternativaB.setSelected(false);
							rdbtn_alternativaC.setSelected(false); 
							rdbtn_alternativaA.setSelected(false);
							rdbtn_alternativaD.setSelected(false);
							
							rdbtn_alternativaA.setEnabled(true);
							rdbtn_alternativaB.setEnabled(true);
							rdbtn_alternativaC.setEnabled(true);
							rdbtn_alternativaD.setEnabled(true);
							
							//Seta uma nova questao
							setarQuestao(questao,lbl_NQuestao,txtr_texto,rdbtn_alternativaA,rdbtn_alternativaB,rdbtn_alternativaC,rdbtn_alternativaD);

							if(rodada==FrameJogo.getQtdquestoes()) 
							{		
									rodada=0;
									frameQ.dispose();
									new FramePontuacao(usuario);
					}
				}});
		}});
			
	}
	public static int[] numerosDasQuestoes(String dificuldade) {
		if (dificuldade=="facil") 
		{
			//Separa os 8 numeros - FACIL
			ArrayList<Integer> numerosQuestFacil = new ArrayList<Integer>();
			for (int i = 0; i <= 19; i++) {
				numerosQuestFacil.add(i);
			}
			
			Random random = new Random();
			
			int aleatorio;
			
			for (int i = 0; i <= 7; i++) {
				aleatorio = random.nextInt(numerosQuestFacil.size());
				selecionado[i] = numerosQuestFacil.get(aleatorio) ;
				numerosQuestFacil.remove(aleatorio);
			}
			
			//Separa os 7 numeros - MEDIO
			ArrayList<Integer> numerosQuestMedio = new ArrayList<Integer>();
			for (int i = 20; i <= 39; i++) {
				numerosQuestMedio.add(i);
			}
			
			for (int i = 8; i <= 14; i++) {
				aleatorio = random.nextInt(numerosQuestMedio.size());
				selecionado[i] = numerosQuestMedio.get(aleatorio) ;
				numerosQuestMedio.remove(aleatorio);
			}
		}
		if (dificuldade=="medio") 
		{
			//Separa os 8 numeros - MEDIO
			ArrayList<Integer> numerosQuestMedio = new ArrayList<Integer>();
			for (int i = 20; i <= 39; i++) {
				numerosQuestMedio.add(i);
			}
			
			Random random = new Random();
			
			int aleatorio;
			
			for (int i = 0; i <= 7; i++) {
				aleatorio = random.nextInt(numerosQuestMedio.size());
				selecionado[i] = numerosQuestMedio.get(aleatorio) ;
				numerosQuestMedio.remove(aleatorio);

			}
			
			//Separa os 7 numeros - DIFICIL
			ArrayList<Integer> numerosQuestDificil = new ArrayList<Integer>();
			for (int i = 40; i <= 59; i++) {
				numerosQuestDificil.add(i);
			}
			
			for (int i = 8; i <= 14; i++) {
				aleatorio = random.nextInt(numerosQuestDificil.size());
				selecionado[i] = numerosQuestDificil.get(aleatorio) ;
				numerosQuestDificil.remove(aleatorio);
			}
		} 
		if (dificuldade=="dificil") 
		{
			//Separa os 15 numeros - DIFICIL
			
			ArrayList<Integer> numerosQuestDificil = new ArrayList<Integer>();
			for (int i = 40; i <= 59; i++) {
				numerosQuestDificil.add(i);
			}
			
			Random random = new Random();
			
			int aleatorio;
			
			for (int i = 0; i <= 14; i++) {
				aleatorio = random.nextInt(numerosQuestDificil.size());
				selecionado[i] = numerosQuestDificil.get(aleatorio) ;
				numerosQuestDificil.remove(aleatorio);
			}
		}
		if (dificuldade=="extreme") 
		{
			//Separa os 10 numeros - MEDIO
			ArrayList<Integer> numerosQuestMedio = new ArrayList<Integer>();
			for (int i = 20; i <= 39; i++) {
				numerosQuestMedio.add(i);
			}
			
			Random random = new Random();
			
			int aleatorio;
			
			for (int i = 0; i <= 9; i++) {
				aleatorio = random.nextInt(numerosQuestMedio.size());
				selecionado[i] = numerosQuestMedio.get(aleatorio) ;
				numerosQuestMedio.remove(aleatorio);
			}
			//Separa os 20 numeros - DIFICIL
			ArrayList<Integer> numerosQuestDificil = new ArrayList<Integer>();
			for (int i = 40; i <= 59; i++) {
				numerosQuestDificil.add(i);
			}
			for (int i = 10; i <= 29; i++) {
				aleatorio = random.nextInt(numerosQuestDificil.size());
				selecionado[i] = numerosQuestDificil.get(aleatorio) ;
				numerosQuestDificil.remove(aleatorio);
			}
			
		}
		return selecionado;
	}
	public static void setarQuestao(Questao questao,JLabel lbl_NQuestao,JTextArea txtr_texto,JRadioButton rdbtn_alternativaA,JRadioButton rdbtn_alternativaB,JRadioButton rdbtn_alternativaC,JRadioButton rdbtn_alternativaD) {

		//questao.setId(Integer.toString(rodada+1));
		questao.setId(QuizMain.id[selecionado[rodada]]);
		questao.setTexto(QuizMain.texto[selecionado[rodada]]);
		questao.setAlternativaA(QuizMain.alternativaA[selecionado[rodada]]);
		questao.setAlternativaB(QuizMain.alternativaB[selecionado[rodada]]);
		questao.setAlternativaC(QuizMain.alternativaC[selecionado[rodada]]);
		questao.setAlternativaD(QuizMain.alternativaD[selecionado[rodada]]);
		questao.setResposta(QuizMain.resposta[selecionado[rodada]]);
		questao.setValor(QuizMain.valor[selecionado[rodada]]);
		
		lbl_NQuestao.setText(questao.getId());
		txtr_texto.setText(questao.getTexto());
		rdbtn_alternativaA.setText("(A) - "+questao.getAlternativaA());
		rdbtn_alternativaB.setText("(B) - "+questao.getAlternativaB());
		rdbtn_alternativaC.setText("(C) - "+questao.getAlternativaC());
		rdbtn_alternativaD.setText("(D) - "+questao.getAlternativaD());
		
	}
}
