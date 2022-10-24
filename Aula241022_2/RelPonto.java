package Aula241022_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RelPonto {
    
    public void regEntrada(Funcionario a){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();
        System.out.println("Entrada: " + a.getCodigo() + " Nome: " + a.getNome());
        System.out.println("Data: " + sdf.format(agora));
        
    }
    
    public void regSaida(Funcionario a){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();
        System.out.println("Saída: " + a.getCodigo() + " Nome: " + a.getNome());
        System.out.println("Data: " + sdf.format(agora));        

    }

}
