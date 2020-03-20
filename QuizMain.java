package aps.quiz;

class QuizMain {
	
	// Add quantas questões ele acertou 
	

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
		
		////////////////////QUESTÕES - FACIL////////////////////////// 
		
		id[0] = "1";
		texto[0] = "Para que a sustentabilidade de fato aconteça é necessário o chamado tripé da sustentabilidade, quais são os três princípios em que ele se baseia?";
		alternativaA[0] = "Sustentabilidade Social, Econômica e Tecnológica.";
		alternativaB[0] = "Sustentabilidade Social, Ecológica e Ambiental.";
		alternativaC[0] = "Sustentabilidade Tecnológica, Ambiental e Ecológica.";
		alternativaD[0] = "Sustentabilidade Ambiental, Social e Econômica.";
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
		texto[2] = "Qual a cor do cesto de lixo reciclavel em que uma GARRAFA DE PLÁSTICO deve ser depositada? ";
		alternativaA[2] = "Branco.";
		alternativaB[2] = "Preto.";
		alternativaC[2] = "Vermelho.";
		alternativaD[2] = "Roxo.";
		resposta[2] = 'C';
		valor[2] = valorFacil;

		id[3] = "4";
		texto[3] = "O que deve ser feito para contribuir na preservação de árvores e florestas?";
		alternativaA[3] = "Frequentando parques e bosques.";
		alternativaB[3] = "Reutilizando vidros, metais e plásticos.";
		alternativaC[3] = "Construindo uma casa na árvore.";
		alternativaD[3] = "Reciclando jornais, revistas e papéis.";
		resposta[3] = 'D';
		valor[3] = valorFacil;

		id[4] = "5";
		texto[4] = "Qual das alternativas a seguir representa um benefício da utilização da energia solar?";
		alternativaA[4] = "Não polui o meio ambiente e nem a atmosfera.";
		alternativaB[4] = "É eficaz em qualquer clima e é sustentável.";
		alternativaC[4] = "Não é uma fonte de energia renovável. ";
		alternativaD[4] = "Está disponivel a todo momento e em todo lugar.";
		resposta[4] = 'A';
		valor[4] = valorFacil;

		id[5] = "6";
		texto[5] = "O que se deve fazer para reciclar lixos eletronicos, como celulares quebrados, pilhas e etc?";
		alternativaA[5] = "Armazenar em casa o máximo de tempo que der.";
		alternativaB[5] = "Jogar no lixo comum.";
		alternativaC[5] = "Recolher e depositar em lixeiras recicláveis na cor branca.";
		alternativaD[5] = "Recolher, organizar e levar para locais especificos para seu descarte. ";
		resposta[5] = 'D';
		valor[5] = valorFacil;

		id[6] = "7";
		texto[6] = "Sobre a energia eólica é correto dizer:";
		alternativaA[6] = "É considerada uma fonte limpa por não emitir gases poluentes e renovavel.";
		alternativaB[6] = "É considerada uma fonte de energia não renovavel.";
		alternativaC[6] = "É considerada uma fonte de renovavel e suja, pois emite gases poluentes.";
		alternativaD[6] = "É considerada uma fonte de energia renovavel, pois gera energia apartir da luz solar.";
		resposta[6] = 'A';
		valor[6] = valorFacil;

		id[7] = "8";
		texto[7] = "Sobre a energia solar é correto afirmar:";
		alternativaA[7] = "É uma fonte de energia limpa e gera energia apartir da água da chuva.";
		alternativaB[7] = "É uma fonte de energia limpa, renovavel e abundante em diversas áreas.";
		alternativaC[7] = "É uma fonte de energia limpa, limitada a poucas áreas.";
		alternativaD[7] = "É uma fonte de energia renovavel e suja, pois libera gases poluentes.";
		resposta[7] = 'B';
		valor[7] = valorFacil;

		id[8] = "9";
		texto[8] = "Sobre a energia hidrelétrica é correto afirmar:";
		alternativaA[8] = "É uma fonte de energia suja e não renovavel, com baixo custo operacional.";
		alternativaB[8] = "É uma fonte de energia limpa e renovavel, com baixo custo operacional.";
		alternativaC[8] = "É uma fonte de energia suja e renovavel, com alto custo operacional.";
		alternativaD[8] = "É uma fonte de energia limpa e não renovavel, com alto custo operacional.";
		resposta[8] = 'B';
		valor[8] = valorFacil;

