package Questao1;

public class Elevador{

    //Atributos
    int andarAtual = 0;
    int totalAndar;
    int capacidade;
    int qntPessoa = 0;

    //Métodos

    Elevador(int cap, int totAndar){

        this.capacidade = cap;
        this.totalAndar = totAndar;
 
    }

    void entra(){
        if (this.qntPessoa < this.capacidade ){
            this.qntPessoa += 1;
            System.out.println("De "+(this.qntPessoa - 1)+" pessoas foi para "+ this.qntPessoa);
        }
        else{
            System.out.println("Não foi possível acrescentar uma pessoa, pois ja está lotado.");
        }
    }

    void sai (){
        if(this.qntPessoa > 0){
            this.qntPessoa -= 1;
            System.out.println("De "+(this.qntPessoa + 1)+" pessoas foi para "+ this.qntPessoa);
        }
        else{
            System.out.println("Não foi possível sair ninguém, pois está vazio.");
        }
    }

    void sobe(){
        if (this.andarAtual < this.totalAndar){
            this.andarAtual += 1;
            System.out.println("Fomos do andar "+(this.andarAtual - 1)+" para o andar "+ this.andarAtual);
        }
        else{
            System.out.println("Não foi possível subir o andar pois ja estamos no último andar.");
        }
    }

    void desce(){
        if (this.andarAtual > 0){
            this.andarAtual -=1;
            System.out.println("Fomos do andar "+(this.andarAtual + 1)+" para o andar "+ this.andarAtual);
        }
        else{
            System.out.println("Não foi possível descer o andar pois ja estamos no térreo.");
        }
    }
}