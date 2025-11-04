package com.curso.gameapi.controllers.json;

import com.curso.gameapi.models.Game;
import com.curso.gameapi.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//Anotação para indicar a criação de endpoints JSON
@RestController
//Indicando subdivisões de caminho
@RequestMapping("/json/games")
public class GameJSONController {

    //Integrar a dependencia
    @Autowired
    private GameService gameService;;

    //endpoint para GET de todos os games
    //https://localhost:8080/json/games
    @GetMapping
    public ArrayList<Game> todosGames() {
        return gameService.listarTodosGames();
    }
}