		id[9] = "10";
		texto[9] = "Sobre a biomassa é correto afirmar:";
		alternativaA[9] = "É toda matéria orgânica, de origem vegetal e animal, utilizada na produção de energia.";
		alternativaB[9] = "É toda matéria inorgânica, de origem mineral ou animal, utilizada na produção de energia.";
		alternativaC[9] = "É toda matéria orgânica, de origem vegetal e mineral, utilizada na produção de energia.";
		alternativaD[9] = "É toda matéria inorgânica, de origem vegetal ou animal, utilizada na produção de energia.";
		resposta[9] = 'A';
		valor[9] = valorFacil;

		id[10] = "11";
		texto[10] = "Qual o melhor conceito para o termo desmatamento ou desflorestamento?";
		alternativaA[10] = "Refere-se à acabar com todas as árvores de uma floresta.";
		alternativaB[10] = "Refere-se à cortar varias árvores de uma floresta.";
		alternativaC[10] = "Refere-se à eliminação total ou parcial de qualquer tipo de cobertura vegetal.";
		alternativaD[10] = "Refere-se à eliminar todos os animais da florestas.";
		resposta[10] = 'C';
		valor[10] = valorFacil;
		
		id[11] = "12";
		texto[11] = "Quais dos recursos abaixo não é renovavel?";
		alternativaA[11] = "Água";
		alternativaB[11] = "Carvão vegetal";
		alternativaC[11] = "Energia solar";
		alternativaD[11] = "Minérios ";
		resposta[11] = 'D';
		valor[11] = valorFacil;

		id[12] = "13";
		texto[12] = "Quais dos recursos abaixo não é renovavel?";
		alternativaA[12] = "Agricultura";
		alternativaB[12] = "Pescas";
		alternativaC[12] = "Combustíveis fósseis";
		alternativaD[12] = "Florestas";
		resposta[12] = 'C';
		valor[12] = valorFacil;

		id[13] = "14";
		texto[13] = "Quais dos recursos abaixo é renovavel?";
		alternativaA[13] = "Combustíveis fósseis";
		alternativaB[13] = "Agricultura";
		alternativaC[13] = "Minérios";
		alternativaD[13] = "Rochas industriais";
		resposta[13] = 'B';
		valor[13] = valorFacil;

		id[14] = "15";
		texto[14] = "Quais dos recursos abaixo é renovavel?";
		alternativaA[14] = "Mínério de ferro";
		alternativaB[14] = "Água";
		alternativaC[14] = "Energia nuclear";
		alternativaD[14] = "Petróleo";
		resposta[14] = 'B';
		valor[14] = valorFacil;
		
		id[15] = "16";
		texto[15] = "O que são recursos naturais?";
		alternativaA[15] = "Tecnologias presentes na natureza.";
		alternativaB[15] = "Somente as energias presentes na natureza.";
		alternativaC[15] = "Matéria ou energia presentes na natureza.";
		alternativaD[15] = "Somente as matérias presentes na natureza.";
		resposta[15] = 'C';
		valor[15] = valorFacil;

		id[16] = "17";
		texto[16] = "Por que produtos biodegradáveis são considerados sustentáveis? ";
		alternativaA[16] = "Pois eles se decompõem facilmente pela ação bacteriana, porém contribuem para a poluição do solo, das águas e do ar.";
		alternativaB[16] = "Pois eles não se decompõem pela ação bacteriana, e acabam por não contribuir para a redução do lixo.";
		alternativaC[16] = "Pois eles se decompõem facilmente pela ação bacteriana, e contribuem para a redução do lixo e da poluição do solo, das águas e do ar.";
		alternativaD[16] = "Pois eles demoram muito para se decompor pela ação bacteriana, mas contribuem para a redução do lixo e da poluição do solo, das águas e do ar.";
		resposta[16] = 'C';
		valor[16] = valorFacil;

		id[17] = "18";
		texto[17] = "Em quais áreas os produtos biodegradáveis ajudam a combater a poluição?";
		alternativaA[17] = "Poluição do solo";
		alternativaB[17] = "Poluição das águas";
		alternativaC[17] = "Poluição do ar.";
		alternativaD[17] = "Todas as alternativas.";
		resposta[17] = 'D';
		valor[17] = valorFacil;

