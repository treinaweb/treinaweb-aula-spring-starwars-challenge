package br.com.treinaweb.starwars_challenge.api.planets.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.starwars_challenge.api.planets.dtos.PlanetRequest;
import br.com.treinaweb.starwars_challenge.api.planets.dtos.PlanetResponse;
import br.com.treinaweb.starwars_challenge.core.exceptions.PlanetNotFoundException;
import br.com.treinaweb.starwars_challenge.core.repositories.PlanetRepository;
import br.com.treinaweb.starwars_challenge.core.services.starwars.StarWarsApiService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/planets")
public class PlanetController {

    private final PlanetRepository planetRepository;
    private final StarWarsApiService starWarsApiService;

    @GetMapping
    public List<PlanetResponse> findAll(
        @RequestParam(required = false, defaultValue = "") String search
    ) {
        return planetRepository.findByNameContainingIgnoreCase(search)
            .stream()
            .map(PlanetResponse::of)
            .toList();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public PlanetResponse create(@RequestBody PlanetRequest planetRequest) {
        var planetToCreate = planetRequest.toPlanet();
        var numberOfFilms = starWarsApiService.getPlanetNumberOfFilms(planetToCreate.getName());
        planetToCreate.setNumberOfFilms(numberOfFilms);
        var createdPlanet = planetRepository.save(planetToCreate);
        return PlanetResponse.of(createdPlanet);
    }

    @GetMapping("/{id}")
    public PlanetResponse findById(@PathVariable Long id) {
        return planetRepository.findById(id)
            .map(PlanetResponse::of)
            .orElseThrow(PlanetNotFoundException::new);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        var planet = planetRepository.findById(id)
            .orElseThrow(PlanetNotFoundException::new);
        planetRepository.delete(planet);
    }
    
}
