package Aula241022_2;

public class FuncTest {

    public static void main(String args[]){

        Gerente a = new Gerente();

        a.setCodigo(31578);
        a.setNome("Julio");
        a.setUsuario("Juju123");
        a.setSenha("juju321");

        RelPonto b = new RelPonto();

        b.regSaida(a);


    }
    
}