		id[18] = "19";
		texto[18] = "Qual das alternativas a seguir melhor corresponde a uma forma correta de preservar o meio ambiente?";
		alternativaA[18] = "Jogar lixo nas florestas";
		alternativaB[18] = "Economizar água";
		alternativaC[18] = "Jogar lixo nas ruas";
		alternativaD[18] = "Desperdiçar água";
		resposta[18] = 'B';
		valor[18] = valorFacil;

		id[19] = "20";
		texto[19] = "Qual das alternativas a seguir melhor corresponde a uma forma correta de diminuir o efeito estufa?";
		alternativaA[19] = "Aumentar o uso de carros";
		alternativaB[19] = "Aumentar o numero de fabricas e zonas industriais";
		alternativaC[19] = "Cortar árvores e desmatar florestas";
		alternativaD[19] = "Optar pelo uso de bicicletas e diminuir o uso do carro";
		resposta[19] = 'D';
		valor[19] = valorFacil;

		////////////////////QUESTÕES - MEDIO////////////////////////// 
		
		id[20] = "21";
		texto[20] = "Qual a cor do cesto de lixo reciclavel em que RESÍDUOS ORGÂNICOS devem ser depositados? ";
		alternativaA[20] = "Azul.";
		alternativaB[20] = "Marrom.";
		alternativaC[20] = "Laranja.";
		alternativaD[20] = "Preto.";
		resposta[20] = 'B';
		valor[20] = valorMedio;

		id[21] = "22";
		texto[21] = "Em quais cestos para separação do lixo reciclavel os objetos a seguir devem ser depositados respectivamente:\n"+"Resíduos radioativos, resíduos orgânicos e resíduos ambulatoriais.";
		alternativaA[21] = "Verde, Preto, Branco.";
		alternativaB[21] = "Verde, Vermelho, Branco.";
		alternativaC[21] = "Roxo, Marrom, Branco.";
		alternativaD[21] = "Roxo, Preto, Cinza.";
		resposta[21] = 'C';
		valor[21] = valorMedio;

		id[22] = "23";
		texto[22] = "Qual a cor do cesto de lixo reciclável em que RESÍDUOS NÃO RECICLÁVEIS devem ser depositados? ";
		alternativaA[22] = "Laranja.";
		alternativaB[22] = "Roxo.";
		alternativaC[22] = "Azul.";
		alternativaD[22] = "Cinza.";
		resposta[22] = 'D';
		valor[22] = valorMedio;

		id[23] = "24";
		texto[23] = "Quais dos objetos a seguir podem ser depositados em um cesto de lixo reciclável AZUL?";
		alternativaA[23] = "Folha sulfite, garrafa de plástico, revista e caixa de papelão.";
		alternativaB[23] = "Folha sulfite, papel amassado, jornal e caixa de papelão.";
		alternativaC[23] = "Garrafa de plástico, papel amassado e caixa de papelão.";
		alternativaD[23] = "Copo de vidro, papel amassado e revista.";
		resposta[23] = 'B';
		valor[23] = valorMedio;

		id[24] = "25";
		texto[24] = "Quais dos objetos a seguir podem ser depositados em um cesto de lixo reciclável AMARELO?";
		alternativaA[24] = "Lata de alumínio, panela sem cabo, arames e cano de metal.";
		alternativaB[24] = "Casca de fruta, panela sem cabo, jornal e cano de metal.";
		alternativaC[24] = "Revista, panela sem cabo, canetas e cano de metal.";
		alternativaD[24] = "Lata de alumínio, pilhas, cd e canos de metal.";
		resposta[24] = 'A';
		valor[24] = valorMedio;

		id[25] = "26";
		texto[25] = "Quais dos objetos a seguir podem ser depositados em um cesto de lixo reciclável VERMELHO?";
		alternativaA[25] = "Lata de alumínio , sacolas, cd e cartolina.";
		alternativaB[25] = "Copo de vidro, casca de banana,  e caneta.";
		alternativaC[25] = "Revista, frasco de vidro, cd e dvd.";
		alternativaD[25] = "Copo plástico, sacolas, cd e caneta.";
		resposta[25] = 'D';
		valor[25] = valorMedio;

		id[26] = "27";
		texto[26] = "No Brasil, qual é o setor campeão no consumo e desperdicio de água?";
		alternativaA[26] = "Industria.";
		alternativaB[26] = "Consumo urbano.";
		alternativaC[26] = "Agricultura.";
		alternativaD[26] = "Consumo animal e rural.";
		resposta[26] = 'C';
		valor[26] = valorMedio;

