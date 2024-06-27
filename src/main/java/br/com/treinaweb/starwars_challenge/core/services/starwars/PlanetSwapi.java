package br.com.treinaweb.starwars_challenge.core.services.starwars;

import java.util.List;

public record PlanetSwapi(
    String name,
    String climate,
    String terrain,
    List<String> films
) {
    
}
