package com.rutesamp.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rutesamp.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