		id[27] = "28";
		texto[27] = "O que é reciclagem?";
		alternativaA[27] = "É o processo que acontece com o lixo Durante o seu descarte.";
		alternativaB[27] = "É o processo que acontece com o lixo após o seu descarte.";
		alternativaC[27] = "É o processo que acontece com o lixo antes o seu descarte.";
		alternativaD[27] = "É o processo que transforma o lixo em novos produtos para consumo.";
		resposta[27] = 'D';
		valor[27] = valorMedio;

		id[28] = "29";
		texto[28] = "No Brasil, qual é a principal fonte de energia usada para suprir as necessidade do pais?";
		alternativaA[28] = "Energia solar";
		alternativaB[28] = "Energia hidrelétrica";
		alternativaC[28] = "Energia das marés";
		alternativaD[28] = "Energia eólica";
		resposta[28] = 'B';
		valor[28] = valorMedio;

		id[29] = "30";
		texto[29] = "Quais as vantagens de se utilizar biomassa para gerar energia?";
		alternativaA[29] = "Seu baixo custo e baixa emissão de gases poluentes.";
		alternativaB[29] = "Seu alto custo e baixa emissão de gases poluentes.";
		alternativaC[29] = "Seu baixo custo e alta emissão de gases poluentes.";
		alternativaD[29] = "Seu alto custo e alta emissão de gases poluentes.";
		resposta[29] = 'A';
		valor[29] = valorMedio;

		id[30] = "31";
		texto[30] = "O que é Sustentabilidade?";
		alternativaA[30] = "É um conceito formado por um conjunto de ideias, estratégias e atitudes ecologicamente corretas, economicamente viáveis e socialmente justas.";
		alternativaB[30] = "É um conceito formado por um conjunto de ideologias, estratégias e atitudes para sustentar futuras guerras.";
		alternativaC[30] = "É um conceito formado por um conjunto de ideologias, estratégias e atitudes ecologicamente corretas, economicamente viáveis e socialmente injustas.";
		alternativaD[30] = "É um conceito formado por um conjunto de ideias, estratégias e atitudes ecologicamente corretas e socialmente justas somente.";
		resposta[30] = 'A';
		valor[30] = valorMedio;

		id[31] = "32";
		texto[31] = "Sobre sustentabilidade ambiental e Ecológica é correto afirmar:";
		alternativaA[31] = "É responsavel pela manutenção do meio ambiente do planeta Terra, mantendo a qualidade de vida e os ecossistemas em harmonia com as pessoas.";
		alternativaB[31] = "É responsavel pela manutenção da sociedade do planeta Terra, mantendo a qualidade de vida para as pessoas.";
		alternativaC[31] = "É responsavel pela manutenção do meio ambiente do planeta Terra, mantendo a qualidade de vida e os ecossistemas em harmonia com as pessoas.";
		alternativaD[31] = "É responsavel pela manutenção dos ecossistemas do planeta Terra, mantendo uma pessiama qualidade de vida para as pessoas.";
		resposta[31] = 'C';
		valor[31] = valorMedio;

		id[32] = "33";
		texto[32] = "Sobre sustentabilidade empresarial é correto afirmar:";
		alternativaA[32] = "A empresa que não se preocupa com a sustentabilidade é aquela que cuida do planeta, se preocupa com a comunidade e com o meio ambiente.";
		alternativaB[32] = "A empresa que cuida do planeta, se preocupa com a comunidade e com o meio ambiente, não se preocupa em nada com sustentabilidade.";
		alternativaC[32] = "A empresa que se preocupa com a sustentabilidade é aquela que não cuida do planeta, não se preocupa com a comunidade e e polui o meio ambiente.";
		alternativaD[32] = "A empresa que se preocupa com a sustentabilidade é aquela que cuida do planeta, se preocupa com a comunidade e com o meio ambiente.";
		resposta[32] = 'D';
		valor[32] = valorMedio;

