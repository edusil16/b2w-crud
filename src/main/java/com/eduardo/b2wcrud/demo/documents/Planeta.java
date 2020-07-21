package com.eduardo.b2wcrud.demo.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "planetas")
public class Planeta {

    @Id
    private String id;
    private String terreno;
    private String clima;
    private String nome;
    private Integer quantidadeAparicaoFilmes;

    public Planeta(String terreno, String clima, String nome, Integer quantidadeAparicaoFilmes){
        super();
        this.terreno = terreno;
        this.clima = clima;
        this.nome = nome;
        this.quantidadeAparicaoFilmes = quantidadeAparicaoFilmes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeAparicaoFilmes() {
        return quantidadeAparicaoFilmes;
    }

    public void setQuantidadeAparicaoFilmes(Integer quantidadeAparicaoFilmes) {
        this.quantidadeAparicaoFilmes = quantidadeAparicaoFilmes;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "id='" + id + '\'' +
                ", terreno='" + terreno + '\'' +
                ", clima='" + clima + '\'' +
                ", nome='" + nome + '\'' +
                ", quantidadeAparicaoFilmes=" + quantidadeAparicaoFilmes +
                '}';
    }
}
