package br.com.treinaweb.starwars_challenge.core.services.starwars;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "swapi", url = "https://swapi.dev/api")
public interface StarWarsApiService {

    @GetMapping("/planets")
    PaginationSwapi<PlanetSwapi> searchPlanets(@RequestParam String search);

    default Integer getPlanetNumberOfFilms(String name) {
        var body = this.searchPlanets(name);
        if (body.count() != 1) {
            return 0;
        }
        return body.results().get(0).films().size();
    }
    
}
