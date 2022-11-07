package Aula07112022.ObjectString;

import Aula07112022.Domain.*;

import Aula07112022.Task.*;

public class ObjetStringTest {

    public static void main(String args[]){

        Repositorio rep = new Repositorio();

        People p = new People();

        Employe e = new Employe();

        rep.adiciona(e);

        rep.adiciona(p);

        System.out.println(rep.retornaObjeto());

        rep.removeUltimo();

        System.out.println(rep.retornaObjeto());

    }
    
}
