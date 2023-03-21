package Aula120922;

public class Employee {

    //Atributos
    String nome;
    String cargo;
    double salario;
    String dataDeNascimento;

    //Métodos 
    void imprimeDados (){

        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de Nascimento: " + this.dataDeNascimento);

    }

    void aumentoSalario (double valor){

        this.salario += valor;

        System.out.println("Salário aumentado com sucesso, salário atual:" + this.salario);
    }

    double porcentSalario (double valor){

        double pc = valor/this.salario;

        this.salario += valor;
    
        System.out.println("Salário aumentado com sucesso, salário atual:" + this.salario);

        return pc;
    }

}
