package Questao2;

public class Paralelepipedo{

    //ATRIBUTOS
    double altura;
    double comprimento;
    double profundidade;

    //MÉTODOS
    void volume(){
        System.out.println("Volume do paralelepipedo = "+(this.altura * this.comprimento * this.profundidade));
        
    }

    void atotal(){
        System.out.println("Area total = "+((this.comprimento * this.altura * 2) + (this.comprimento * this.profundidade * 2) + (this.profundidade * this.altura * 2)));
    }

    void area(int face){
        if (face == 1){
            System.out.println("Area da face "+ face +" = "+(this.comprimento * this.altura));
        }
        else{
            if (face == 2){
                System.out.println("Area da face "+ face +" = "+(this.comprimento * this.altura));
            }
            else{
                if (face == 3){
                    System.out.println("Area da face "+ face +" = "+(this.comprimento * this.profundidade));
                }
                else{
                    if (face ==4){
                        System.out.println("Area da face "+ face +" = "+(this.comprimento * this.profundidade));
                    }
                    else{
                        if (face ==5){
                            System.out.println("Area da face "+ face +" = "+(this.profundidade * this.altura));
                        }
                        else{
                            if (face ==6){
                                System.out.println("Area da face "+ face +" = "+(this.profundidade * this.altura));
                            }
                            else{
                                System.out.println("NÃO POSSUI ESTA FACE");
                            }
                        }
                    }
                }

            }

        }

    }
}