		id[33] = "34";
		texto[33] = "Sobre sustentabilidade social é correto afirmar:";
		alternativaA[33] = "É responsavel pelo conjunto de medidas estabelecidas para promover o equilíbrio e o bem-estar das empresas.";
		alternativaB[33] = "É responsavel pelo conjunto de medidas estabelecidas para promover o equilíbrio e o bem-estar do meio ambiente.";
		alternativaC[33] = "É responsavel pelo conjunto de medidas estabelecidas para promover o equilíbrio e o bem-estar da sociedade.";
		alternativaD[33] = "É responsavel pelo conjunto de medidas estabelecidas para promover o desequilíbrio e o bem-estar do meio ambiente.";
		resposta[33] = 'C';
		valor[33] = valorMedio;

		id[34] = "35";
		texto[34] = "Sobre sustentabilidade econômica é correto afirmar:";
		alternativaA[34] = "Busca garantir o desenvolvimento tecnológico levando em consideração estratégias que provoquem impactos ambientais ou que diminuam a qualidade de vida das pessoas em sociedade.";
		alternativaB[34] = "Busca garantir o desenvolvimento econômico levando em consideração estratégias que não provoquem impactos ambientais ou que diminuam a qualidade de vida das pessoas em sociedade";
		alternativaC[34] = "Busca garantir o desenvolvimento econômico levando em consideração estratégias que provoquem impactos ambientais ou que melhore qualidade de vida das pessoas em sociedade.";
		alternativaD[34] = "Busca garantir o desenvolvimento tecnológico levando em consideração estratégias que não provoquem impactos ambientais ou que melhorem a qualidade de vida das pessoas com o meio ambiente.";
		resposta[34] = 'B';
		valor[34] = valorMedio;

		id[35] = "36";
		texto[35] = "De acordo com os recursos a seguir indentifique quais são renovaveis e quais não são respectivamente:\n"+"Água, agricultura, petróleo e carvão mineral.";
		alternativaA[35] = "Renovável, não renovável, renovável, renovável.";
		alternativaB[35] = "Renovável, renovável, renovável, não renovável.";
		alternativaC[35] = "Renovável, renovável, não renovável, não renovável.";
		alternativaD[35] = "Não renovável, não renovável, renovável, renovável.";
		resposta[35] = 'C';
		valor[35] = valorMedio;

		id[36] = "37";
		texto[36] = "De acordo com os recursos a seguir indentifique quais são renovaveis e quais não são respectivamente:\n"+"Energia eólica, minérios, carvão mineral e diamante.";
		alternativaA[36] = "Renovável, não renovável, não renovável, não renovável.";
		alternativaB[36] = "Não renovável, renovável, renovável, renovável.";
		alternativaC[36] = "Não renovável, renovável, não renovável, não renovável.";
		alternativaD[36] = "Renovável, não renovável, renovável, não renovável.";
		resposta[36] = 'A';
		valor[36] = valorMedio;

		id[37] = "38";
		texto[37] = "De acordo com os recursos a seguir indentifique quais são renovaveis e quais não são respectivamente:\n"+"Águas subterrãneas, florestas, agricultura e carvão vegetal.";
		alternativaA[37] = "Renovável, renovável, renovável, não renovável.";
		alternativaB[37] = "Renovável, não renovável, renovável, não renovável.";
		alternativaC[37] = "Renovável, renovável, renovável, renovável.";
		alternativaD[37] = "Renovável, renovável, não renovável, não renovável.";
		resposta[37] = 'C';
		valor[37] = valorMedio;

		id[38] = "39";
		texto[38] = "o que é um recurso natural não renovável?";
		alternativaA[38] = "Um recurso que é consumido mais rapidamente do que é capaz de se formar naturalmente.";
		alternativaB[38] = "Um recurso que pode ser reposto naturalmente e num prazo relativamente curto.";
		alternativaC[38] = "Um recurso que é consumido mais lentamente do que é capaz de se formar naturalmente.";
		alternativaD[38] = "Um recurso que não é consumido mais rapidamente do que é capaz de se formar naturalmente.";
		resposta[38] = 'A';
		valor[38] = valorMedio;

		id[39] = "40";
		texto[39] = "O que é um recurso natural renovável?";
		alternativaA[39] = "Um recurso que não pode ser reposto naturalmente e num prazo relativamente longo.";
		alternativaB[39] = "Uma recurso que não pode ser reposto naturalmente e num prazo relativamente curto.";
		alternativaC[39] = "Um recurso que pode ser reposto naturalmente e num prazo relativamente curto.";
		alternativaD[39] = "Um recurso que pode ser reposto naturalmente e num prazo relativamente longo.";
		resposta[39] = 'C';
		valor[39] = valorMedio;

