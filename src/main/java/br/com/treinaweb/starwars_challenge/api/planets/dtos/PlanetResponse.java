package br.com.treinaweb.starwars_challenge.api.planets.dtos;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import br.com.treinaweb.starwars_challenge.core.models.Planet;

@JsonNaming(SnakeCaseStrategy.class)
public record PlanetResponse(
    Long id,
    String name,
    String climate,
    String terrain,
    Integer numberOfFilms
) {

    public static PlanetResponse of(Planet planet) {
        return new PlanetResponse(
            planet.getId(),
            planet.getName(), 
            planet.getClimate(),
            planet.getTerrain(),
            planet.getNumberOfFilms()
        );
    }
    
}
