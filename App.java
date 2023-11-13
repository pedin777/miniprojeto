import java.util.Scanner;

class Livro_interativo {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Oi,você pode fazer parte do livro interativo,\n" +
                "me ajudando a construir uma historia.\n" +
                "\nVamos lá?  - sim - nao\n");
        Scanner start = new Scanner(System.in);
        String init = start.nextLine();
        if (init.equalsIgnoreCase("sim")) {
            Package livro_interativo;
        } else if (init.equalsIgnoreCase("nao")) {
            System.out.println("\nBeleza,fica para uma proxima historia\n");
            System.exit(0);
        }

        Scanner response = new Scanner(System.in);
        System.out.println("\n Vamos começar a construir a historia.\n");
        System.out.println("\nVocê é um jogador de futebol ,\n" +
                    "\n e está jogando uma final,\n" +
                    "\n você é o melhor jogador do time,\n" + 
                    "\n o jogo está 0x0 e  tem uma falta \n" +
                    "\nperto da área para ser cobrada,\n");
        System.out.println("\n\n" +
                "      O que você vai fazer? (Digite sua escolha 1 ou 2)\n\n" +
                "-1 Bater a falta    -2 Deixar seu companheiro bater \n");
        String choises = response.nextLine();
        /* Primeira parte das escolhas */
        if (choises.equalsIgnoreCase("1")) {
            System.out.println(
                    "\nVocê pegou a bola ,ajeitou e bateu a falta\n" +
                    "\n e fez o gol ,abrindo o placar.\n" +
                    "\n Seu time segurou o resultado e acabou o jogo,\n" +
                    "\n vocês foram campeões com seu gol de falta.\n");
            System.out.println("Fim da Historia");
            


        } 
        else if (choises.equalsIgnoreCase("2")) {
            System.out.println(
                "Seu companheiro bateu a falta\n" +
                "\nmais a bola foi na barreira \n" +
                "\ne no rebote ele chutou a bola para fora.\n");
                System.out.println(
                    "Nos acrescimos do segundo tempo com o jogo ainda 0x0\n" +
                    "\n o zagueiro do outro time deu um carrinho \n" +
                    "\n  no seu companheiro e fez um penalti\n" +
                    "\n a ultima oportunidade para seu time fazer o gol.\n");
                    System.out.println("\n\n" +
                    "      O que você vai fazer? (Digite sua escolha 1 ou 2)\n\n" +
                    "-1 Bater o penalti    -2 Deixar seu companheiro bater \n");

                String choises2 = response.nextLine();
                if (choises2.equalsIgnoreCase("1")) {
                    System.out.println(
                        "Você pegou a bola ,botou na marca do penalti\n" +
                        "\n escolheu o canto e bateu ,mais o goleiro pegou\n" +
                        "\n o jogo terminou empate ,foi para os penaltis\n" +
                        "\n você fez o gol nos penaltis mais 2 de seus companheiros\n" +
                        "\n perderam os penaltis e seu time não foi campeão." );
                        System.out.println("Fim da Historia");
                        
                        
                    }else if (choises2.equalsIgnoreCase("2")) {
                        System.out.println(
                            "Seu companheiro victor bateu o penalti \n"+
                            "\nbateu na direita,o goleiro ficou parado no meio\n"+
                            "\ne foi gol.O jogo acabou 1x0 e seu time foi campeão." );
                            System.out.println("Fim da Historia");
                            


                    }
                }
            }              
                
}