		////////////////////QUESTÕES - DIFICIL////////////////////////// 
		
		id[40] = "41";
		texto[40] = "Em quais cestos para separação do lixo reciclavel os objetos a seguir devem ser depositados respectivamente:\n"+"Folha de papel, seringa contaminada, madeira, garrafa de vidro e copo de plástico.";
		alternativaA[40] = "Azul, Cinza, Preto, Verde e Vermelho.";
		alternativaB[40] = "Azul, Verde, Cinza, Branco e Rosa.";
		alternativaC[40] = "Roxo, Branco, Marrom, Rosa e Vermelho.";
		alternativaD[40] = "Preto, Branco, Cinza, Azul e Laranja.";
		resposta[40] = 'A';
		valor[40] = valorDificil;

		id[41] = "42";
		texto[41] = "Em quais cestos para separação do lixo reciclavel os objetos a seguir devem ser depositados respectivamente:\n"+"Resíduos radioativos, espelhos, pilhas, casca de banana e lâmpadas.";
		alternativaA[41] = "Roxo, laranja, cinza, branco e cinza.";
		alternativaB[41] = "Cinza, cinza, branco, Laranja e branco.";
		alternativaC[41] = "Roxo, cinza, laranja, marrom e laranja.";
		alternativaD[41] = "Azul, cinza, verde, marrom e vermelho.";
		resposta[41] = 'C';
		valor[41] = valorDificil;

		id[42] = "43";
		texto[42] = "Em nosso planeta existem diversos recursos naturais renovaveis, selecione a seguir a alternativa que melhor explica o motivo de a água ser um desses recursos.";
		alternativaA[42] = "O ciclo da água, com os processos de evaporação, condensação e precipitação.";
		alternativaB[42] = "O ciclo da água, com os processos de condensação, solidificação e resfriamento.";
		alternativaC[42] = "O ciclo da água, com os processos de condensação, evaporação e precipitação.";
		alternativaD[42] = "O ciclo da água, com os processos de aquecimento, condensação e resfriamento.";
		resposta[42] = 'A';
		valor[42] = valorDificil;

		id[43] = "44";
		texto[43] = "Entre as alternativas abaixo qual é composta somente por recursos naturais não renováveis?";
		alternativaA[43] = "Carvão mineral, ferro, petróleo, cobre e xisto.";
		alternativaB[43] = "Manganês, carvão de pedra, xisto e a luz solar.";
		alternativaC[43] = "Vegetação, água, cobre e ouro.";
		alternativaD[43] = "Vegetação, pedras preciosas, vento e ruby.";
		resposta[43] = 'A';
		valor[43] = valorDificil;

		id[44] = "45";
		texto[44] = "Entre as alternativas abaixo qual é composta somente por recursos naturais renováveis?";
		alternativaA[44] = "Água dos rios, ar, vegetação e xisto.";
		alternativaB[44] = "Água dos rios, ferro, luz solar e vegetação.";
		alternativaC[44] = "Água dos lagos, ar, luz solar e biomassa.";
		alternativaD[44] = "Água dos lagos, petróleo, luz solar e vegetação.";
		resposta[44] = 'C';
		valor[44] = valorDificil;

		id[45] = "46";
		texto[45] = "Entre as opções abaixo qual é a mais correta?\r\n" + 
				"  I.O carvão mineral, cobre, calcário e o diamante, não são recursos renovaveis.\r\n" + 
				" II.O petróleo, areia, zinco, chumbo e o estanho, não são recursos renovaveis.\r\n" + 
				"III.O calcário, água, vegetação e a biomassa, são recursos renovaveis.";
		alternativaA[45] = "Somente a  I.";
		alternativaB[45] = "As opções  I e III.";
		alternativaC[45] = "Somente a  II.";
		alternativaD[45] = "As opções  I e II.";
		resposta[45] = 'D';
		valor[45] = valorDificil;

		id[46] = "47";
		texto[46] = "Entre as opções abaixo qual é a mais correta?\r\n" + 
				"  I.O rádio, petróleo, calcário e o ruby, não são recursos renovaveis.\r\n" + 
				" II.O xisto, água, vegetação e o ar, são recursos renovaveis.\r\n" + 
				"III.O cobre, areia, zinco, carvão mineral e o estanho, não são recursos renovaveis.";
		alternativaA[46] = "Somente a  III.";
		alternativaB[46] = "As opções  I e III.";
		alternativaC[46] = "Somente a  II.";
		alternativaD[46] = "As opções  II e III.";
		resposta[46] = 'B';
		valor[46] = valorDificil;

