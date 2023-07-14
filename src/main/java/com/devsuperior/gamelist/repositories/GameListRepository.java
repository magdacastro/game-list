package com.devsuperior.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
