package com.curso.gameapi.repositories;

import com.curso.gameapi.models.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepo extends CrudRepository<Game, Integer> {
    //NÃO PRECISAMOS PROGRAMAR NADA!!!
}
