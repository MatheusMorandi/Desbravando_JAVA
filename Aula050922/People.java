package Aula050922;
public class People {

    //Atributos
    String Nome;
    int Idade;
    double Altura;
    String Nacionalidade;

    //Métodos
    void andar(){

        System.out.println("A pessoa está andando!");

    }
    void trabalhar(){

        System.out.println("A pessoa está trabalhando!");

    }
    void comer(){

        System.out.println("A pessoa está comendo!");

    } 
    void crescer(){

    }

    void imprimeAtributos(){

        System.out.println("Nome:"+this.Nome);
        System.out.println("Idade: "+this.Idade);
        System.out.println("Altura: "+this.Altura);
        System.out.println("Nacionalidade: "+this.Nacionalidade);

    }
    
}

