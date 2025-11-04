package com.curso.gameapi.controllers.view;

import com.curso.gameapi.models.Game;
import com.curso.gameapi.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//indicando classe que será view e controller - visual
@Controller
@RequestMapping("/view/games")
public class GameViewController {


    //Injetando a dependencia
    @Autowired
    private GameService gameService;

    //endpoint GET para listar todos os games em view
    @GetMapping
    public String listarGames(Model model) {
        model.addAttribute("games", gameService.listarTodosGames());
        return "list.html";
    }

    //endpoint GET para indicar a pagina para criação de registro
    @GetMapping("/create")
    public String criarGameForm(Model model) {
        model.addAttribute("game", new Game());
        return "create.html";
    }

    //Criar endpoint POST para criação de um registro
    @PostMapping("/create")
    public String createGameView(@ModelAttribute Game game) {

        if(game.getTitulo() != null && game.getEditora() != null && game.getGenero() != null && game.getAnoLancamento() != null){

            gameService.criarGame(game);
            return "redirect:/view/games";
        }

        return "redirect:/view/games/create";
    }
}
