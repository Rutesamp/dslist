package com.rutesamp.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rutesamp.dslist.dto.GameMinDTO;
import com.rutesamp.dslist.entities.Game;
import com.rutesamp.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findA11() {
	     var result = gameRepository.findAll();
	     return result;
	}
	
}
