package com.devsuperior.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.gamelist.dto.GameDTO;
import com.devsuperior.gamelist.dto.GameMinDTO;
import com.devsuperior.gamelist.services.GameService;

@RestController
@RequestMapping(value="/games")
public class GameController {
    
    @Autowired
    private GameService gameService;
    
    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long gameId){
        GameDTO result = gameService.findById(gameId);
        return result;
    }


    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
