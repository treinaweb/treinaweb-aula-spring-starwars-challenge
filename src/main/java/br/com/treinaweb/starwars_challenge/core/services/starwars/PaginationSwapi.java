package br.com.treinaweb.starwars_challenge.core.services.starwars;

import java.util.List;

public record PaginationSwapi<T>(
    Integer count,
    String next,
    String previous,
    List<T> results
) {
    
}
