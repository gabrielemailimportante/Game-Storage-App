package com.curso.gameapi.services;

import com.curso.gameapi.models.Game;
import com.curso.gameapi.repositories.GameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GameService {

    //Injetando o repositório
    @Autowired
    private GameRepo gameRepo;

    //Métod0 responsável por criar um Game
    public Game criarGame(Game newGame){

        try{
            gameRepo.save(newGame);
            System.out.println("Game Salvo com sucesso.");

        }catch (Exception exception){
            System.out.println("Erro ao salvar game:");
            System.out.println(exception);
        }

        return newGame;
    }

    //Métod0 responsável por buscar um Game por ID
    public Game buscarGamePorId(Integer idGame){

        Game gameEncontrado = new Game();

        try{
            gameEncontrado = gameRepo.findById(idGame).get();
            System.out.println(gameEncontrado);
        }
        catch (Exception exception){
            System.out.println("Erro ao buscar game:");
            System.out.println(exception);
        }

        return gameEncontrado;
    }

    //Métod0 responsável por listar todos os games
    public ArrayList<Game> listarTodosGames(){

        ArrayList<Game> todosGames = new ArrayList<>();

        gameRepo.findAll().forEach(umGame -> {
            todosGames.add(umGame);
            System.out.println(umGame);
        });

        return todosGames;
    }

}
