package com.curso.gameapi;

import com.curso.gameapi.models.Game;
import com.curso.gameapi.services.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Year;

@SpringBootApplication
public class GameapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameapiApplication.class, args);

		testador();
	}

	//ZONA DE TESTE ==========================================
	private static GameService gameService;

	public GameapiApplication(GameService gameService) {
		this.gameService = gameService;
	}

	static void testador(){

		//Criando um Game
		Game novoGameA = new Game(
				"Resident Evil",
				"Capcom",
				"Terror",
				Year.of(1996)
		);

		//gameService.criarGame(novoGameA);
		//gameService.buscarGamePorId(1);
		//gameService.listarTodosGames();
	}

	//ZONA DE TESTE ==========================================
}
