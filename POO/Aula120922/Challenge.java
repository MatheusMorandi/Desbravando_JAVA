package Aula120922;

public class Challenge {

    //Atributos 
    double capital;
    double juros;
    double montante;

    Challenge(double juros, double capital){

        this.capital = capital;
        this.juros = juros/100;

    }

    //Métodos
    double result(int meses){
    
        double tax = 1 + this.juros;
        tax = Math.pow(tax, meses);
        return this.capital * tax;

    }



}