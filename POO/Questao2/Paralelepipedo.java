package Questao2;

public class Paralelepipedo{

    //ATRIBUTOS
    double altura;
    double comprimento;
    double profundidade;

    //MÉTODOS
    Paralelepipedo(double altura, double comprimento, double profundidade){

        this.altura = altura;
        this.comprimento = comprimento;
        this.profundidade = profundidade;

    }

    double volume(){
                
        return (this.altura * this.comprimento * this.profundidade);
    }

    double atotal(){

        return (this.comprimento * this.altura * 2) + (this.comprimento * this.profundidade * 2) + (this.profundidade * this.altura * 2);
    }

    double area(int face){
        if (face == 1 || face == 4){
            return (this.comprimento * this.altura);
        }
        else{
            if (face == 2 || face == 5){
                return (this.comprimento * this.altura);
            }
            else{
                if (face == 3 || face == 6){
                    return(this.comprimento * this.profundidade);
                }
                
                else{
                    System.out.println("NÃO POSSUI ESTA FACE");
                    return 0;
                    }
                }
     }
}
}