		id[47] = "48";
		texto[47] = "O Brasil é um dos paises que mais desperdiçam água tratada no mundo, qual é essa porcentagem de água tratada que é desperdiçada? ";
		alternativaA[47] = "Entre 35% e 40%";
		alternativaB[47] = "Entre 55% e 60%";
		alternativaC[47] = "Entre 45% e 50%";
		alternativaD[47] = "Entre 60% e 65%";
		resposta[47] = 'A';
		valor[47] = valorDificil;

		id[48] = "49";
		texto[48] = "Quais as principais Consequencias do desmatamento no mundo?";
		alternativaA[48] = "Perda de biodiversidade, desertificação e exposição do solo à erosão.";
		alternativaB[48] = "Ganho de biodiversidade, desertificação e exposição do solo à erosão.";
		alternativaC[48] = "Perda de biodiversidade, desertificação e diminuição do efeito estufa.";
		alternativaD[48] = "Ganho de biodiversidade, desertificação e aumento do efeito estufa.";
		resposta[48] = 'A';
		valor[48] = valorDificil;

		id[49] = "50";
		texto[49] = "Quais a área mais desmatada no mundo?";
		alternativaA[49] = "Florestas da Indo-Birmânia";
		alternativaB[49] = "Florestas de Afromontane ";
		alternativaC[49] = "Madagascar e ilhas do Oceano Índico";
		alternativaD[49] = "Província Florística da Califórnia ";
		resposta[49] = 'A';
		valor[49] = valorDificil;
		
		id[50] = "51";
		texto[50] = "Selecione corretamente a alternativa que enumera corretamente a 2ª coluna em acordo com a 1ª.\r\n" + 
				"1ª Coluna\r\n" + "2ª Coluna \r\n" + 
				"A) Minério de Ferro\r\n" + "( ) Recurso renovável \r\n" + 
				"B) Água\r\n" + "( )	Recurso não renovável energético\r\n" + 
				"C) Energia nuclear\r\n" + "( )	Recurso não renovável\r\n" + 
				"D) Energia solar\r\n" + "( ) Recurso renovável energético";
				
			
		alternativaA[50] = "A, C, B, D.";
		alternativaB[50] = "B, C, A, D.";
		alternativaC[50] = "B, A, C, D.";
		alternativaD[50] = "D, C, A, B.";
		resposta[50] = 'B';
		valor[50] = valorDificil;

		id[51] = "52";
		texto[51] = "Selecione a alternativa que enumera corretamente a 2ª coluna em acordo com a 1ª.\r\n" + 
				"1ª Coluna\r\n" + 
				"A) Carvão mineral\r\n" + 
				"B) Energia eólica\r\n" + 
				"C) Minério de Cobre\r\n" + 
				"D) Agricultura\r\n" + 
				"2ª Coluna \r\n" + 
				"( ) Recurso renovável \r\n" + 
				"( )	Recurso não renovável energético\r\n" + 
				"( )	Recurso não renovável\r\n" + 
				"( ) Recurso renovável energético";
		alternativaA[51] = "A, D, C, B.";
		alternativaB[51] = "B, D, A, C.";
		alternativaC[51] = "B, C, A, D.";
		alternativaD[51] = "D, A, C, B.";
		resposta[51] = 'D';
		valor[51] = valorDificil;

		id[52] = "53";
		texto[52] = "Quais são os principais metódos de classificar os produtos biodegradáveis?";
		alternativaA[52] = "Papel, Vidro, Tecido e Orgânico";
		alternativaB[52] = "Plástico, Orgânico, Papel e Desengraxante";
		alternativaC[52] = "Orgânico, Detergente, Tecido e Papel";
		alternativaD[52] = "Plástico, Detergente, Tecido e Desengraxante";
		resposta[52] = 'D';
		valor[52] = valorDificil;

