package com.pokemonreview.api.service;

import com.pokemonreview.api.dto.PokemonDto;
import com.pokemonreview.api.dto.PokemonResponse;

public interface PokemonService {

    PokemonDto createPokemon(PokemonDto pokemonDto);
    PokemonDto getPokemonById(int id);

    PokemonResponse getAllPokemons(int pageNo, int pageSize);
}
