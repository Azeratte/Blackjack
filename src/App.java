import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/*  LUCAS RIBEIRO CANO
    RA: 21436547
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("-------------------------------");
        System.out.println("Bem-vindo ao jogo de BlackJack!");
		System.out.println("-------------------------------\n");

        int jogar = 0;

        int scoreD = 0, scoreJ = 0;
        

        Scanner entrada = new Scanner(System.in);
        

        ArrayList<Carta> lista = new ArrayList<>();
        
        int baralhos;

        while(jogar == 0){

        int menu = 0;

        do{
            System.out.println("Digite a quantidade de baralhos que deseja usar, de 1 a 7:");
            baralhos = entrada.nextInt();

        switch(baralhos) {
            case 1:
                for (int i = 1; i < 14; i++) {
                    lista.add(new Carta('P', i));           
                    }
    
                for (int i = 1; i < 14; i++) {
                    lista.add(new Carta('C', i));           
                    }
    
                for (int i = 1; i < 14; i++) {
                    lista.add(new Carta('O', i));           
                    }
    
                for (int i = 1; i < 14; i++) {
                    lista.add(new Carta('E', i));           
                    }
            break;
            
            case 2:
                for (int j = 0; j < 2; j++) {
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('P', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('C', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('O', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('E', i));           
                        }
                    
                }
            break;
            
            case 3:
                for (int j = 0; j < 3; j++) {
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('P', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('C', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('O', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('E', i));           
                        }
                    
                }
            break;            
            
            case 4:
                for (int j = 0; j < 4; j++) {
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('P', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('C', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('O', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('E', i));           
                        }
                    
                }
            break;            
            
            case 5:
                for (int j = 0; j < 5; j++) {
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('P', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('C', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('O', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('E', i));           
                        }
                    
                }
            break;

            case 6:
                for (int j = 0; j < 6; j++) {
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('P', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('C', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('O', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('E', i));           
                        }
                    
                }
            break;            

            case 7:
                for (int j = 0; j < 7; j++) {
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('P', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('C', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('O', i));           
                        }
        
                    for (int i = 1; i < 14; i++) {
                        lista.add(new Carta('E', i));           
                        }
                    
                }
            break;    
            
            default:
            System.out.println("Quantidade inválida!\n");
            
        } 
        
        }while(baralhos < 0 || baralhos > 7 );

        Collections.shuffle(lista);

        Stack S = new Stack();

        int T = lista.size();


        for (int i = 0; i < T; i++) {
            S.push(lista.get(i));
        }

        ArrayList<Carta> dealer = new ArrayList<>();

        ArrayList<Carta> jogador = new ArrayList<>();

        int totalDealer = 0, totalJogador = 0;

        int tamanho = 0;
        
        Carta aux = new Carta();

        boolean As;

        System.out.println("");

        System.out.println("Jogador recebe duas cartas:\n");
        
        jogador.add(S.pop());
        jogador.add(S.pop());
 

        tamanho = jogador.size();
        for (int i = 0; i < tamanho; i++) {
            As = false;
            int valor = 0;
            aux = jogador.get(i);
            if(aux.getValor() > 10) {
                valor = 10;
            } else {
                valor = aux.getValor();
            }
            if(valor == 1) {
                As = true;
            }
            totalJogador += valor;

            if(As && totalJogador + 10 <= 21){
                totalJogador += 10;
            }

        }

        System.out.println("Mão do Jogador: \n"+jogador);
        System.out.println("Total do Jogador: "+totalJogador);
        System.out.println("");
        
        while(totalJogador < 21 && menu != 2) {
            menu = 0;
            System.out.println("Deseja mais uma carta ou deseja parar?");
            System.out.println("Digite 1 para mais uma carta ou 2 para parar:");
            menu = entrada.nextInt();
    
            switch(menu) {
                case 1:
                totalJogador = 0;
                jogador.add(S.pop());
                tamanho = jogador.size();
                for (int i = 0; i < tamanho; i++) {
                    As = false;
                    int valor = 0;
                    aux = jogador.get(i);
                    if(aux.getValor() > 10) {
                        valor = 10;
                    } else {
                        valor = aux.getValor();
                    }
                    if(valor == 1) {
                        As = true;
                    }
                    totalJogador += valor;
        
                    if(As && totalJogador + 10 <= 21){
                        totalJogador += 10;
                    }
    
                }
    
                System.out.println("Mão do Jogador: \n"+jogador);
                System.out.println("Total do Jogador: "+totalJogador);
                System.out.println("");


                break;
    
                case 2:
                System.out.println("Jogador parou!\n");
                System.out.println("Mão do Jogador: \n"+jogador);
                System.out.println("Total do Jogador: "+totalJogador);
                System.out.println("");
    
                break;
    
                default:
                System.out.println("Opção inválida!\n");
    
            }    
    
        }


        if(totalJogador > 21){
            System.out.println("Você estourou! \n");
        } else {

            if(totalJogador <=21) {
        System.out.println("Vez do Dealer\n");
       
        System.out.println("Dealer recebe duas cartas:\n");

        dealer.add(S.pop());
        dealer.add(S.pop());

        tamanho = dealer.size();
        for (int i = 0; i < tamanho; i++) {
            As = false;
            int valor = 0;
            aux = dealer.get(i);
            if(aux.getValor() > 10) {
                valor = 10;
            } else {
                valor = aux.getValor();
            }
            if(valor == 1) {
                As = true;
            }
            totalDealer += valor;

            if(As && totalDealer + 10 <= 21){
                totalDealer += 10;
            }

        }

        

        System.out.println("Mão do Dealer: \n"+dealer);
        System.out.println("Total do Dealer: "+totalDealer);
        System.out.println("");
        

    }
        while(totalDealer <21 && totalDealer < totalJogador){
            System.out.println("Dealer pede uma carta\n");
            totalDealer = 0;
            dealer.add(S.pop());
            tamanho = dealer.size();
            for (int i = 0; i < tamanho; i++) {
                As = false;
                int valor = 0;
                aux = dealer.get(i);
                if(aux.getValor() > 10) {
                    valor = 10;
                } else {
                    valor = aux.getValor();
                }
                if(valor == 1) {
                    As = true;
                }
                totalDealer += valor;
    
                if(As && totalDealer + 10 <= 21){
                    totalDealer += 10;
                }

            }

            System.out.println("Mão do Dealer: \n"+dealer);
            System.out.println("Total do Dealer: "+totalDealer);
            System.out.println("");

            }

        }

        System.out.println("Restante do baralho: \n");

        while(!S.isEmpty()){
            System.out.println(S.pop());
        }

        System.out.println("");

        if(totalJogador > 21) {
            scoreD++;
            System.out.println("Vitória do Dealer!\nScore do Dealer: "+scoreD+"\nScore do Jogador: "+scoreJ);
        } else if(totalDealer > 21) {
            scoreJ++;
            System.out.println("Vitória do Jogador!\nScore do Dealer: "+scoreD+"\nScore do Jogador: "+scoreJ);

        } else if(totalDealer > totalJogador) {
            scoreD++;
            System.out.println("Vitória do Dealer!\nScore do Dealer: "+scoreD+"\nScore do Jogador: "+scoreJ);
        } else {
            System.out.println("Empate, ninguém pontuou\n");
        }

        dealer.clear();
        jogador.clear();
        lista.clear();

        System.out.println("Deseja jogar novamente?\nDigite 0 para sim ou qualquer outro número para não: ");
        jogar = entrada.nextInt();
        baralhos = 0;


    }    

    System.out.println("");
    System.out.println("-----------");
    System.out.println("Fim de jogo");
    System.out.println("-----------");

    }


}
