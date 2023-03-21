package Aula07112022.ObjectString;

public class Repositorio {

    private Object [] objetos = new Object[100];
    static private int numIndex = 0;

    public void adiciona (Object o){

        objetos[numIndex] = 0;
        numIndex += 1;

    }

    public void removeUltimo (){

        numIndex -= 1;

    }
    
    public Object retornaObjeto(){

        return objetos[numIndex - 1];

    }
}
