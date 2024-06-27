package br.com.treinaweb.starwars_challenge.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.starwars_challenge.core.models.Planet;

public interface PlanetRepository extends JpaRepository<Planet, Long> {

    List<Planet> findByNameContainingIgnoreCase(String name);
    
}
