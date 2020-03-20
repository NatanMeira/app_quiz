package aps.quiz;

class QuizMain {
	
	// Add quantas quest�es ele acertou 
	

	static String[] id = new String[60];
	static String[] texto = new String[60];
	static String[] alternativaA = new String[60];
	static String[] alternativaB = new String[60];
	static String[] alternativaC = new String[60];
	static String[] alternativaD = new String[60];
	static char[] resposta = new char[60];
	static int[] valor = new int[60];
	
	static int valorFacil=10;
	static int valorMedio=20;
	static int valorDificil=30;

	
	public static void main(String[] args) {
		
		////////////////////QUEST�ES - FACIL////////////////////////// 
		
		id[0] = "1";
		texto[0] = "Para que a sustentabilidade de fato aconte�a � necess�rio o chamado trip� da sustentabilidade, quais s�o os tr�s princ�pios em que ele se baseia?";
		alternativaA[0] = "Sustentabilidade Social, Econ�mica e Tecnol�gica.";
		alternativaB[0] = "Sustentabilidade Social, Ecol�gica e Ambiental.";
		alternativaC[0] = "Sustentabilidade Tecnol�gica, Ambiental e Ecol�gica.";
		alternativaD[0] = "Sustentabilidade Ambiental, Social e Econ�mica.";
		resposta[0] = 'D';
		valor[0] = valorFacil;

		id[1] = "2";
		texto[1] = "Qual a cor do cesto de lixo reciclavel em que uma GARRAFA DE VIDRO deve ser depositada? ";
		alternativaA[1] = "Verde.";
		alternativaB[1] = "Vermelho.";
		alternativaC[1] = "Azul.";
		alternativaD[1] = "Amarelo.";
		resposta[1] = 'A';
		valor[1] = valorFacil;

		id[2] = "3";
		texto[2] = "Qual a cor do cesto de lixo reciclavel em que uma GARRAFA DE PL�STICO deve ser depositada? ";
		alternativaA[2] = "Branco.";
		alternativaB[2] = "Preto.";
		alternativaC[2] = "Vermelho.";
		alternativaD[2] = "Roxo.";
		resposta[2] = 'C';
		valor[2] = valorFacil;

		id[3] = "4";
		texto[3] = "O que deve ser feito para contribuir na preserva��o de �rvores e florestas?";
		alternativaA[3] = "Frequentando parques e bosques.";
		alternativaB[3] = "Reutilizando vidros, metais e pl�sticos.";
		alternativaC[3] = "Construindo uma casa na �rvore.";
		alternativaD[3] = "Reciclando jornais, revistas e pap�is.";
		resposta[3] = 'D';
		valor[3] = valorFacil;

		id[4] = "5";
		texto[4] = "Qual das alternativas a seguir representa um benef�cio da utiliza��o da energia solar?";
		alternativaA[4] = "N�o polui o meio ambiente e nem a atmosfera.";
		alternativaB[4] = "� eficaz em qualquer clima e � sustent�vel.";
		alternativaC[4] = "N�o � uma fonte de energia renov�vel. ";
		alternativaD[4] = "Est� disponivel a todo momento e em todo lugar.";
		resposta[4] = 'A';
		valor[4] = valorFacil;

		id[5] = "6";
		texto[5] = "O que se deve fazer para reciclar lixos eletronicos, como celulares quebrados, pilhas e etc?";
		alternativaA[5] = "Armazenar em casa o m�ximo de tempo que der.";
		alternativaB[5] = "Jogar no lixo comum.";
		alternativaC[5] = "Recolher e depositar em lixeiras recicl�veis na cor branca.";
		alternativaD[5] = "Recolher, organizar e levar para locais especificos para seu descarte. ";
		resposta[5] = 'D';
		valor[5] = valorFacil;

		id[6] = "7";
		texto[6] = "Sobre a energia e�lica � correto dizer:";
		alternativaA[6] = "� considerada uma fonte limpa por n�o emitir gases poluentes e renovavel.";
		alternativaB[6] = "� considerada uma fonte de energia n�o renovavel.";
		alternativaC[6] = "� considerada uma fonte de renovavel e suja, pois emite gases poluentes.";
		alternativaD[6] = "� considerada uma fonte de energia renovavel, pois gera energia apartir da luz solar.";
		resposta[6] = 'A';
		valor[6] = valorFacil;

		id[7] = "8";
		texto[7] = "Sobre a energia solar � correto afirmar:";
		alternativaA[7] = "� uma fonte de energia limpa e gera energia apartir da �gua da chuva.";
		alternativaB[7] = "� uma fonte de energia limpa, renovavel e abundante em diversas �reas.";
		alternativaC[7] = "� uma fonte de energia limpa, limitada a poucas �reas.";
		alternativaD[7] = "� uma fonte de energia renovavel e suja, pois libera gases poluentes.";
		resposta[7] = 'B';
		valor[7] = valorFacil;

		id[8] = "9";
		texto[8] = "Sobre a energia hidrel�trica � correto afirmar:";
		alternativaA[8] = "� uma fonte de energia suja e n�o renovavel, com baixo custo operacional.";
		alternativaB[8] = "� uma fonte de energia limpa e renovavel, com baixo custo operacional.";
		alternativaC[8] = "� uma fonte de energia suja e renovavel, com alto custo operacional.";
		alternativaD[8] = "� uma fonte de energia limpa e n�o renovavel, com alto custo operacional.";
		resposta[8] = 'B';
		valor[8] = valorFacil;

		id[9] = "10";
		texto[9] = "Sobre a biomassa � correto afirmar:";
		alternativaA[9] = "� toda mat�ria org�nica, de origem vegetal e animal, utilizada na produ��o de energia.";
		alternativaB[9] = "� toda mat�ria inorg�nica, de origem mineral ou animal, utilizada na produ��o de energia.";
		alternativaC[9] = "� toda mat�ria org�nica, de origem vegetal e mineral, utilizada na produ��o de energia.";
		alternativaD[9] = "� toda mat�ria inorg�nica, de origem vegetal ou animal, utilizada na produ��o de energia.";
		resposta[9] = 'A';
		valor[9] = valorFacil;

		id[10] = "11";
		texto[10] = "Qual o melhor conceito para o termo desmatamento ou desflorestamento?";
		alternativaA[10] = "Refere-se � acabar com todas as �rvores de uma floresta.";
		alternativaB[10] = "Refere-se � cortar varias �rvores de uma floresta.";
		alternativaC[10] = "Refere-se � elimina��o total ou parcial de qualquer tipo de cobertura vegetal.";
		alternativaD[10] = "Refere-se � eliminar todos os animais da florestas.";
		resposta[10] = 'C';
		valor[10] = valorFacil;
		
		id[11] = "12";
		texto[11] = "Quais dos recursos abaixo n�o � renovavel?";
		alternativaA[11] = "�gua";
		alternativaB[11] = "Carv�o vegetal";
		alternativaC[11] = "Energia solar";
		alternativaD[11] = "Min�rios ";
		resposta[11] = 'D';
		valor[11] = valorFacil;

		id[12] = "13";
		texto[12] = "Quais dos recursos abaixo n�o � renovavel?";
		alternativaA[12] = "Agricultura";
		alternativaB[12] = "Pescas";
		alternativaC[12] = "Combust�veis f�sseis";
		alternativaD[12] = "Florestas";
		resposta[12] = 'C';
		valor[12] = valorFacil;

		id[13] = "14";
		texto[13] = "Quais dos recursos abaixo � renovavel?";
		alternativaA[13] = "Combust�veis f�sseis";
		alternativaB[13] = "Agricultura";
		alternativaC[13] = "Min�rios";
		alternativaD[13] = "Rochas industriais";
		resposta[13] = 'B';
		valor[13] = valorFacil;

		id[14] = "15";
		texto[14] = "Quais dos recursos abaixo � renovavel?";
		alternativaA[14] = "M�n�rio de ferro";
		alternativaB[14] = "�gua";
		alternativaC[14] = "Energia nuclear";
		alternativaD[14] = "Petr�leo";
		resposta[14] = 'B';
		valor[14] = valorFacil;
		
		id[15] = "16";
		texto[15] = "O que s�o recursos naturais?";
		alternativaA[15] = "Tecnologias presentes na natureza.";
		alternativaB[15] = "Somente as energias presentes na natureza.";
		alternativaC[15] = "Mat�ria ou energia presentes na natureza.";
		alternativaD[15] = "Somente as mat�rias presentes na natureza.";
		resposta[15] = 'C';
		valor[15] = valorFacil;

		id[16] = "17";
		texto[16] = "Por que produtos biodegrad�veis s�o considerados sustent�veis? ";
		alternativaA[16] = "Pois eles se decomp�em facilmente pela a��o bacteriana, por�m contribuem para a polui��o do solo, das �guas e do ar.";
		alternativaB[16] = "Pois eles n�o se decomp�em pela a��o bacteriana, e acabam por n�o contribuir para a redu��o do lixo.";
		alternativaC[16] = "Pois eles se decomp�em facilmente pela a��o bacteriana, e contribuem para a redu��o do lixo e da polui��o do solo, das �guas e do ar.";
		alternativaD[16] = "Pois eles demoram muito para se decompor pela a��o bacteriana, mas contribuem para a redu��o do lixo e da polui��o do solo, das �guas e do ar.";
		resposta[16] = 'C';
		valor[16] = valorFacil;

		id[17] = "18";
		texto[17] = "Em quais �reas os produtos biodegrad�veis ajudam a combater a polui��o?";
		alternativaA[17] = "Polui��o do solo";
		alternativaB[17] = "Polui��o das �guas";
		alternativaC[17] = "Polui��o do ar.";
		alternativaD[17] = "Todas as alternativas.";
		resposta[17] = 'D';
		valor[17] = valorFacil;

		id[18] = "19";
		texto[18] = "Qual das alternativas a seguir melhor corresponde a uma forma correta de preservar o meio ambiente?";
		alternativaA[18] = "Jogar lixo nas florestas";
		alternativaB[18] = "Economizar �gua";
		alternativaC[18] = "Jogar lixo nas ruas";
		alternativaD[18] = "Desperdi�ar �gua";
		resposta[18] = 'B';
		valor[18] = valorFacil;

		id[19] = "20";
		texto[19] = "Qual das alternativas a seguir melhor corresponde a uma forma correta de diminuir o efeito estufa?";
		alternativaA[19] = "Aumentar o uso de carros";
		alternativaB[19] = "Aumentar o numero de fabricas e zonas industriais";
		alternativaC[19] = "Cortar �rvores e desmatar florestas";
		alternativaD[19] = "Optar pelo uso de bicicletas e diminuir o uso do carro";
		resposta[19] = 'D';
		valor[19] = valorFacil;

		////////////////////QUEST�ES - MEDIO////////////////////////// 
		
		id[20] = "21";
		texto[20] = "Qual a cor do cesto de lixo reciclavel em que RES�DUOS ORG�NICOS devem ser depositados? ";
		alternativaA[20] = "Azul.";
		alternativaB[20] = "Marrom.";
		alternativaC[20] = "Laranja.";
		alternativaD[20] = "Preto.";
		resposta[20] = 'B';
		valor[20] = valorMedio;

		id[21] = "22";
		texto[21] = "Em quais cestos para separa��o do lixo reciclavel os objetos a seguir devem ser depositados respectivamente:\n"+"Res�duos radioativos, res�duos org�nicos e res�duos ambulatoriais.";
		alternativaA[21] = "Verde, Preto, Branco.";
		alternativaB[21] = "Verde, Vermelho, Branco.";
		alternativaC[21] = "Roxo, Marrom, Branco.";
		alternativaD[21] = "Roxo, Preto, Cinza.";
		resposta[21] = 'C';
		valor[21] = valorMedio;

		id[22] = "23";
		texto[22] = "Qual a cor do cesto de lixo recicl�vel em que RES�DUOS N�O RECICL�VEIS devem ser depositados? ";
		alternativaA[22] = "Laranja.";
		alternativaB[22] = "Roxo.";
		alternativaC[22] = "Azul.";
		alternativaD[22] = "Cinza.";
		resposta[22] = 'D';
		valor[22] = valorMedio;

		id[23] = "24";
		texto[23] = "Quais dos objetos a seguir podem ser depositados em um cesto de lixo recicl�vel AZUL?";
		alternativaA[23] = "Folha sulfite, garrafa de pl�stico, revista e caixa de papel�o.";
		alternativaB[23] = "Folha sulfite, papel amassado, jornal e caixa de papel�o.";
		alternativaC[23] = "Garrafa de pl�stico, papel amassado e caixa de papel�o.";
		alternativaD[23] = "Copo de vidro, papel amassado e revista.";
		resposta[23] = 'B';
		valor[23] = valorMedio;

		id[24] = "25";
		texto[24] = "Quais dos objetos a seguir podem ser depositados em um cesto de lixo recicl�vel AMARELO?";
		alternativaA[24] = "Lata de alum�nio, panela sem cabo, arames e cano de metal.";
		alternativaB[24] = "Casca de fruta, panela sem cabo, jornal e cano de metal.";
		alternativaC[24] = "Revista, panela sem cabo, canetas e cano de metal.";
		alternativaD[24] = "Lata de alum�nio, pilhas, cd e canos de metal.";
		resposta[24] = 'A';
		valor[24] = valorMedio;

		id[25] = "26";
		texto[25] = "Quais dos objetos a seguir podem ser depositados em um cesto de lixo recicl�vel VERMELHO?";
		alternativaA[25] = "Lata de alum�nio , sacolas, cd e cartolina.";
		alternativaB[25] = "Copo de vidro, casca de banana,  e caneta.";
		alternativaC[25] = "Revista, frasco de vidro, cd e dvd.";
		alternativaD[25] = "Copo pl�stico, sacolas, cd e caneta.";
		resposta[25] = 'D';
		valor[25] = valorMedio;

		id[26] = "27";
		texto[26] = "No Brasil, qual � o setor campe�o no consumo e desperdicio de �gua?";
		alternativaA[26] = "Industria.";
		alternativaB[26] = "Consumo urbano.";
		alternativaC[26] = "Agricultura.";
		alternativaD[26] = "Consumo animal e rural.";
		resposta[26] = 'C';
		valor[26] = valorMedio;

		id[27] = "28";
		texto[27] = "O que � reciclagem?";
		alternativaA[27] = "� o processo que acontece com o lixo Durante o seu descarte.";
		alternativaB[27] = "� o processo que acontece com o lixo ap�s o seu descarte.";
		alternativaC[27] = "� o processo que acontece com o lixo antes o seu descarte.";
		alternativaD[27] = "� o processo que transforma o lixo em novos produtos para consumo.";
		resposta[27] = 'D';
		valor[27] = valorMedio;

		id[28] = "29";
		texto[28] = "No Brasil, qual � a principal fonte de energia usada para suprir as necessidade do pais?";
		alternativaA[28] = "Energia solar";
		alternativaB[28] = "Energia hidrel�trica";
		alternativaC[28] = "Energia das mar�s";
		alternativaD[28] = "Energia e�lica";
		resposta[28] = 'B';
		valor[28] = valorMedio;

		id[29] = "30";
		texto[29] = "Quais as vantagens de se utilizar biomassa para gerar energia?";
		alternativaA[29] = "Seu baixo custo e baixa emiss�o de gases poluentes.";
		alternativaB[29] = "Seu alto custo e baixa emiss�o de gases poluentes.";
		alternativaC[29] = "Seu baixo custo e alta emiss�o de gases poluentes.";
		alternativaD[29] = "Seu alto custo e alta emiss�o de gases poluentes.";
		resposta[29] = 'A';
		valor[29] = valorMedio;

		id[30] = "31";
		texto[30] = "O que � Sustentabilidade?";
		alternativaA[30] = "� um conceito formado por um conjunto de ideias, estrat�gias e atitudes ecologicamente corretas, economicamente vi�veis e socialmente justas.";
		alternativaB[30] = "� um conceito formado por um conjunto de ideologias, estrat�gias e atitudes para sustentar futuras guerras.";
		alternativaC[30] = "� um conceito formado por um conjunto de ideologias, estrat�gias e atitudes ecologicamente corretas, economicamente vi�veis e socialmente injustas.";
		alternativaD[30] = "� um conceito formado por um conjunto de ideias, estrat�gias e atitudes ecologicamente corretas e socialmente justas somente.";
		resposta[30] = 'A';
		valor[30] = valorMedio;

		id[31] = "32";
		texto[31] = "Sobre sustentabilidade ambiental e Ecol�gica � correto afirmar:";
		alternativaA[31] = "� responsavel pela manuten��o do meio ambiente do planeta Terra, mantendo a qualidade de vida e os ecossistemas em harmonia com as pessoas.";
		alternativaB[31] = "� responsavel pela manuten��o da sociedade do planeta Terra, mantendo a qualidade de vida para as pessoas.";
		alternativaC[31] = "� responsavel pela manuten��o do meio ambiente do planeta Terra, mantendo a qualidade de vida e os ecossistemas em harmonia com as pessoas.";
		alternativaD[31] = "� responsavel pela manuten��o dos ecossistemas do planeta Terra, mantendo uma pessiama qualidade de vida para as pessoas.";
		resposta[31] = 'C';
		valor[31] = valorMedio;

		id[32] = "33";
		texto[32] = "Sobre sustentabilidade empresarial � correto afirmar:";
		alternativaA[32] = "A empresa que n�o se preocupa com a sustentabilidade � aquela que cuida do planeta, se preocupa com a comunidade e com o meio ambiente.";
		alternativaB[32] = "A empresa que cuida do planeta, se preocupa com a comunidade e com o meio ambiente, n�o se preocupa em nada com sustentabilidade.";
		alternativaC[32] = "A empresa que se preocupa com a sustentabilidade � aquela que n�o cuida do planeta, n�o se preocupa com a comunidade e e polui o meio ambiente.";
		alternativaD[32] = "A empresa que se preocupa com a sustentabilidade � aquela que cuida do planeta, se preocupa com a comunidade e com o meio ambiente.";
		resposta[32] = 'D';
		valor[32] = valorMedio;

		id[33] = "34";
		texto[33] = "Sobre sustentabilidade social � correto afirmar:";
		alternativaA[33] = "� responsavel pelo conjunto de medidas estabelecidas para promover o equil�brio e o bem-estar das empresas.";
		alternativaB[33] = "� responsavel pelo conjunto de medidas estabelecidas para promover o equil�brio e o bem-estar do meio ambiente.";
		alternativaC[33] = "� responsavel pelo conjunto de medidas estabelecidas para promover o equil�brio e o bem-estar da sociedade.";
		alternativaD[33] = "� responsavel pelo conjunto de medidas estabelecidas para promover o desequil�brio e o bem-estar do meio ambiente.";
		resposta[33] = 'C';
		valor[33] = valorMedio;

		id[34] = "35";
		texto[34] = "Sobre sustentabilidade econ�mica � correto afirmar:";
		alternativaA[34] = "Busca garantir o desenvolvimento tecnol�gico levando em considera��o estrat�gias que provoquem impactos ambientais ou que diminuam a qualidade de vida das pessoas em sociedade.";
		alternativaB[34] = "Busca garantir o desenvolvimento econ�mico levando em considera��o estrat�gias que n�o provoquem impactos ambientais ou que diminuam a qualidade de vida das pessoas em sociedade";
		alternativaC[34] = "Busca garantir o desenvolvimento econ�mico levando em considera��o estrat�gias que provoquem impactos ambientais ou que melhore qualidade de vida das pessoas em sociedade.";
		alternativaD[34] = "Busca garantir o desenvolvimento tecnol�gico levando em considera��o estrat�gias que n�o provoquem impactos ambientais ou que melhorem a qualidade de vida das pessoas com o meio ambiente.";
		resposta[34] = 'B';
		valor[34] = valorMedio;

		id[35] = "36";
		texto[35] = "De acordo com os recursos a seguir indentifique quais s�o renovaveis e quais n�o s�o respectivamente:\n"+"�gua, agricultura, petr�leo e carv�o mineral.";
		alternativaA[35] = "Renov�vel, n�o renov�vel, renov�vel, renov�vel.";
		alternativaB[35] = "Renov�vel, renov�vel, renov�vel, n�o renov�vel.";
		alternativaC[35] = "Renov�vel, renov�vel, n�o renov�vel, n�o renov�vel.";
		alternativaD[35] = "N�o renov�vel, n�o renov�vel, renov�vel, renov�vel.";
		resposta[35] = 'C';
		valor[35] = valorMedio;

		id[36] = "37";
		texto[36] = "De acordo com os recursos a seguir indentifique quais s�o renovaveis e quais n�o s�o respectivamente:\n"+"Energia e�lica, min�rios, carv�o mineral e diamante.";
		alternativaA[36] = "Renov�vel, n�o renov�vel, n�o renov�vel, n�o renov�vel.";
		alternativaB[36] = "N�o renov�vel, renov�vel, renov�vel, renov�vel.";
		alternativaC[36] = "N�o renov�vel, renov�vel, n�o renov�vel, n�o renov�vel.";
		alternativaD[36] = "Renov�vel, n�o renov�vel, renov�vel, n�o renov�vel.";
		resposta[36] = 'A';
		valor[36] = valorMedio;

		id[37] = "38";
		texto[37] = "De acordo com os recursos a seguir indentifique quais s�o renovaveis e quais n�o s�o respectivamente:\n"+"�guas subterr�neas, florestas, agricultura e carv�o vegetal.";
		alternativaA[37] = "Renov�vel, renov�vel, renov�vel, n�o renov�vel.";
		alternativaB[37] = "Renov�vel, n�o renov�vel, renov�vel, n�o renov�vel.";
		alternativaC[37] = "Renov�vel, renov�vel, renov�vel, renov�vel.";
		alternativaD[37] = "Renov�vel, renov�vel, n�o renov�vel, n�o renov�vel.";
		resposta[37] = 'C';
		valor[37] = valorMedio;

		id[38] = "39";
		texto[38] = "o que � um recurso natural n�o renov�vel?";
		alternativaA[38] = "Um recurso que � consumido mais rapidamente do que � capaz de se formar naturalmente.";
		alternativaB[38] = "Um recurso que pode ser reposto naturalmente e num prazo relativamente curto.";
		alternativaC[38] = "Um recurso que � consumido mais lentamente do que � capaz de se formar naturalmente.";
		alternativaD[38] = "Um recurso que n�o � consumido mais rapidamente do que � capaz de se formar naturalmente.";
		resposta[38] = 'A';
		valor[38] = valorMedio;

		id[39] = "40";
		texto[39] = "O que � um recurso natural renov�vel?";
		alternativaA[39] = "Um recurso que n�o pode ser reposto naturalmente e num prazo relativamente longo.";
		alternativaB[39] = "Uma recurso que n�o pode ser reposto naturalmente e num prazo relativamente curto.";
		alternativaC[39] = "Um recurso que pode ser reposto naturalmente e num prazo relativamente curto.";
		alternativaD[39] = "Um recurso que pode ser reposto naturalmente e num prazo relativamente longo.";
		resposta[39] = 'C';
		valor[39] = valorMedio;

		////////////////////QUEST�ES - DIFICIL////////////////////////// 
		
		id[40] = "41";
		texto[40] = "Em quais cestos para separa��o do lixo reciclavel os objetos a seguir devem ser depositados respectivamente:\n"+"Folha de papel, seringa contaminada, madeira, garrafa de vidro e copo de pl�stico.";
		alternativaA[40] = "Azul, Cinza, Preto, Verde e Vermelho.";
		alternativaB[40] = "Azul, Verde, Cinza, Branco e Rosa.";
		alternativaC[40] = "Roxo, Branco, Marrom, Rosa e Vermelho.";
		alternativaD[40] = "Preto, Branco, Cinza, Azul e Laranja.";
		resposta[40] = 'A';
		valor[40] = valorDificil;

		id[41] = "42";
		texto[41] = "Em quais cestos para separa��o do lixo reciclavel os objetos a seguir devem ser depositados respectivamente:\n"+"Res�duos radioativos, espelhos, pilhas, casca de banana e l�mpadas.";
		alternativaA[41] = "Roxo, laranja, cinza, branco e cinza.";
		alternativaB[41] = "Cinza, cinza, branco, Laranja e branco.";
		alternativaC[41] = "Roxo, cinza, laranja, marrom e laranja.";
		alternativaD[41] = "Azul, cinza, verde, marrom e vermelho.";
		resposta[41] = 'C';
		valor[41] = valorDificil;

		id[42] = "43";
		texto[42] = "Em nosso planeta existem diversos recursos naturais renovaveis, selecione a seguir a alternativa que melhor explica o motivo de a �gua ser um desses recursos.";
		alternativaA[42] = "O ciclo da �gua, com os processos de evapora��o, condensa��o e precipita��o.";
		alternativaB[42] = "O ciclo da �gua, com os processos de condensa��o, solidifica��o e resfriamento.";
		alternativaC[42] = "O ciclo da �gua, com os processos de condensa��o, evapora��o e precipita��o.";
		alternativaD[42] = "O ciclo da �gua, com os processos de aquecimento, condensa��o e resfriamento.";
		resposta[42] = 'A';
		valor[42] = valorDificil;

		id[43] = "44";
		texto[43] = "Entre as alternativas abaixo qual � composta somente por recursos naturais n�o renov�veis?";
		alternativaA[43] = "Carv�o mineral, ferro, petr�leo, cobre e xisto.";
		alternativaB[43] = "Mangan�s, carv�o de pedra, xisto e a luz solar.";
		alternativaC[43] = "Vegeta��o, �gua, cobre e ouro.";
		alternativaD[43] = "Vegeta��o, pedras preciosas, vento e ruby.";
		resposta[43] = 'A';
		valor[43] = valorDificil;

		id[44] = "45";
		texto[44] = "Entre as alternativas abaixo qual � composta somente por recursos naturais renov�veis?";
		alternativaA[44] = "�gua dos rios, ar, vegeta��o e xisto.";
		alternativaB[44] = "�gua dos rios, ferro, luz solar e vegeta��o.";
		alternativaC[44] = "�gua dos lagos, ar, luz solar e biomassa.";
		alternativaD[44] = "�gua dos lagos, petr�leo, luz solar e vegeta��o.";
		resposta[44] = 'C';
		valor[44] = valorDificil;

		id[45] = "46";
		texto[45] = "Entre as op��es abaixo qual � a mais correta?\r\n" + 
				"  I.O carv�o mineral, cobre, calc�rio e o diamante, n�o s�o recursos renovaveis.\r\n" + 
				" II.O petr�leo, areia, zinco, chumbo e o estanho, n�o s�o recursos renovaveis.\r\n" + 
				"III.O calc�rio, �gua, vegeta��o e a biomassa, s�o recursos renovaveis.";
		alternativaA[45] = "Somente a  I.";
		alternativaB[45] = "As op��es  I e III.";
		alternativaC[45] = "Somente a  II.";
		alternativaD[45] = "As op��es  I e II.";
		resposta[45] = 'D';
		valor[45] = valorDificil;

		id[46] = "47";
		texto[46] = "Entre as op��es abaixo qual � a mais correta?\r\n" + 
				"  I.O r�dio, petr�leo, calc�rio e o ruby, n�o s�o recursos renovaveis.\r\n" + 
				" II.O xisto, �gua, vegeta��o e o ar, s�o recursos renovaveis.\r\n" + 
				"III.O cobre, areia, zinco, carv�o mineral e o estanho, n�o s�o recursos renovaveis.";
		alternativaA[46] = "Somente a  III.";
		alternativaB[46] = "As op��es  I e III.";
		alternativaC[46] = "Somente a  II.";
		alternativaD[46] = "As op��es  II e III.";
		resposta[46] = 'B';
		valor[46] = valorDificil;

		id[47] = "48";
		texto[47] = "O Brasil � um dos paises que mais desperdi�am �gua tratada no mundo, qual � essa porcentagem de �gua tratada que � desperdi�ada? ";
		alternativaA[47] = "Entre 35% e 40%";
		alternativaB[47] = "Entre 55% e 60%";
		alternativaC[47] = "Entre 45% e 50%";
		alternativaD[47] = "Entre 60% e 65%";
		resposta[47] = 'A';
		valor[47] = valorDificil;

		id[48] = "49";
		texto[48] = "Quais as principais Consequencias do desmatamento no mundo?";
		alternativaA[48] = "Perda de biodiversidade, desertifica��o e exposi��o do solo � eros�o.";
		alternativaB[48] = "Ganho de biodiversidade, desertifica��o e exposi��o do solo � eros�o.";
		alternativaC[48] = "Perda de biodiversidade, desertifica��o e diminui��o do efeito estufa.";
		alternativaD[48] = "Ganho de biodiversidade, desertifica��o e aumento do efeito estufa.";
		resposta[48] = 'A';
		valor[48] = valorDificil;

		id[49] = "50";
		texto[49] = "Quais a �rea mais desmatada no mundo?";
		alternativaA[49] = "Florestas da Indo-Birm�nia";
		alternativaB[49] = "Florestas de Afromontane ";
		alternativaC[49] = "Madagascar e ilhas do Oceano �ndico";
		alternativaD[49] = "Prov�ncia Flor�stica da Calif�rnia ";
		resposta[49] = 'A';
		valor[49] = valorDificil;
		
		id[50] = "51";
		texto[50] = "Selecione corretamente a alternativa que enumera corretamente a 2� coluna em acordo com a 1�.\r\n" + 
				"1� Coluna\r\n" + "2� Coluna \r\n" + 
				"A) Min�rio de Ferro\r\n" + "( ) Recurso renov�vel \r\n" + 
				"B) �gua\r\n" + "( )	Recurso n�o renov�vel energ�tico\r\n" + 
				"C) Energia nuclear\r\n" + "( )	Recurso n�o renov�vel\r\n" + 
				"D) Energia solar\r\n" + "( ) Recurso renov�vel energ�tico";
				
			
		alternativaA[50] = "A, C, B, D.";
		alternativaB[50] = "B, C, A, D.";
		alternativaC[50] = "B, A, C, D.";
		alternativaD[50] = "D, C, A, B.";
		resposta[50] = 'B';
		valor[50] = valorDificil;

		id[51] = "52";
		texto[51] = "Selecione a alternativa que enumera corretamente a 2� coluna em acordo com a 1�.\r\n" + 
				"1� Coluna\r\n" + 
				"A) Carv�o mineral\r\n" + 
				"B) Energia e�lica\r\n" + 
				"C) Min�rio de Cobre\r\n" + 
				"D) Agricultura\r\n" + 
				"2� Coluna \r\n" + 
				"( ) Recurso renov�vel \r\n" + 
				"( )	Recurso n�o renov�vel energ�tico\r\n" + 
				"( )	Recurso n�o renov�vel\r\n" + 
				"( ) Recurso renov�vel energ�tico";
		alternativaA[51] = "A, D, C, B.";
		alternativaB[51] = "B, D, A, C.";
		alternativaC[51] = "B, C, A, D.";
		alternativaD[51] = "D, A, C, B.";
		resposta[51] = 'D';
		valor[51] = valorDificil;

		id[52] = "53";
		texto[52] = "Quais s�o os principais met�dos de classificar os produtos biodegrad�veis?";
		alternativaA[52] = "Papel, Vidro, Tecido e Org�nico";
		alternativaB[52] = "Pl�stico, Org�nico, Papel e Desengraxante";
		alternativaC[52] = "Org�nico, Detergente, Tecido e Papel";
		alternativaD[52] = "Pl�stico, Detergente, Tecido e Desengraxante";
		resposta[52] = 'D';
		valor[52] = valorDificil;

		id[53] = "54";
		texto[53] = "Quais s�o os gases mais relevantes que atua no efeito estufa? ";
		alternativaA[53] = "o vapor de �gua (H2O), o di�xido de carbono (CO2), o metano (CH4) e o �xido nitroso (N2O).";
		alternativaB[53] = "Am�nia (NH3), o di�xido de carbono (CO2), o metano (CH4) e o �xido nitroso (N2O).";
		alternativaC[53] = "O vapor de �gua (H2O), Am�nia (NH3) e o metano (CH4).";
		alternativaD[53] = "�cido fluor�drico (HF), o di�xido de carbono (CO2), Am�nia (NH3) e o �xido nitroso (N2O).";
		resposta[53] = 'A';
		valor[53] = valorDificil;

		id[54] = "55";
		texto[54] = "Sobre os Gases de Efeito Estufa onde se origina o Di�xido de Carbono (CO2)?";
		alternativaA[54] = "� principalmente originado em processos biol�gicos, como o tratamento de efluentes l�quidos e em aterros sanit�rios.";
		alternativaB[54] = "� emitido no processo de ferver �gua.";
		alternativaC[54] = "� emitido no processo fundi��o de metais.";
		alternativaD[54] = "� emitido em processos de combust�o, como em motores e caldeiras.";
		resposta[54] = 'D';
		valor[54] = valorDificil;

		id[55] = "56";
		texto[55] = "Sobre os Gases de Efeito Estufa onde se orgina o Metano (CH4)?";
		alternativaA[55] = "� emitido no processo de ferver �gua.";
		alternativaB[55] = "� emitido em processos de combust�o, como em motores e caldeiras.";
		alternativaC[55] = "� principalmente originado em processos biol�gicos, como o tratamento de efluentes l�quidos e em aterros sanit�rios, e nas atividades agropecu�rias.";
		alternativaD[55] = "� emitido no processo fundi��o de metais.";
		resposta[55] = 'C';
		valor[55] = valorDificil;

		id[56] = "57";
		texto[56] = "Sobre os Gases de Efeito Estufa onde se orgina o �xido Nitroso (N2O)?";
		alternativaA[56] = "� emitido no processo fundi��o de metais.";
		alternativaB[56] = "Pode ser emitido em processos industriais e na agricultura.";
		alternativaC[56] = "� emitido em processos de combust�o, como em motores e caldeiras.";
		alternativaD[56] = "� emitido no processo de ferver �gua.";
		resposta[56] = 'B';
		valor[56] = valorDificil;

		id[57] = "58";
		texto[57] = "Entre as op��es abaixo qual � a mais correta?\r\n" + 
				"  I.O desperd�cio de alimentos atinge um ter�o de toda a comida produzida no mundo\r\n" + 
				" II.54% do desperd�cio de alimentos no mundo ocorre na fase inicial da produ��o\r\n" + 
				"III.54% do desperd�cio de alimentos no mundo ocorre na fase inicial da processamento";
		alternativaA[57] = "Somente a  III.";
		alternativaB[57] = "As op��es  I e III.";
		alternativaC[57] = "Somente a  II.";
		alternativaD[57] = "As op��es  I e II.";
		resposta[57] = 'D';
		valor[57] = valorDificil;

		id[58] = "59";
		texto[58] = "Selecione corretamente a alternativa que corresponde corretamente se as afirma��es s�o verdadeira ou falsas.\r\n" + 
				"A) 54% do desperd�cio de alimentos no mundo ocorre na fase inicial da produ��o\r\n" + 
				"B) O desperd�cio de alimentos atinge um ter�o de toda a comida produzida no mundo\r\n" + 
				"C) 46% do desperd�cio de alimentos ocorrem nas etapas de processamento, distribui��o e consumo.";
		alternativaA[58] = "Verdadeiro, Falso e Verdadeiro.";
		alternativaB[58] = "Falso, Falso e Verdadeiro.";
		alternativaC[58] = "Verdadeiro, Verdadeiro e Verdadeiro.";
		alternativaD[58] = "Falso, Falso e Falso.";
		resposta[58] = 'C';
		valor[58] = valorDificil;

		id[59] = "60";
		texto[59] = "Quais s�o as 3 principais fontes de gases de efeito estufa no Brasil?";
		alternativaA[59] = "Desmatamento, Minera��o e Fermenta��o ent�rica.";
		alternativaB[59] = "Desmatamento, Transportes e Fermenta��o ent�rica.";
		alternativaC[59] = "Processos industriais, Transportes e Fermenta��o ent�rica.";
		alternativaD[59] = "Fermenta��o ent�rica, Transportes e Minera��o.";
		resposta[59] = 'B';
		valor[59] = valorDificil;
		
		//Inicia o Game
		//new FrameJogo();
		new FrameQuestao();
	}
	
}
