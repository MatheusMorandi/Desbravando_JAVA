package Aula260922;

public class Poupança {

    // Atributos

    double saldo;
    double limite;

    Poupança(double saldo){

        this.saldo = saldo;
        
    }

    Poupança(double saldo, double limite){

        this.saldo = saldo;
        this.limite = limite;

    }

    // Métodos

    double rendi(){

        return this.saldo * 1.1;

    }

    double rendi(double taxa, int tempo){

        return this.saldo * Math.pow((1 + (taxa / 100)), (double) tempo);

    }
    
    void pix (Poupança destino, double valor){

        if (this.saldo >= valor){

            destino.saldo += valor;
            this.saldo -= valor;
                        
        }
        else{
            System.out.println("Saldo insuficiente para transfêrencia");
        }
    }

    void retornaPix (Poupança destino, double valor){
        
        destino.saldo -= valor;

        this.saldo += valor;

    }

    void pixLimt (Poupança destino, double valor, double limite){

        if ((this.saldo >= valor)||(this.saldo + limite >= valor)){

            destino.saldo += valor;
            this.saldo -= valor;
                        
        }
        else{
            System.out.println("Saldo insuficiente para transfêrencia");
        }

    }
}
