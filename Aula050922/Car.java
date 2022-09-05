package Aula050922;

public class Car {

    String Marca;
    String Modelo;
    int Ano;
    People Proprietario;

    void imprimeAtributos(){

        System.out.println("Marca: "+this.Marca);
        System.out.println("Modelo: "+this.Modelo);
        System.out.println("Ano: "+this.Ano);
        System.out.println("Proprietario: "+this.Proprietario);

    }

    void imprimeProprietario(){

        System.out.println("Dados do Proprietário");
        this.Proprietario.imprimeAtributos();

        /*System.out.println("Nome: "+this.Proprietario.Nome);
        System.out.println("Idade: "+this.Proprietario.Idade);
        System.out.println("Altura: "+this.Proprietario.Altura);
        System.out.println("Nacionalidade: "+this.Proprietario.Nacionalidade);*/

    }

}
