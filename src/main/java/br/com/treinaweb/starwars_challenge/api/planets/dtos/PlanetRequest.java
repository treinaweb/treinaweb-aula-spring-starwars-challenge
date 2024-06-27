package br.com.treinaweb.starwars_challenge.api.planets.dtos;

import br.com.treinaweb.starwars_challenge.core.models.Planet;

public record PlanetRequest(
    String name,
    String climate,
    String terrain
) {
    
    public Planet toPlanet() {
        var planet = new Planet();
        planet.setName(name);
        planet.setClimate(climate);
        planet.setTerrain(terrain);
        return planet;
    }

}
