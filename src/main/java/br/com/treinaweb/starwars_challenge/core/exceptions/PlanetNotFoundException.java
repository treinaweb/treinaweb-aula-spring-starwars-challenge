package br.com.treinaweb.starwars_challenge.core.exceptions;

public class PlanetNotFoundException extends RuntimeException {

    public PlanetNotFoundException() {
        super("Planeta não encontrado");
    }
    
}
