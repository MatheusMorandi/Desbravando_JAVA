package Desafio171022;

public class Serie extends Conteudos {

    private int numTemp;
    private int numEp;

    public int getNumTemp() {
        return numTemp;
    }
    public void setNumTemp(int numTemp) {
        this.numTemp = numTemp;
    }
    public int getNumEp() {
        return numEp;
    }
    public void setNumEp(int numEp) {
        this.numEp = numEp;
    }
    
    void toPlay(int temporada, int episodeo){

        super.toPlay();
        System.out.println("Temporada " + temporada + "Episodeo " + episodeo);

    }
}
