package MazeCodePackage;
import java.util.Scanner;
import java.util.Random;
public class MazeCode {
	
	// metodo game over
	public static void gameover(int vida) {
		if(vida<=0) {
			System.out.println("Os pontos de vida s�o: "+vida+"\n");
			System.out.println("GAME OVER");
			System.exit(0);
		}
	}
	
	//metodo teste sua sorte
	public static int testesorte(int vida) {
		Random aleatorio = new Random();
		int sorte;
		
			System.out.println("Que a sorte esteja a seu favor.\n");
			sorte = aleatorio.nextInt(5) - 2 ;
			
			vida = vida+sorte;
			
			System.out.println("O seu teste da sorte foi: " + sorte);
			System.out.println("A seus pontos de vida atuais s�o: "+vida+"\n");
			
		if(vida<=0) {
			System.out.println("GAME OVER");
			System.exit(0);
		}
		
		return(vida);
	}
	
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Seja bem vindo ao MAZE CODE");
	//var nome
	String nickname;
	
	//pontos de vida
	int vida = 5;
	
	//direcao
	int direcao = 0;
	
	//teste sua sorte
	int teste = 0;
	
	//var primeira questao
	String resposta = "A";
	int tentativa = 0;
	 
	 System.out.print("Digite seu nome para iniciar o jogo: ");
	 nickname = entrada.next();
	 
	 System.out.println("\n Em um lindo dia ensolarado," +nickname+" estava a caminho de sua casa, quando a �ltima coisa que conseguiu ver foi um saco preto sendo colocado rapidamente em sua cabe�a,"
		+ " \nsentiu uma picada de agulha em seu bra�o esquerdo, que logo ap�s o apagou.\n");
	 
	 
	 System.out.println(" Algum tempo depois...");
	 System.out.println("Acordou assustado, estava em uma sala com uma pequena janela onde s� podia ver muros pelo lado de fora,n�o sabia onde estava, \n"
	 	+ "n�o se lembrava de nada do que tinha acontecido, nem mesmo de sua vida antiga, apenas de seu primeiro nome, "+nickname+".");
	 
	 
	 System.out.println(" Desesperado, olhou por todos os lados da sala, onde conseguiu localizar apenas uma folha de papel com alguma mensagem, ent�o correu em sua dire��o e a leu. \n "
	 	+ "\n Ol� "+nickname+", se est� lendo esta mensagem � por que tudo est� ocorrendo como planejado. Voc� foi o escolhido para desvendar o maior mist�rio j� criado por n�s.\n"
	 	+ "O seu c�rebro funciona de modo diferente dos demais, de modo extraordin�rio, que, se conseguir passar por todos os testes sem a ajuda de ningu�m, \n"
	 	+ "ter� algo �nico que nenhum dinheiro do mundo possa comprar.\n Sei que est� sofrendo uma onda de frustra��o neste momento, mas ter� suas respostas assim que for avan�ando,"
	 	+ "ent�o d� o seu melhor neste desafio, e lembre-se, \n"
	 	+ "Cruel � bom! ");
	 
	 
	 System.out.println("\n  Depois de ler esta mensagem, ficou ciente de que havia uma jornada dif�cil a sua frente. Saiu da pequena sala e encontrou uma caixa com itens preparat�rios,\n"
	 	+ "como t�nis de corrida, uma garrafa de �gua, e um grande mapa, que s� de olhar j� dava para entender que tudo aquilo fazia parte de um labirinto,\n"
	 	+ "n�o queria ficar parado ali refletindo o que estava acontecendo, apenas queria sair daquele lugar o mais r�pido poss�vel, ent�o se levantou, certificou-se do caminho \n"
	 	+ "que deveria seguir no mapa e come�ou a correr. \n");
	 		
	 // primeira escolha de direcao
	 System.out.println("Para qual lado deseja seguir?");
	 System.out.println("1 - direita");
	 System.out.println("2 - Esquerda");
	 direcao = entrada.nextInt();
	 
	 System.out.print(" Depois de 40 minutos correndo, entrando em corredores atr�s de corredores, e ouvindo barulhos esquisitos, ficou � frente de uma longa porta de puro a�o, \n"
		+ "onde estava escrito �TESTE 1�, e logo ao lado tinha uma caixinha com um aparelho semelhante � um ipad dentro, "+nickname+" o pegou e uma mensagem de �udio come�ou \n"
		+ "a ser reproduzida �Estes testes consistem em 10 perguntas, cada uma com 4 alternativas, se acertar todas estar� livre deste labirinto, sen�o, virar� comida de verdugos, \n\n");
	 
	 
	 // primeiro questionario
	 
