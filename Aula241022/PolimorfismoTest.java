public class PolimorfismoTest {
    
    public static void main(String args[]){

        Cachorro toto = new Cachorro();

        toto.setEspecie("Canina");
        toto.setGenero("Fammimidius");
        toto.setRaca("Pintcher");
        toto.setTipoSanguineo("SRD");

        Gato jorge = new Gato();

        jorge.setEspecie("Felina");
        jorge.setGenero("Felinidia");
        jorge.setCorPelo("Preto");
        jorge.setTipoSanguineo("SRD");

        Clinica c = new Clinica();

        c.setEndereco("Rua Fatec, 97");
        c.setNome("PetNossa");

        c.realizarCirurgia(jorge);
        c.realizarCirurgia(toto);


    }

}
