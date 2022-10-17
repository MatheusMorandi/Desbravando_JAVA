package Desafio171022;

import java.sql.Date;

public class Conteudos{

    private String nome;
    private String genero;
    private String sinopse;
    private int duracão;
    private int classificacaoIndicativa;
    private Date dataDeLancamento;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public int getDuracão() {
        return duracão;
    }
    public void setDuracão(int duracão) {
        this.duracão = duracão;
    }
    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }
    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }
    public Date getDataDeLancamento() {
        return dataDeLancamento;
    }
    public void setDataDeLancamento(Date dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    void toPlay (){
        System.out.println("Playing " + this.nome);
    }

}