	 if(direcao == 2) {
			System.out.println("�PRIMEIRA PERGUNTA�. \n");
			System.out.println("O que s�o n�meros bin�rios: ");
			System.out.println("A- Base numerica de dois algarismos 0 e 1");
			System.out.println("B- Numeros que se multiplicam por 2");
			System.out.println("C- Numeros pares");
			System.out.println("D- Numeros primos");
			System.out.println("E- Numeros que s�o multiplos de 2");
			do {
				
				resposta = entrada.next().toUpperCase();
				switch(resposta) {
				case "A":
					System.out.println("Resposta correta \n");
					resposta = "A";
					System.out.println("A base do sistema bin�rio � 2 ent�o s� pode ser composta por 0 e 1");
					break;
					
				case "B":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "C":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "D":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "E":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				default:
					System.out.println("Resposta inv�lida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("Dica: Os n�meros bin�rios s�o compostos por 0 e 1");
					tentativa=0;
				}
				
				gameover(vida);
				
			}while(resposta != "A");
			System.out.println("Os pontos de vida s�o: "+vida+"\n");
			
			}
			else if(direcao == 1) {
				System.out.println("�PRIMEIRA PERGUNTA�. \n");
				System.out.println("Qual numero decimal � representado pelo numero bin�rio 11: ");
				System.out.println("A- 11");
				System.out.println("B- 2");
				System.out.println("C- 1");
				System.out.println("D- 3");
				System.out.println("E- 1");
				do {
					
					resposta = entrada.next().toUpperCase();
					switch(resposta) {
					case "A":
						System.out.println("Resposta incorreta");
						tentativa++;
						vida--;
						break;
						
					case "B":
						System.out.println("Resposta incorreta");
						tentativa++;
						vida--;
						break;
						
					case "C":
						System.out.println("Resposta incorreta");
						tentativa++;
						vida--;
						break;
						
					case "D":
						System.out.println("Resposta correta \n");
						resposta = "D";
						System.out.println("O n�mero 11 pode ser representado como 10(2) + 01(2) em base bin�rio por isso o resultado 3");
						break;
						
					case "E":
						System.out.println("Resposta incorreta");
						tentativa++;
						vida--;
						break;
						
					default:
						System.out.println("Resposta inv�lida");
						break;
					}
					if (tentativa == 2) {
						System.out.println("\nDica: Para chegar ao resultado deve ser somado cada bit bin�rio pela potencia de sua posi��o e depois somar os resultados");
						tentativa=0;
						}
					
					gameover(vida);
					
				}while(resposta != "D");
				System.out.println("Os pontos de vida s�o: "+vida+"\n");
			}
	 
	//continuacao da historia
	
	System.out.println("Acertando ent�o a resposta, a porta � sua frente se abriu e "+nickname+" continuou avan�ando entre as altas paredes de a�o e cimento");
	
	// segunda escolha de direcao
	System.out.println("Para qual lado deseja seguir?");
	System.out.println("1 - direita");
	System.out.println("2 - Esquerda");
	direcao = entrada.nextInt();
	
	System.out.println("Ap�s caminhar por alguns minutos chegando ent�o em uma porta totalmente id�ntica � primeira, mas moldado neste estava escrito �TESTE 2�\n\n"
			+ nickname +" pegou o aparelho ao lado e a pergunta apareceu na tela. \n");
	
	// segundo questionario
	if (direcao == 2) {	
		System.out.println("�SEGUNDA PERGUNTA� \n");
		System.out.println("O que s�o portas l�gicas e circuitos l�gicos: ");
		System.out.println("A- S�o portas inteligentes");
		System.out.println("B- S�o circuitos que operam e trabalham com um ou mais sinais l�gicos de entrada para produzir uma e somente uma sa�da");
		System.out.println("C- Uma linguagem de programa��o obsoleta, usada para programar maquinas mais antigas");
		System.out.println("D- S�o portas de liga��o para se conectar a uma rede");
		System.out.println("E- Nenhuma das alternativas acima");
		do {
			
			resposta = entrada.next().toUpperCase();
			switch(resposta) {
			case "A":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "B":
				System.out.println("Resposta correta \n");
				resposta = "B";
				System.out.println("Portas l�gicas servem para operar um sistema com apenas uma saida, exempo: ligar e desligar o interruptor de uma lampada");
				break;
				
			case "C":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "D":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "E":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			default:
				System.out.println("Resposta inv�lida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: Possuem entradas e sa�da");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "B");
		System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}
		else if(direcao == 1) {
			System.out.println("�SEGUNDA PERGUNTA� \n");
			System.out.println("Quais s�o os tipos de portas l�gicas ");
			System.out.println("A- AND, OR, NOT, NAND e NOAR");
			System.out.println("B- AND, OR, NOT, NAND, NOT, XOR e XNOR");
			System.out.println("C- AND, OR, DONOT, DOOR");
			System.out.println("D- A e B");
			System.out.println("E- AND, OR, NOT, NAND, NOR, XOR e XNOR");
			do {
				
				resposta = entrada.next().toUpperCase();
				switch(resposta) {
				case "A":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "B":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "C":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "D":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "E":
					System.out.println("Resposta correta \n");
					resposta = "E";
					System.out.println("Esses s�o os nomes dados as portas l�gicas para definir a opera��o usada para chegar a sa�da do circuito");
					break;
					
				default:
					System.out.println("Resposta inv�lida");
					break;
				}
				if (tentativa == 2) {
					System.out.println("\nDica: leia o nome de cada porta l�gica com aten��o e fique atento aos detalhes");
					tentativa=0;
					}
				
				gameover(vida);
				
			}while(resposta != "E");
			System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}
	// teste sua sorte
		System.out.println(" Voc� se deparou com um teste opcional que ir� testar sua sorte para ganhar ou perder pontos de vida. Deseja continuar?");
		System.out.println("1. SIM");
		System.out.println("2. N�O");
		teste = entrada.nextInt();
		if (teste == 1) {
			vida = testesorte(vida);
		}
	//continuacao da historia
	System.out.println("Continuou avan�ando, desta vez os barulhos esquisitos que vinha ouvindo no caminho parecia estar ficando cada vez mais pr�ximos, o que o deixou um pouco aflito. \n");
	
	// terceira escolha de direcao
	System.out.println("Para qual lado deseja seguir?");
	System.out.println("1 - direita");
	System.out.println("2 - Esquerda");
	direcao = entrada.nextInt();
	
	System.out.println("Mas depois de correr cerca de 30 minutos chegou em um corredor sem sa�da, apenas com um c�rculo com cerca de 1 metro de di�metro, nele escrito �TESTE 3�, \n"
		+ "que poderia ser uma passagem, desta vez n�o havia nenhum aparelho para que ele pudesse responder ao teste 3, procurou em todos os cantos e n�o conseguiu encontrar absolutamente nada,\n"
		+ "a �nica coisa que tinha notado � que em todas as paredes estava escrito �Cruel � bom!�, ele a leu em v�s alta e automaticamente abriu apenas uma pequena parte do c�rculo, \n"
		+ "revelando ent�o a caixa com o aparelho. "
		+ nickname + " o pegou e a pergunta apareceu. \n");
	
	// terceiro questionario

	if (direcao==1) {
		System.out.println("�TERCEIRA PERGUNTA� \n");
		System.out.println("Qual sinal representa a porta E (AND):");
		System.out.println("A- +");
		System.out.println("B- *");
		System.out.println("C- !");
		System.out.println("D- -");
		System.out.println("E- /");
		do {
			
			resposta = entrada.next().toUpperCase();
			switch(resposta) {
			case "A":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "B":
				System.out.println("Resposta correta \n");
				resposta = "B";
				System.out.println("A porta E(and) � representada por * para sinalizar que se ouver apenas uma porta 1 a sa�da ainda ser� 0");
				break;
				
			case "C":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "D":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "E":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			default:
				System.out.println("Resposta inv�lida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: Para que a sa�da dessa porta seja 1 deve se MULTIPLICAR todas as entradas");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "B");
		System.out.println("Os pontos de vida s�o: "+vida+"\n");
	}
	else if(direcao == 2) {
		System.out.println("�TERCEIRA PERGUNTA� \n");
		System.out.println("Qual sinal representa a porta OU (OR):");
		System.out.println("A- *");
		System.out.println("B- +");
		System.out.println("C- !");
		System.out.println("D- -");
		System.out.println("E- /");
		do {
			
			resposta = entrada.next().toUpperCase();
			switch(resposta) {
			case "A":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "B":
				System.out.println("Resposta correta \n");
				resposta = "B";
				System.out.println("A porta OU(OR) � representada por + para sinalizar que se ouver qualquer porta 1 a sa�da sera 1");
				break;
				
			case "C":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "D":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "E":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			default:
				System.out.println("Resposta inv�lida");
				break;
			}
			if (tentativa == 2) {
				System.out.println("\nDica: Essa porta l�gica trabalha com a SOMA l�gica");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "B");
		System.out.println("Os pontos de vida s�o: "+vida+"\n");
	}
	
	//continuacao da historia
	System.out.print(" Quando respondeu corretamente, o c�rculo se abriu por completo e ele se arrastou adentro at� sair do outro lado. Tomou um pouco de �gua, respirou profundamente, \n"
			+ "e come�ou a corrida novamente. \n");
	
	//quarta escolha de direcao
	System.out.println("Para qual lado deseja seguir?");
	System.out.println("1 - direita");
	System.out.println("2 - Esquerda");
	direcao = entrada.nextInt();
	
	System.out.print("O medo era not�vel em sua face, mas "+nickname+" n�o parava, continuava avan�ando a cada segundo que passava, ent�o chegou em um corredor que havia 4 portas, \n"
			+ "na parede estava pichado �TESTE 4�, sem entender, pegou o aparelho que estava entre as duas portas do meio e uma outra mensagem de voz apareceu �Parab�ns "+nickname+",\n"
			+ "est�s indo bem por enquanto. Agora cada porta corresponde a uma das alternativas, apenas uma delas te dar� a oportunidade de continuar avan�ando em sua jornada, \n"
			+ "as outras tr�s ter� monstros que nunca foram derrotados antes, ent�o se errar, considere-se morto.�. A v�s se calou e a pergunta apareceu na tela. \n\n");
	
	// quarto questionario
	if(direcao==1) {
		
		System.out.println("�QUARTA PERGUNTA� \n");
		System.out.println("Quais s�o as letras que comp�em os numeros hexadecimais:");
		System.out.println("A- A,B,C e D");
		System.out.println("B- A,B,C,D e E");
		System.out.println("C- A,B,C,D,E e F");
		System.out.println("D- As primeiras 16 letras do alfabeto");
		System.out.println("E- O sistema hexadecimal n�o possuir letras");
		do {
			
			resposta = entrada.next().toUpperCase();
			switch(resposta) {
			case "A":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "B":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "C":
				System.out.println("Resposta correta \n");
				resposta = "C";
				System.out.println("As letras de A at� F comp�em os numeros hexadecimais que em decimal seriam representados de 10 a 15 ");
				break;
				
			case "D":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "E":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			default:
				System.out.println("Resposta inv�lida");
				break;
			}
			if (tentativa == 2) {
				System.out.println("\nDica: Os numeros hexadecimais tem base (16). Os n�meros presentes v�o at� o 9 e depois s�o compostos por letras em ordem alfabetica.");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "C");
		System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}
		else if(direcao == 2) {
			System.out.println("�QUARTA PERGUNTA� \n");
			System.out.println("Como fica o numero hexadecimal 12A em decimal:");
			System.out.println("A- 289");
			System.out.println("B- 290");
			System.out.println("C- 298");
			System.out.println("D- 297");
			System.out.println("E- 300");
			do {
				
				resposta = entrada.next().toUpperCase();
				switch(resposta) {
				case "A":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "B":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "C":
					System.out.println("Resposta correta \n");
					resposta = "C";
					System.out.println("Esse � o resultado da multiplica��o de cada digito do numero hexadecimal pela potencia 16 relativa a sua posi��o e a soma dos resultados");
					break;
					
				case "D":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "E":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				default:
					System.out.println("Resposta inv�lida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("\nDica: Para chegar ao resultado multiplique cada digito do numero hexadecimal pela potencia 16 relativa a sua posi��o e depois some os resultados");
					tentativa=0;
					}
				
				gameover(vida);
				
			}while(resposta != "C");
			System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}
	// continuacao da historia
	
	// teste sua sorte
	System.out.println("\n Voc� se deparou com um teste opcional que ir� testar sua sorte para ganhar ou perder pontos de vida. Deseja continuar?");
	System.out.println("1. SIM");
	System.out.println("2. N�O");
	teste = entrada.nextInt();
	if (teste == 1) {
		vida = testesorte(vida);
		}
	
	System.out.println("Quando respondeu, as portas continuaram intactas, n�o entendia o porqu�, mesmo se tivesse errado a resposta uma das portas abriria, ent�o olhou novamente para \n"
			+ "o aparelho e a mensagem de voz voltou �Ah, esquecemos de te avisar! Agora para cada passagem que ter� que ser aberta, duas perguntas ter�o que ser respondidas, \n"
			+ "se errar alguma, j� sabe! Ent�o a quinta pergunta apareceu na tela. \n ");
			
	//quinto questionario
	
	if (direcao == 2) {
		System.out.println("�QUINTA PERGUNTA� \n");
		System.out.println("Como fica o n�mero 3AF em decimal:");
		System.out.println("A- 942");
		System.out.println("B- 943");
		System.out.println("C- 944");
		System.out.println("D- 945");
		System.out.println("E- 946");
		do {
			
			resposta = entrada.next().toUpperCase();
			switch(resposta) {
			case "A":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "B":
				System.out.println("Resposta correta \n");
				resposta = "B";
				System.out.println("Esse � o resultado da multiplica��o de cada digito do numero hexadecimal pela potencia 16 relativa a sua posi��o e a soma dos resultados");
				break;
				
			case "C":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "D":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "E":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			default:
				System.out.println("Resposta inv�lida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: Para chegar ao resultado multiplique cada digito do numero hexadecimal pela potencia 16 relativa a sua posi��o e depois some os resultados");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "B");
		System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}
		else if (direcao == 1) {
			System.out.println("�QUINTA PERGUNTA� \n");
			System.out.println("Se 15 decimal � F em hexadecimal, como fica o numero 16:");
			System.out.println("A- 1A");
			System.out.println("B- 16");
			System.out.println("C- 10");
			System.out.println("D- A1");
			System.out.println("E- A6");
			do {
				
				resposta = entrada.next().toUpperCase();
				switch(resposta) {
				case "A":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "B":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "C":
					System.out.println("Resposta correta \n");
					resposta = "C";
					System.out.println("Esse � o resultado da multiplica��o de cada digito do numero hexadecimal pela potencia 16 relativa a sua posi��o e a soma dos resultados");
					break;
					
				case "D":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "E":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				default:
					System.out.println("Resposta inv�lida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("\nDica: Para chegar ao resultado deve se realizar a divis�o sucessiva do numero decimal por 16 (base do sistema hexadecimal).");
					System.out.println("O resultado ser� dado pelo ultimo quociente e o agupamento dos restos das divis�es.");
					tentativa=0;
					}
				
				gameover(vida);
				
			}while(resposta != "C");
			System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}		
	//continuacao da historia
			
	System.out.println("Depois que as respondeu, na tela do aparelho apareceu �Respostas corretas�, ent�o uma das portas se abriu e ele avan�ou pelo labirinto.\n");
			
	//quinta escolha de direcao
	System.out.println("Para qual lado deseja seguir?");
	System.out.println("1 - direita");
	System.out.println("2 - Esquerda");
	direcao = entrada.nextInt();
	
	System.out.println(" Sua velocidade j� estava se reduzindo, "+nickname+" se sentia um pouco cansado, parou, olhou no mapa o caminho, \n"
			+ "tomou um pouco de �gua e percebeu que suas mem�rias estavam voltando, conseguiu se lembrar da neve, da chuva e de sua casa, o que o deixou mais motivado,\n"
			+ "ent�o guardou o mapa, garrafa de �gua e partiu. /n");
	System.out.println(nickname+" se viu dentro de um t�nel com luzes um pouco fracas, tornando as coisas dif�ceis de serem vistas. Neste t�nel havia outra passagem, /n"
			+ "�TESTE 5� estava escrito na porta, e logo abaixo havia um bot�o. Ele pressionou este bot�o e ent�o o aparelho saiu de dentro da porta, pronto para ser usado. \n"
			+ nickname+" o pegou e a sexta pergunta apareceu. \n");
	
	//sexto questionario
	 
	 if(direcao == 2) {
	System.out.println("�SEXTA PERGUNTA�\n");
	System.out.println("Em um computador o n�mero 77(10) ser� representado na base bin�ria por: ");
	System.out.println("A- 1001111");
	System.out.println("B- 1010111");
	System.out.println("C- 1001101");
	System.out.println("D- 1001010");
	System.out.println("E- 1001001");
	do {
		
		resposta = entrada.next().toUpperCase();
		switch(resposta) {
		case "A":
			System.out.println("Resposta incorreta");
			tentativa++;
			vida--;
			break;
			
		case "B":
			System.out.println("Resposta incorreta");
			tentativa++;
			vida--;
			break;
			
		case "C":
			System.out.println("Resposta correta \n");
			resposta = "C";
			System.out.println("� o resultado da divis�o sucessiva do numero decimal por 2 (base do sistema bin�rio)");
			break;
			
		case "D":
			System.out.println("Resposta incorreta");
			tentativa++;
			vida--;
			break;
			
		case "E":
			System.out.println("Resposta incorreta");
			tentativa++;
			vida--;
			break;
			
		default:
			System.out.println("Resposta inv�lida");
			break;
		}
		
		if (tentativa == 2) {
			System.out.println("\nDica: Para chegar ao resultado deve se realizar a divis�o sucessiva do numero decimal por 2 (base do sistema bin�rio).");
			System.out.println("O resultado ser� dado pelo ultimo quociente e o agupamento dos restos das divis�es.");
			tentativa=0;
			}
		
		gameover(vida);
		
	}while(resposta != "C");
	System.out.println("Os pontos de vida s�o: "+vida+"\n");
	 }
	 
	 else if(direcao == 1) {
		
				System.out.println("�SEXTA PERGUNTA�\n");
				System.out.println("Em um computador o n�mero 104(10) ser� representado na base bin�ria por: ");
				System.out.println("A- 01101001");
				System.out.println("B- 01101000");
				System.out.println("C- 01101010");
				System.out.println("D- 01101011");
				System.out.println("E- 01011000");
				do {
					resposta = entrada.next().toUpperCase();
					switch(resposta) {
					case "A":
						System.out.println("Resposta incorreta");
						tentativa++;
						vida--;
						break;
						
					case "B":
						System.out.println("Resposta correta\n");
						resposta = "B";
						System.out.println("� o resultado da divis�o sucessiva do numero decimal por 2 (base do sistema bin�rio)");
						break;
						
					case "C":
						System.out.println("Resposta incorreta");
						tentativa++;
						vida--;
						break;
						
					case "D":
						System.out.println("Resposta incorreta");
						tentativa++;
						vida--;
						break;
						
					case "E":
						System.out.println("Resposta incorreta");
						tentativa++;
						vida--;
						break;
						
					default:
						System.out.println("Resposta inv�lida");
						break;
					}
					
					if (tentativa == 2) {
						System.out.println("\nDica: Para chegar ao resultado deve se realizar a divis�o sucessiva do numero decimal por 2 (base do sistema bin�rio).");
						System.out.println("O resultado ser� dado pelo ultimo quociente e o agupamento dos restos das divis�es.");
						tentativa=0;
						}
					
					gameover(vida);
					
				}while(resposta != "B");
				System.out.println("Os pontos de vida s�o: "+vida+"\n");
	 }
	// teste sua sorte
	 System.out.println("\n Voc� se deparou com um teste opcional que ir� testar sua sorte para ganhar ou perder pontos de vida. Deseja continuar?");
		System.out.println("1. SIM");
		System.out.println("2. N�O");
		teste = entrada.nextInt();
		if (teste == 1) {
			vida = testesorte(vida);
		}
		
	System.out.println("Respondeu-a e a s�tima apareceu logo em seguida. \n");
	
	//setimo questionario
	if(direcao == 1) {
		System.out.println("�SETIMA PERGUNTA�.\n");
		
		System.out.println("O n�mero correspondende a A2(16) em decimal �: ");
		System.out.println("A- 161");
		System.out.println("B- 162");
		System.out.println("C- 163");
		System.out.println("D- 164");
		System.out.println("E- 160");
		do {
			
			resposta = entrada.next().toUpperCase();
			switch(resposta) {
			case "A":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "B":
				System.out.println("Resposta correta \n");
				resposta = "B";
				System.out.println("� o resultado da multiplica��o cada digito do numero hexadecimal pela potencia 16 relativa a sua posi��o e a soma dos resultados");
				break;
				
			case "C":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "D":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "E":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			default:
				System.out.println("Resposta inv�lida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: Para chegar ao resultado multiplique cada digito do numero hexadecimal pela potencia 16 relativa a sua posi��o e depois some os resultados");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "B");
		System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}
		
		else if (direcao == 2) {
			System.out.println("�SETIMA PERGUNTA�.\n");
			
			System.out.println("O n�mero correspondende a F0CA(16) em decimal �: ");
			System.out.println("A- 61624");
			System.out.println("B- 61643");
			System.out.println("C- 61644");
			System.out.println("D- 61202");
			System.out.println("E- 64192");
			do {
				
				resposta = entrada.next().toUpperCase();
				switch(resposta) {
				case "A":
					System.out.println("Resposta correta \n");
					resposta = "A";
					System.out.println("� o resultado da multiplica��o cada digito do numero hexadecimal pela potencia 16 relativa a sua posi��o e a soma dos resultados");
					break;
					
				case "B":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "C":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "D":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "E":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				default:
					System.out.println("Resposta inv�lida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("\nDica: Para chegar ao resultado multiplique cada digito do numero hexadecimal pela potencia 16 relativa a sua posi��o e depois some os resultados");
					tentativa=0;
					}
				
				gameover(vida);
				
			}while(resposta != "A");
			System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}
	//continuacao da historia
	System.out.print(" Quando "+nickname+" as respondeu, ficou se perguntando se tinha as acertado, e ent�o a porta se abriu. "+nickname+" atravessou a porta e rapidamente \n"
			+ "um flash de lembran�as o atingiu em cheio, deixando-o atordoado e com uma dor de cabe�a insuport�vel. N�o sabia o que estava acontecendo. \n"
			+ "Se deitou no ch�o e do nada veio uma v�s que ecoava por todos os lados, era a voz de uma mulher, ela dizia, �Realmente est� me surpreendendo, "+nickname+".\n"
			+ " Das 114 pessoas que j� tentaram, voc� foi o que mais chegou longe. Estou come�ando a acreditar que voc� possa conseguir. Se conseguir salvar� a vida de tantas pessoas...�,\n"
			+ "a v�s cessou, "+nickname+" se levantou, sabia que sua mem�ria estava voltando pouco a pouco, olhou para sua frente, e seguiu. \n");
	
	//sexta escolha de direcao
	System.out.println("Para qual lado deseja seguir?");
	System.out.println("1 - direita");
	System.out.println("2 - Esquerda");
	direcao = entrada.nextInt();
	
	System.out.println(" Ap�s caminhar por muito tempo chegou. O lugar era maravilhoso, parecia uma pequena vila, tinha vegeta��es, uma fonte sem �gua no centro, est�tuas que ele acreditava \n"
			+ "que era de alguns deuses, e uma porta vermelho-sangue que era imposs�vel n�o ser notada. Thomas correu at� ela, tinha as marca��es grifadas na porta �TESTE 6� e �Cruel � bom!�,\n"
			+ "n�o sabia o que aquilo significava, mas pressionou o bot�o e, ao inv�s de sair um aparelho semelhante a um ipad, na pr�pria porta apareceu um televisor com as perguntas oitava e nona. \n");
	
	////oitavo questionario
	if(direcao == 1) {
		System.out.println("�OITAVA PERGUNTA�.\n");
		
		System.out.println("Qual n�mero corresponde ao n�mero 100(10) em octal");
		System.out.println("A- 141");
		System.out.println("B- 142");
		System.out.println("C- 143");
		System.out.println("D- 144");
		System.out.println("E- 145");
		do {
			
			resposta = entrada.next().toUpperCase();
			switch(resposta) {
			case "A":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "B":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "C":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "D":
				System.out.println("Resposta correta\n");
				resposta = "D";
				System.out.println("� o resultado da divis�o sucessiva do numero decimal por 8 (base do sistema octal");
				break;
				
			case "E":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			default:
				System.out.println("Resposta inv�lida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: Para converter um n�mero decimal em octal deve se realizar a divis�o sucessiva do numero decimal por 8 (base do sistema octal).");
				System.out.println("O resultado ser� dado pelo ultimo quociente e o agupamento dos restos das divis�es.");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "D");
		System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}
		else if(direcao == 2) {
			System.out.println("�OITAVA PERGUNTA�.\n");
			
			System.out.println("Qual n�mero corresponde ao n�mero 567(10) em octal");
			System.out.println("A- 1063");
			System.out.println("B- 1065");
			System.out.println("C- 1066");
			System.out.println("D- 1067");
			System.out.println("E- 1064");
			do {
				
				resposta = entrada.next().toUpperCase();
				switch(resposta) {
				case "A":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "B":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "C":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "D":
					System.out.println("Resposta correta\n");
					resposta = "D";
					System.out.println("� o resultado da divis�o sucessiva do numero decimal por 8 (base do sistema octal");
					break;
					
				case "E":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				default:
					System.out.println("Resposta inv�lida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("\nDica: Para converter um n�mero decimal em octal deve se realizar a divis�o sucessiva do numero decimal por 8 (base do sistema octal).");
					System.out.println("O resultado ser� dado pelo ultimo quociente e o agupamento dos restos das divis�es.");
					tentativa=0;
					}
				
				gameover(vida);
			}while(resposta != "D");
			System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}
	// teste sua sorte
	System.out.println("\n Voc� se deparou com um teste opcional que ir� testar sua sorte para ganhar ou perder pontos de vida. Deseja continuar?");
	System.out.println("1. SIM");
	System.out.println("2. N�O");
	teste = entrada.nextInt();
	if (teste == 1) {
		
		vida = testesorte(vida);
		
	}
	
	// nono questionario
	if(direcao == 2) {
		System.out.println("�NONA PERGUNTA�.\n");
		
		System.out.println("Qual n�mero em octal corresponde ao n�mero b�nario 11001: ");
		System.out.println("A- 30");
		System.out.println("B- 31");
		System.out.println("C- 32");
		System.out.println("D- 33");
		System.out.println("E- 34");
		do {
			
			resposta = entrada.next().toUpperCase();
			switch(resposta) {
			case "A":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "B":
				System.out.println("Resposta correta\n");
				resposta = "B";
				System.out.println("� o resultado da convers�o d�gito a d�gito de octal para bin�rio, da direita para a esquerda");
				break;
				
			case "C":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "D":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "E":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			default:
				System.out.println("Resposta inv�lida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: A convers�o de octal para bin�rio � feita convertendo d�gito a d�gito de octal para bin�rio, da direita para a esquerda.");
				System.out.println("Cada digito � convertido para um grupo de 3bits em bin�rio.");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta !="B");
		System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}
		else if (direcao == 1) {
			System.out.println("�NONA PERGUNTA�.\n");
			
			System.out.println("Qual n�mero em octal corresponde ao n�mero b�nario 1010010: ");
			System.out.println("A- 120");
			System.out.println("B- 121");
			System.out.println("C- 122");
			System.out.println("D- 123");
			System.out.println("E- 124");
			do {
				
				resposta = entrada.next().toUpperCase();
				switch(resposta) {
				case "A":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "B":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "C":
					System.out.println("Resposta correta\n");
					resposta = "C";
					System.out.println("� o resultado da convers�o d�gito a d�gito de octal para bin�rio, da direita para a esquerda");
					break;
					
				case "D":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "E":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				default:
					System.out.println("Resposta inv�lida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("\nDica: A convers�o de octal para bin�rio � feita convertendo d�gito a d�gito de octal para bin�rio, da direita para a esquerda.");
					System.out.println("Cada digito � convertido para um grupo de 3bits em bin�rio.");
					tentativa=0;
					}
				
				gameover(vida);
				
			}while(resposta !="C");
			System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}
	
	//continuacao da historia
	System.out.println(" Ao lado do televisor havia um pequeno microfone, tomas o colocou na orelha e ouviu. �Extraordin�rio!� Dizia a voz �Voc� j� est� prestes a sair deste labirinto, \n"
			+ "apenas mais um acerto e voc� poder� ir para casa com todas as suas mem�rias restauradas. A �ltima pergunta se encontra a 100 metros desta porta, acerte-a e venha at� n�s.\n"
			+ " E jamais esque�a, Cruel � bom!� \n");
	System.out.println("A porta se abriu e "+nickname+" estava � beira de um precip�cio, conseguia ver a �ltima porta do outro lado,\n"
			+ "mas para chegar at� l� teria que atravessar uma ponte feita de corda e madeira, que parecia ter mil anos de idade. "+nickname+" suspirou, meio ofegante e deu o primeiro passo na ponte.\n"
			+ " A madeira rugia, um vento forte o ricocheteava de lado, mas ele n�o parou, passo a passo ele conseguiu atravessar a ponte e se livrar do penhasco,\n"
			+ "mas quando olhou para lugar de que tinha vindo, um enorme ser que parecia com uma aranha de 2 metros, com pernas de ferro e olhos vermelhos estava parada o olhando. \n"
			+ " Em disparada ela come�ou a correr em dire��o a ele, rapidamente "+nickname+" teve a brilhante ideia de desamarrar as cordas da ponte para que o monstro ca�sse na escurid�o do abismo. \n"
			+ "Ele come�ou, desamarrou a primeira corda e a ponte tombou para o lado, mas isso n�o parecia ser um problema para a aranha, pois ela continuou avan�ando na mesma velocidade. \n"
			+ "Quando faltava menos de dois metros para a aranha alcan�ar o outro lado, "+nickname+" soltou a outra corda e tanto a ponte quanto esse monstro horrendo despencaram para a morte. \n"
			+ nickname+" estava completamente assustado, suava, mas se obrigou a manter o controle. Virou-se para a porta que era a �nica coisa que o separava de sua liberdade, \n"
			+ "pegou o aparelho que estava ao lado e come�ou ler a d�cima pergunta.\n");
	
	// decimo questionario
	if (direcao == 1) {
		System.out.println("�DECIMA PERGUNTA� \n");
		System.out.println("O n�mero que correspondende ao n�mero 52(16) em decimal �: ");
		System.out.println("A- 78");
		System.out.println("B- 80");
		System.out.println("C- 79");
		System.out.println("D- 81");
		System.out.println("E- 82");
		do {
			
			resposta = entrada.next().toUpperCase();
			switch(resposta) {
			case "A":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "B":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "C":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "D":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			case "E":
				System.out.println("Resposta correta \n");
				resposta = "E";
				System.out.println("� o resultado da multiplica��o de cada digito do numero hexadecimal pela potencia 16 relativa a sua posi��o e a soma dos resultados");
				break;
				
			default:
				System.out.println("Resposta inv�lida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: Para chegar ao resultado multiplique cada digito do numero hexadecimal pela potencia 16 relativa a sua posi��o e depois some os resultados");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "E");
		System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}
		else if(direcao == 1) {
			System.out.println("�DECIMA PERGUNTA� \n");
			System.out.println("O n�mero que correspondende ao n�mero 84(16) em decimal �: ");
			System.out.println("A- 129");
			System.out.println("B- 130");
			System.out.println("C- 131");
			System.out.println("D- 132");
			System.out.println("E- 133");
			do {
				
				resposta = entrada.next().toUpperCase();
				switch(resposta) {
				case "A":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "B":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "C":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				case "D":
					System.out.println("Resposta correta\n");
					resposta = "D";
					System.out.println("� o resultado da multiplica��o de cada digito do numero hexadecimal pela potencia 16 relativa a sua posi��o e a soma dos resultados");
					break;
				case "E":
					
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				default:
					System.out.println("Resposta inv�lida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("\nDica: Para chegar ao resultado multiplique cada digito do numero hexadecimal pela potencia 16 relativa a sua posi��o e depois some os resultados");
					tentativa=0;
					}
				
				gameover(vida);
				
			}while(resposta != "D");
			System.out.println("Os pontos de vida s�o: "+vida+"\n");
		}
	
	// continuacao da historia
	System.out.println(nickname+" respondeu e a porta se abriu de imediato. Atr�s da porta havia dezenas de pessoas o olhando como se ele tivesse vindo de outro planeta, "+nickname+" se sentiu desconfort�vel,\n"
			+ "e ent�o uma mulher com apar�ncia de uns 40 anos se aproximou de "+nickname+" e disse para ele n�o se preocupar, pois daria todas as respostas para ele agora. \n"
			+ "Ambos se sentaram em cadeiras confort�veis e ela come�ou. "+nickname+", voc� ficou dormindo por 12 anos desde que foi capturado por um de nossos agentes, no ano de 2063, que foi a 10 anos atr�s,\n"
			+ "houve uma forte epidemia que ficou conhecida como Covid-63, esta epidemia apodrecia o c�rebro dos infectados em menos de 6 meses.\n"
			+ " Voc� foi o escolhido por n�s para concluir este teste porque sab�amos que se voc� o conclu�sse com sucesso, seu c�rebro geraria uma subst�ncia que seria a chave principal para esta epidemia.\n"
			+ " Nossa organiza��o se chama Cruel, e nosso maior objetivo � fazer o melhor para a humanidade "+nickname+" sentiu muita raiva de tudo aquilo, mas no fim compreendeu que era para o bem da humanidade.\n"
			+ " Retiraram a substancia do c�rebro de "+nickname+" e ofereceu recursos para que ele pudesse viver bem e em seguran�a.\n"
			+ "3 anos depois esta doen�a tinha sido extinta e a humanidade venceu um novo desafio.\n\n");
	
	System.out.println("OBRIGADO POR JOGAR");
}
}