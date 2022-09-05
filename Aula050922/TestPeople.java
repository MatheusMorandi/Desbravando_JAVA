package Aula050922;
public class TestPeople{
    public static void main (String args[]){

        People paulinho = new People();
 
        paulinho.Nome = "Paulo Henrique Félix";
        paulinho.Idade = 26;
        paulinho.Altura = 1.20;
        paulinho.Nacionalidade = "Brasileiro";


        paulinho.imprimeAtributos();

        //paulinho.crescer();

        paulinho.imprimeAtributos();

        Car corsa = new Car();
        corsa.Marca = "Audi";
        corsa.Modelo = "TT";
        corsa.Ano = 2022;
        corsa.Proprietario = paulinho;

        



    }
    
}
