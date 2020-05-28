package MazeCodePackage;
import java.util.Scanner;
import java.util.Random;
public class MazeCode {
	
	// metodo game over
	public static void gameover(int vida) {
		if(vida<=0) {
			System.out.println("Os pontos de vida são: "+vida+"\n");
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
			System.out.println("A seus pontos de vida atuais são: "+vida+"\n");
			
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
	 
	 System.out.println("\n Em um lindo dia ensolarado," +nickname+" estava a caminho de sua casa, quando a última coisa que conseguiu ver foi um saco preto sendo colocado rapidamente em sua cabeça,"
		+ " \nsentiu uma picada de agulha em seu braço esquerdo, que logo após o apagou.\n");
	 
	 
	 System.out.println(" Algum tempo depois...");
	 System.out.println("Acordou assustado, estava em uma sala com uma pequena janela onde só podia ver muros pelo lado de fora,não sabia onde estava, \n"
	 	+ "não se lembrava de nada do que tinha acontecido, nem mesmo de sua vida antiga, apenas de seu primeiro nome, "+nickname+".");
	 
	 
	 System.out.println(" Desesperado, olhou por todos os lados da sala, onde conseguiu localizar apenas uma folha de papel com alguma mensagem, então correu em sua direção e a leu. \n "
	 	+ "\n Olá "+nickname+", se está lendo esta mensagem é por que tudo está ocorrendo como planejado. Você foi o escolhido para desvendar o maior mistério já criado por nós.\n"
	 	+ "O seu cérebro funciona de modo diferente dos demais, de modo extraordinário, que, se conseguir passar por todos os testes sem a ajuda de ninguém, \n"
	 	+ "terá algo único que nenhum dinheiro do mundo possa comprar.\n Sei que está sofrendo uma onda de frustração neste momento, mas terá suas respostas assim que for avançando,"
	 	+ "então dê o seu melhor neste desafio, e lembre-se, \n"
	 	+ "Cruel é bom! ");
	 
	 
	 System.out.println("\n  Depois de ler esta mensagem, ficou ciente de que havia uma jornada difícil a sua frente. Saiu da pequena sala e encontrou uma caixa com itens preparatórios,\n"
	 	+ "como tênis de corrida, uma garrafa de água, e um grande mapa, que só de olhar já dava para entender que tudo aquilo fazia parte de um labirinto,\n"
	 	+ "não queria ficar parado ali refletindo o que estava acontecendo, apenas queria sair daquele lugar o mais rápido possível, então se levantou, certificou-se do caminho \n"
	 	+ "que deveria seguir no mapa e começou a correr. \n");
	 		
	 // primeira escolha de direcao
	 System.out.println("Para qual lado deseja seguir?");
	 System.out.println("1 - direita");
	 System.out.println("2 - Esquerda");
	 direcao = entrada.nextInt();
	 
	 System.out.print(" Depois de 40 minutos correndo, entrando em corredores atrás de corredores, e ouvindo barulhos esquisitos, ficou à frente de uma longa porta de puro aço, \n"
		+ "onde estava escrito “TESTE 1”, e logo ao lado tinha uma caixinha com um aparelho semelhante à um ipad dentro, "+nickname+" o pegou e uma mensagem de áudio começou \n"
		+ "a ser reproduzida “Estes testes consistem em 10 perguntas, cada uma com 4 alternativas, se acertar todas estará livre deste labirinto, senão, virará comida de verdugos, \n\n");
	 
	 
	 // primeiro questionario
	 
	 if(direcao == 2) {
			System.out.println("“PRIMEIRA PERGUNTA”. \n");
			System.out.println("O que são números binários: ");
			System.out.println("A- Base numerica de dois algarismos 0 e 1");
			System.out.println("B- Numeros que se multiplicam por 2");
			System.out.println("C- Numeros pares");
			System.out.println("D- Numeros primos");
			System.out.println("E- Numeros que são multiplos de 2");
			do {
				
				resposta = entrada.next().toUpperCase();
				switch(resposta) {
				case "A":
					System.out.println("Resposta correta \n");
					resposta = "A";
					System.out.println("A base do sistema binário é 2 então só pode ser composta por 0 e 1");
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
					System.out.println("Resposta inválida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("Dica: Os números binários são compostos por 0 e 1");
					tentativa=0;
				}
				
				gameover(vida);
				
			}while(resposta != "A");
			System.out.println("Os pontos de vida são: "+vida+"\n");
			
			}
			else if(direcao == 1) {
				System.out.println("“PRIMEIRA PERGUNTA”. \n");
				System.out.println("Qual numero decimal é representado pelo numero binário 11: ");
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
						System.out.println("O número 11 pode ser representado como 10(2) + 01(2) em base binário por isso o resultado 3");
						break;
						
					case "E":
						System.out.println("Resposta incorreta");
						tentativa++;
						vida--;
						break;
						
					default:
						System.out.println("Resposta inválida");
						break;
					}
					if (tentativa == 2) {
						System.out.println("\nDica: Para chegar ao resultado deve ser somado cada bit binário pela potencia de sua posição e depois somar os resultados");
						tentativa=0;
						}
					
					gameover(vida);
					
				}while(resposta != "D");
				System.out.println("Os pontos de vida são: "+vida+"\n");
			}
	 
	//continuacao da historia
	
	System.out.println("Acertando então a resposta, a porta à sua frente se abriu e "+nickname+" continuou avançando entre as altas paredes de aço e cimento");
	
	// segunda escolha de direcao
	System.out.println("Para qual lado deseja seguir?");
	System.out.println("1 - direita");
	System.out.println("2 - Esquerda");
	direcao = entrada.nextInt();
	
	System.out.println("Após caminhar por alguns minutos chegando então em uma porta totalmente idêntica à primeira, mas moldado neste estava escrito “TESTE 2”\n\n"
			+ nickname +" pegou o aparelho ao lado e a pergunta apareceu na tela. \n");
	
	// segundo questionario
	if (direcao == 2) {	
		System.out.println("“SEGUNDA PERGUNTA” \n");
		System.out.println("O que são portas lógicas e circuitos lógicos: ");
		System.out.println("A- São portas inteligentes");
		System.out.println("B- São circuitos que operam e trabalham com um ou mais sinais lógicos de entrada para produzir uma e somente uma saída");
		System.out.println("C- Uma linguagem de programação obsoleta, usada para programar maquinas mais antigas");
		System.out.println("D- São portas de ligação para se conectar a uma rede");
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
				System.out.println("Portas lógicas servem para operar um sistema com apenas uma saida, exempo: ligar e desligar o interruptor de uma lampada");
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
				System.out.println("Resposta inválida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: Possuem entradas e saída");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "B");
		System.out.println("Os pontos de vida são: "+vida+"\n");
		}
		else if(direcao == 1) {
			System.out.println("“SEGUNDA PERGUNTA” \n");
			System.out.println("Quais são os tipos de portas lógicas ");
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
					System.out.println("Esses são os nomes dados as portas lógicas para definir a operação usada para chegar a saída do circuito");
					break;
					
				default:
					System.out.println("Resposta inválida");
					break;
				}
				if (tentativa == 2) {
					System.out.println("\nDica: leia o nome de cada porta lógica com atenção e fique atento aos detalhes");
					tentativa=0;
					}
				
