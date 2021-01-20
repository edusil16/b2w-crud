package com.eduardo.b2wcrud.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "planetas")
@Data
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
