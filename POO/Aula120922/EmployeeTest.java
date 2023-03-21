package Aula120922;

public class EmployeeTest {

    public static void main (String args[]){

        Employee f = new Employee();
        f.nome = "Jorge da Silva";
        f.cargo = "Estágiario";
        f.salario = 1200;
        f.dataDeNascimento = "11/09/1995";

        f.imprimeDados();
        System.out.println("Valor aumento " + f.porcentSalario(260.55));
        f.imprimeDados();
        
    }
    
}