				gameover(vida);
				
			}while(resposta != "E");
			System.out.println("Os pontos de vida são: "+vida+"\n");
		}
	// teste sua sorte
		System.out.println(" Você se deparou com um teste opcional que irá testar sua sorte para ganhar ou perder pontos de vida. Deseja continuar?");
		System.out.println("1. SIM");
		System.out.println("2. NÃO");
		teste = entrada.nextInt();
		if (teste == 1) {
			vida = testesorte(vida);
		}
	//continuacao da historia
	System.out.println("Continuou avançando, desta vez os barulhos esquisitos que vinha ouvindo no caminho parecia estar ficando cada vez mais próximos, o que o deixou um pouco aflito. \n");
	
	// terceira escolha de direcao
	System.out.println("Para qual lado deseja seguir?");
	System.out.println("1 - direita");
	System.out.println("2 - Esquerda");
	direcao = entrada.nextInt();
	
	System.out.println("Mas depois de correr cerca de 30 minutos chegou em um corredor sem saída, apenas com um círculo com cerca de 1 metro de diâmetro, nele escrito “TESTE 3”, \n"
		+ "que poderia ser uma passagem, desta vez não havia nenhum aparelho para que ele pudesse responder ao teste 3, procurou em todos os cantos e não conseguiu encontrar absolutamente nada,\n"
		+ "a única coisa que tinha notado é que em todas as paredes estava escrito “Cruel é bom!”, ele a leu em vós alta e automaticamente abriu apenas uma pequena parte do círculo, \n"
		+ "revelando então a caixa com o aparelho. "
		+ nickname + " o pegou e a pergunta apareceu. \n");
	
	// terceiro questionario

	if (direcao==1) {
		System.out.println("“TERCEIRA PERGUNTA” \n");
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
				System.out.println("A porta E(and) é representada por * para sinalizar que se ouver apenas uma porta 1 a saída ainda será 0");
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
				System.out.println("Resposta inválida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: Para que a saída dessa porta seja 1 deve se MULTIPLICAR todas as entradas");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "B");
		System.out.println("Os pontos de vida são: "+vida+"\n");
	}
	else if(direcao == 2) {
		System.out.println("“TERCEIRA PERGUNTA” \n");
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
				System.out.println("A porta OU(OR) é representada por + para sinalizar que se ouver qualquer porta 1 a saída sera 1");
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
				System.out.println("Resposta inválida");
				break;
			}
			if (tentativa == 2) {
				System.out.println("\nDica: Essa porta lógica trabalha com a SOMA lógica");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "B");
		System.out.println("Os pontos de vida são: "+vida+"\n");
	}
	
	//continuacao da historia
	System.out.print(" Quando respondeu corretamente, o círculo se abriu por completo e ele se arrastou adentro até sair do outro lado. Tomou um pouco de água, respirou profundamente, \n"
			+ "e começou a corrida novamente. \n");
	
	//quarta escolha de direcao
	System.out.println("Para qual lado deseja seguir?");
	System.out.println("1 - direita");
	System.out.println("2 - Esquerda");
	direcao = entrada.nextInt();
	
	System.out.print("O medo era notável em sua face, mas "+nickname+" não parava, continuava avançando a cada segundo que passava, então chegou em um corredor que havia 4 portas, \n"
			+ "na parede estava pichado “TESTE 4”, sem entender, pegou o aparelho que estava entre as duas portas do meio e uma outra mensagem de voz apareceu “Parabéns "+nickname+",\n"
			+ "estás indo bem por enquanto. Agora cada porta corresponde a uma das alternativas, apenas uma delas te dará a oportunidade de continuar avançando em sua jornada, \n"
			+ "as outras três terá monstros que nunca foram derrotados antes, então se errar, considere-se morto.”. A vós se calou e a pergunta apareceu na tela. \n\n");
	
	// quarto questionario
	if(direcao==1) {
		
		System.out.println("“QUARTA PERGUNTA” \n");
		System.out.println("Quais são as letras que compõem os numeros hexadecimais:");
		System.out.println("A- A,B,C e D");
		System.out.println("B- A,B,C,D e E");
		System.out.println("C- A,B,C,D,E e F");
		System.out.println("D- As primeiras 16 letras do alfabeto");
		System.out.println("E- O sistema hexadecimal não possuir letras");
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
				System.out.println("As letras de A até F compõem os numeros hexadecimais que em decimal seriam representados de 10 a 15 ");
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
				System.out.println("Resposta inválida");
				break;
			}
			if (tentativa == 2) {
				System.out.println("\nDica: Os numeros hexadecimais tem base (16). Os números presentes vão até o 9 e depois são compostos por letras em ordem alfabetica.");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "C");
		System.out.println("Os pontos de vida são: "+vida+"\n");
		}
		else if(direcao == 2) {
			System.out.println("“QUARTA PERGUNTA” \n");
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
					System.out.println("Esse é o resultado da multiplicação de cada digito do numero hexadecimal pela potencia 16 relativa a sua posição e a soma dos resultados");
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
					System.out.println("Resposta inválida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("\nDica: Para chegar ao resultado multiplique cada digito do numero hexadecimal pela potencia 16 relativa a sua posição e depois some os resultados");
					tentativa=0;
					}
				
				gameover(vida);
				
			}while(resposta != "C");
			System.out.println("Os pontos de vida são: "+vida+"\n");
		}
	// continuacao da historia
	
	// teste sua sorte
	System.out.println("\n Você se deparou com um teste opcional que irá testar sua sorte para ganhar ou perder pontos de vida. Deseja continuar?");
	System.out.println("1. SIM");
	System.out.println("2. NÃO");
	teste = entrada.nextInt();
	if (teste == 1) {
		vida = testesorte(vida);
		}
	
	System.out.println("Quando respondeu, as portas continuaram intactas, não entendia o porquê, mesmo se tivesse errado a resposta uma das portas abriria, então olhou novamente para \n"
			+ "o aparelho e a mensagem de voz voltou “Ah, esquecemos de te avisar! Agora para cada passagem que terá que ser aberta, duas perguntas terão que ser respondidas, \n"
			+ "se errar alguma, já sabe! Então a quinta pergunta apareceu na tela. \n ");
			
	//quinto questionario
	
	if (direcao == 2) {
		System.out.println("“QUINTA PERGUNTA” \n");
		System.out.println("Como fica o número 3AF em decimal:");
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
				System.out.println("Esse é o resultado da multiplicação de cada digito do numero hexadecimal pela potencia 16 relativa a sua posição e a soma dos resultados");
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
				System.out.println("Resposta inválida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: Para chegar ao resultado multiplique cada digito do numero hexadecimal pela potencia 16 relativa a sua posição e depois some os resultados");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "B");
		System.out.println("Os pontos de vida são: "+vida+"\n");
		}
		else if (direcao == 1) {
			System.out.println("“QUINTA PERGUNTA” \n");
			System.out.println("Se 15 decimal é F em hexadecimal, como fica o numero 16:");
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
					System.out.println("Esse é o resultado da multiplicação de cada digito do numero hexadecimal pela potencia 16 relativa a sua posição e a soma dos resultados");
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
					System.out.println("Resposta inválida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("\nDica: Para chegar ao resultado deve se realizar a divisão sucessiva do numero decimal por 16 (base do sistema hexadecimal).");
					System.out.println("O resultado será dado pelo ultimo quociente e o agupamento dos restos das divisões.");
					tentativa=0;
					}
				
				gameover(vida);
				
			}while(resposta != "C");
			System.out.println("Os pontos de vida são: "+vida+"\n");
		}		
	//continuacao da historia
			
	System.out.println("Depois que as respondeu, na tela do aparelho apareceu “Respostas corretas”, então uma das portas se abriu e ele avançou pelo labirinto.\n");
			
	//quinta escolha de direcao
	System.out.println("Para qual lado deseja seguir?");
	System.out.println("1 - direita");
	System.out.println("2 - Esquerda");
	direcao = entrada.nextInt();
	
	System.out.println(" Sua velocidade já estava se reduzindo, "+nickname+" se sentia um pouco cansado, parou, olhou no mapa o caminho, \n"
			+ "tomou um pouco de água e percebeu que suas memórias estavam voltando, conseguiu se lembrar da neve, da chuva e de sua casa, o que o deixou mais motivado,\n"
			+ "então guardou o mapa, garrafa de água e partiu. /n");
	System.out.println(nickname+" se viu dentro de um túnel com luzes um pouco fracas, tornando as coisas difíceis de serem vistas. Neste túnel havia outra passagem, /n"
			+ "“TESTE 5” estava escrito na porta, e logo abaixo havia um botão. Ele pressionou este botão e então o aparelho saiu de dentro da porta, pronto para ser usado. \n"
			+ nickname+" o pegou e a sexta pergunta apareceu. \n");
	
	//sexto questionario
	 
	 if(direcao == 2) {
	System.out.println("“SEXTA PERGUNTA”\n");
	System.out.println("Em um computador o número 77(10) será representado na base binária por: ");
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
			System.out.println("É o resultado da divisão sucessiva do numero decimal por 2 (base do sistema binário)");
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
			System.out.println("Resposta inválida");
			break;
		}
		
		if (tentativa == 2) {
			System.out.println("\nDica: Para chegar ao resultado deve se realizar a divisão sucessiva do numero decimal por 2 (base do sistema binário).");
			System.out.println("O resultado será dado pelo ultimo quociente e o agupamento dos restos das divisões.");
			tentativa=0;
			}
		
		gameover(vida);
		
	}while(resposta != "C");
	System.out.println("Os pontos de vida são: "+vida+"\n");
	 }
	 
	 else if(direcao == 1) {
		
				System.out.println("“SEXTA PERGUNTA”\n");
				System.out.println("Em um computador o número 104(10) será representado na base binária por: ");
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
						System.out.println("É o resultado da divisão sucessiva do numero decimal por 2 (base do sistema binário)");
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
						System.out.println("Resposta inválida");
						break;
					}
					
					if (tentativa == 2) {
						System.out.println("\nDica: Para chegar ao resultado deve se realizar a divisão sucessiva do numero decimal por 2 (base do sistema binário).");
						System.out.println("O resultado será dado pelo ultimo quociente e o agupamento dos restos das divisões.");
						tentativa=0;
						}
					
					gameover(vida);
					
				}while(resposta != "B");
				System.out.println("Os pontos de vida são: "+vida+"\n");
	 }
	// teste sua sorte
	 System.out.println("\n Você se deparou com um teste opcional que irá testar sua sorte para ganhar ou perder pontos de vida. Deseja continuar?");
		System.out.println("1. SIM");
		System.out.println("2. NÃO");
		teste = entrada.nextInt();
		if (teste == 1) {
			vida = testesorte(vida);
		}
		
	System.out.println("Respondeu-a e a sétima apareceu logo em seguida. \n");
	
	//setimo questionario
	if(direcao == 1) {
		System.out.println("“SETIMA PERGUNTA”.\n");
		
		System.out.println("O número correspondende a A2(16) em decimal é: ");
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
				System.out.println("É o resultado da multiplicação cada digito do numero hexadecimal pela potencia 16 relativa a sua posição e a soma dos resultados");
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
				System.out.println("Resposta inválida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: Para chegar ao resultado multiplique cada digito do numero hexadecimal pela potencia 16 relativa a sua posição e depois some os resultados");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "B");
		System.out.println("Os pontos de vida são: "+vida+"\n");
		}
		
		else if (direcao == 2) {
			System.out.println("“SETIMA PERGUNTA”.\n");
			
			System.out.println("O número correspondende a F0CA(16) em decimal é: ");
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
					System.out.println("É o resultado da multiplicação cada digito do numero hexadecimal pela potencia 16 relativa a sua posição e a soma dos resultados");
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
					System.out.println("Resposta inválida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("\nDica: Para chegar ao resultado multiplique cada digito do numero hexadecimal pela potencia 16 relativa a sua posição e depois some os resultados");
					tentativa=0;
					}
				
				gameover(vida);
				
			}while(resposta != "A");
			System.out.println("Os pontos de vida são: "+vida+"\n");
		}
	//continuacao da historia
	System.out.print(" Quando "+nickname+" as respondeu, ficou se perguntando se tinha as acertado, e então a porta se abriu. "+nickname+" atravessou a porta e rapidamente \n"
			+ "um flash de lembranças o atingiu em cheio, deixando-o atordoado e com uma dor de cabeça insuportável. Não sabia o que estava acontecendo. \n"
			+ "Se deitou no chão e do nada veio uma vós que ecoava por todos os lados, era a voz de uma mulher, ela dizia, “Realmente está me surpreendendo, "+nickname+".\n"
			+ " Das 114 pessoas que já tentaram, você foi o que mais chegou longe. Estou começando a acreditar que você possa conseguir. Se conseguir salvará a vida de tantas pessoas...”,\n"
			+ "a vós cessou, "+nickname+" se levantou, sabia que sua memória estava voltando pouco a pouco, olhou para sua frente, e seguiu. \n");
	
	//sexta escolha de direcao
	System.out.println("Para qual lado deseja seguir?");
	System.out.println("1 - direita");
	System.out.println("2 - Esquerda");
	direcao = entrada.nextInt();
	
	System.out.println(" Após caminhar por muito tempo chegou. O lugar era maravilhoso, parecia uma pequena vila, tinha vegetações, uma fonte sem água no centro, estátuas que ele acreditava \n"
			+ "que era de alguns deuses, e uma porta vermelho-sangue que era impossível não ser notada. Thomas correu até ela, tinha as marcações grifadas na porta “TESTE 6” e “Cruel é bom!”,\n"
			+ "não sabia o que aquilo significava, mas pressionou o botão e, ao invés de sair um aparelho semelhante a um ipad, na própria porta apareceu um televisor com as perguntas oitava e nona. \n");
	
	////oitavo questionario
	if(direcao == 1) {
		System.out.println("“OITAVA PERGUNTA”.\n");
		
		System.out.println("Qual número corresponde ao número 100(10) em octal");
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
				System.out.println("É o resultado da divisão sucessiva do numero decimal por 8 (base do sistema octal");
				break;
				
			case "E":
				System.out.println("Resposta incorreta");
				tentativa++;
				vida--;
				break;
				
			default:
				System.out.println("Resposta inválida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: Para converter um número decimal em octal deve se realizar a divisão sucessiva do numero decimal por 8 (base do sistema octal).");
				System.out.println("O resultado será dado pelo ultimo quociente e o agupamento dos restos das divisões.");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "D");
		System.out.println("Os pontos de vida são: "+vida+"\n");
		}
		else if(direcao == 2) {
			System.out.println("“OITAVA PERGUNTA”.\n");
			
			System.out.println("Qual número corresponde ao número 567(10) em octal");
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
					System.out.println("É o resultado da divisão sucessiva do numero decimal por 8 (base do sistema octal");
					break;
					
				case "E":
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				default:
					System.out.println("Resposta inválida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("\nDica: Para converter um número decimal em octal deve se realizar a divisão sucessiva do numero decimal por 8 (base do sistema octal).");
					System.out.println("O resultado será dado pelo ultimo quociente e o agupamento dos restos das divisões.");
					tentativa=0;
					}
				
				gameover(vida);
			}while(resposta != "D");
			System.out.println("Os pontos de vida são: "+vida+"\n");
		}
	// teste sua sorte
	System.out.println("\n Você se deparou com um teste opcional que irá testar sua sorte para ganhar ou perder pontos de vida. Deseja continuar?");
	System.out.println("1. SIM");
	System.out.println("2. NÃO");
	teste = entrada.nextInt();
	if (teste == 1) {
		
		vida = testesorte(vida);
		
	}
	
	// nono questionario
	if(direcao == 2) {
		System.out.println("“NONA PERGUNTA”.\n");
		
		System.out.println("Qual número em octal corresponde ao número bínario 11001: ");
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
				System.out.println("É o resultado da conversão dígito a dígito de octal para binário, da direita para a esquerda");
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
				System.out.println("Resposta inválida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: A conversão de octal para binário é feita convertendo dígito a dígito de octal para binário, da direita para a esquerda.");
				System.out.println("Cada digito é convertido para um grupo de 3bits em binário.");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta !="B");
		System.out.println("Os pontos de vida são: "+vida+"\n");
		}
		else if (direcao == 1) {
			System.out.println("“NONA PERGUNTA”.\n");
			
			System.out.println("Qual número em octal corresponde ao número bínario 1010010: ");
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
					System.out.println("É o resultado da conversão dígito a dígito de octal para binário, da direita para a esquerda");
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
					System.out.println("Resposta inválida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("\nDica: A conversão de octal para binário é feita convertendo dígito a dígito de octal para binário, da direita para a esquerda.");
					System.out.println("Cada digito é convertido para um grupo de 3bits em binário.");
					tentativa=0;
					}
				
				gameover(vida);
				
			}while(resposta !="C");
			System.out.println("Os pontos de vida são: "+vida+"\n");
		}
	
	//continuacao da historia
	System.out.println(" Ao lado do televisor havia um pequeno microfone, tomas o colocou na orelha e ouviu. “Extraordinário!” Dizia a voz “Você já está prestes a sair deste labirinto, \n"
			+ "apenas mais um acerto e você poderá ir para casa com todas as suas memórias restauradas. A última pergunta se encontra a 100 metros desta porta, acerte-a e venha até nós.\n"
			+ " E jamais esqueça, Cruel é bom!” \n");
	System.out.println("A porta se abriu e "+nickname+" estava à beira de um precipício, conseguia ver a última porta do outro lado,\n"
			+ "mas para chegar até lá teria que atravessar uma ponte feita de corda e madeira, que parecia ter mil anos de idade. "+nickname+" suspirou, meio ofegante e deu o primeiro passo na ponte.\n"
			+ " A madeira rugia, um vento forte o ricocheteava de lado, mas ele não parou, passo a passo ele conseguiu atravessar a ponte e se livrar do penhasco,\n"
			+ "mas quando olhou para lugar de que tinha vindo, um enorme ser que parecia com uma aranha de 2 metros, com pernas de ferro e olhos vermelhos estava parada o olhando. \n"
			+ " Em disparada ela começou a correr em direção a ele, rapidamente "+nickname+" teve a brilhante ideia de desamarrar as cordas da ponte para que o monstro caísse na escuridão do abismo. \n"
			+ "Ele começou, desamarrou a primeira corda e a ponte tombou para o lado, mas isso não parecia ser um problema para a aranha, pois ela continuou avançando na mesma velocidade. \n"
			+ "Quando faltava menos de dois metros para a aranha alcançar o outro lado, "+nickname+" soltou a outra corda e tanto a ponte quanto esse monstro horrendo despencaram para a morte. \n"
			+ nickname+" estava completamente assustado, suava, mas se obrigou a manter o controle. Virou-se para a porta que era a única coisa que o separava de sua liberdade, \n"
			+ "pegou o aparelho que estava ao lado e começou ler a décima pergunta.\n");
	
	// decimo questionario
	if (direcao == 1) {
		System.out.println("“DECIMA PERGUNTA” \n");
		System.out.println("O número que correspondende ao número 52(16) em decimal é: ");
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
				System.out.println("É o resultado da multiplicação de cada digito do numero hexadecimal pela potencia 16 relativa a sua posição e a soma dos resultados");
				break;
				
			default:
				System.out.println("Resposta inválida");
				break;
			}
			
			if (tentativa == 2) {
				System.out.println("\nDica: Para chegar ao resultado multiplique cada digito do numero hexadecimal pela potencia 16 relativa a sua posição e depois some os resultados");
				tentativa=0;
				}
			
			gameover(vida);
			
		}while(resposta != "E");
		System.out.println("Os pontos de vida são: "+vida+"\n");
		}
		else if(direcao == 1) {
			System.out.println("“DECIMA PERGUNTA” \n");
			System.out.println("O número que correspondende ao número 84(16) em decimal é: ");
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
					System.out.println("É o resultado da multiplicação de cada digito do numero hexadecimal pela potencia 16 relativa a sua posição e a soma dos resultados");
					break;
				case "E":
					
					System.out.println("Resposta incorreta");
					tentativa++;
					vida--;
					break;
					
				default:
					System.out.println("Resposta inválida");
					break;
				}
				
				if (tentativa == 2) {
					System.out.println("\nDica: Para chegar ao resultado multiplique cada digito do numero hexadecimal pela potencia 16 relativa a sua posição e depois some os resultados");
					tentativa=0;
					}
				
				gameover(vida);
				
			}while(resposta != "D");
			System.out.println("Os pontos de vida são: "+vida+"\n");
		}
	
	// continuacao da historia
	System.out.println(nickname+" respondeu e a porta se abriu de imediato. Atrás da porta havia dezenas de pessoas o olhando como se ele tivesse vindo de outro planeta, "+nickname+" se sentiu desconfortável,\n"
			+ "e então uma mulher com aparência de uns 40 anos se aproximou de "+nickname+" e disse para ele não se preocupar, pois daria todas as respostas para ele agora. \n"
			+ "Ambos se sentaram em cadeiras confortáveis e ela começou. "+nickname+", você ficou dormindo por 12 anos desde que foi capturado por um de nossos agentes, no ano de 2063, que foi a 10 anos atrás,\n"
			+ "houve uma forte epidemia que ficou conhecida como Covid-63, esta epidemia apodrecia o cérebro dos infectados em menos de 6 meses.\n"
			+ " Você foi o escolhido por nós para concluir este teste porque sabíamos que se você o concluísse com sucesso, seu cérebro geraria uma substância que seria a chave principal para esta epidemia.\n"
			+ " Nossa organização se chama Cruel, e nosso maior objetivo é fazer o melhor para a humanidade "+nickname+" sentiu muita raiva de tudo aquilo, mas no fim compreendeu que era para o bem da humanidade.\n"
			+ " Retiraram a substancia do cérebro de "+nickname+" e ofereceu recursos para que ele pudesse viver bem e em segurança.\n"
			+ "3 anos depois esta doença tinha sido extinta e a humanidade venceu um novo desafio.\n\n");
	
	System.out.println("OBRIGADO POR JOGAR");
}
}