		id[53] = "54";
		texto[53] = "Quais são os gases mais relevantes que atua no efeito estufa? ";
		alternativaA[53] = "o vapor de água (H2O), o dióxido de carbono (CO2), o metano (CH4) e o óxido nitroso (N2O).";
		alternativaB[53] = "Amônia (NH3), o dióxido de carbono (CO2), o metano (CH4) e o óxido nitroso (N2O).";
		alternativaC[53] = "O vapor de água (H2O), Amônia (NH3) e o metano (CH4).";
		alternativaD[53] = "Ácido fluorídrico (HF), o dióxido de carbono (CO2), Amônia (NH3) e o óxido nitroso (N2O).";
		resposta[53] = 'A';
		valor[53] = valorDificil;

		id[54] = "55";
		texto[54] = "Sobre os Gases de Efeito Estufa onde se origina o Dióxido de Carbono (CO2)?";
		alternativaA[54] = "É principalmente originado em processos biológicos, como o tratamento de efluentes líquidos e em aterros sanitários.";
		alternativaB[54] = "É emitido no processo de ferver água.";
		alternativaC[54] = "É emitido no processo fundição de metais.";
		alternativaD[54] = "É emitido em processos de combustão, como em motores e caldeiras.";
		resposta[54] = 'D';
		valor[54] = valorDificil;

		id[55] = "56";
		texto[55] = "Sobre os Gases de Efeito Estufa onde se orgina o Metano (CH4)?";
		alternativaA[55] = "É emitido no processo de ferver água.";
		alternativaB[55] = "É emitido em processos de combustão, como em motores e caldeiras.";
		alternativaC[55] = "É principalmente originado em processos biológicos, como o tratamento de efluentes líquidos e em aterros sanitários, e nas atividades agropecuárias.";
		alternativaD[55] = "É emitido no processo fundição de metais.";
		resposta[55] = 'C';
		valor[55] = valorDificil;

		id[56] = "57";
		texto[56] = "Sobre os Gases de Efeito Estufa onde se orgina o Óxido Nitroso (N2O)?";
		alternativaA[56] = "É emitido no processo fundição de metais.";
		alternativaB[56] = "Pode ser emitido em processos industriais e na agricultura.";
		alternativaC[56] = "É emitido em processos de combustão, como em motores e caldeiras.";
		alternativaD[56] = "É emitido no processo de ferver água.";
		resposta[56] = 'B';
		valor[56] = valorDificil;

		id[57] = "58";
		texto[57] = "Entre as opções abaixo qual é a mais correta?\r\n" + 
				"  I.O desperdício de alimentos atinge um terço de toda a comida produzida no mundo\r\n" + 
				" II.54% do desperdício de alimentos no mundo ocorre na fase inicial da produção\r\n" + 
				"III.54% do desperdício de alimentos no mundo ocorre na fase inicial da processamento";
		alternativaA[57] = "Somente a  III.";
		alternativaB[57] = "As opções  I e III.";
		alternativaC[57] = "Somente a  II.";
		alternativaD[57] = "As opções  I e II.";
		resposta[57] = 'D';
		valor[57] = valorDificil;

		id[58] = "59";
		texto[58] = "Selecione corretamente a alternativa que corresponde corretamente se as afirmações são verdadeira ou falsas.\r\n" + 
				"A) 54% do desperdício de alimentos no mundo ocorre na fase inicial da produção\r\n" + 
				"B) O desperdício de alimentos atinge um terço de toda a comida produzida no mundo\r\n" + 
				"C) 46% do desperdício de alimentos ocorrem nas etapas de processamento, distribuição e consumo.";
		alternativaA[58] = "Verdadeiro, Falso e Verdadeiro.";
		alternativaB[58] = "Falso, Falso e Verdadeiro.";
		alternativaC[58] = "Verdadeiro, Verdadeiro e Verdadeiro.";
		alternativaD[58] = "Falso, Falso e Falso.";
		resposta[58] = 'C';
		valor[58] = valorDificil;

		id[59] = "60";
		texto[59] = "Quais são as 3 principais fontes de gases de efeito estufa no Brasil?";
		alternativaA[59] = "Desmatamento, Mineração e Fermentação entérica.";
		alternativaB[59] = "Desmatamento, Transportes e Fermentação entérica.";
		alternativaC[59] = "Processos industriais, Transportes e Fermentação entérica.";
		alternativaD[59] = "Fermentação entérica, Transportes e Mineração.";
		resposta[59] = 'B';
		valor[59] = valorDificil;
		
		//Inicia o Game
		//new FrameJogo();
		new FrameQuestao();
	}
	
}
