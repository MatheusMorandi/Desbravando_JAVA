package Questao1;

public class ElevadorTest {

    public static void main(String args[]){

        Elevador a = new Elevador(10,15);
        a.totalAndar = 2;
        a.capacidade = 2;

        a.entra();
        a.sai();
        a.sobe();
        a.sai();


    }
    
}
