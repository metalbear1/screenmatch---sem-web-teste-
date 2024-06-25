package br.com.alura.screenmatch.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DadoSerie(@JsonAlias("Title")  String titulo,
                        @JsonAlias("totalSeasons") Integer totalTemporads,
                        @JsonAlias("imdbRating") String avaliacao) {
}
