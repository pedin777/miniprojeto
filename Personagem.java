public class Personagem {
    String nome;
    int energia;

    Personagem(String nome){
        this.nome = nome;
        this.energia = 10;
    }     


void alterarEnergia(int alteracaoEnergia){
    this.energia += alteracaoEnergia;
    System.out.println(this.nome + " teve sua energia alterada " + alteracaoEnergia);
    if(this.energia > 11){
        this.energia = 11;
    }
    if(this.energia < 0){
        this.energia = 0;
        System.out.println(this.nome + " pediu para ser substituido ");
    }
}
}
