package com.devsuperior.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
