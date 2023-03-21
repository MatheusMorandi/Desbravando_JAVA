package Questao2;

public class ParalelepipedoTeste {
    public static void main (String args[]){
        Paralelepipedo a = new Paralelepipedo(1,2,3);

        System.out.println("Area da face 6 = " + a.area(6));
        System.out.println(a.volume());
        System.out.println(a.atotal());


        
    }
}
