package com.rutesamp.dslist.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rutesamp.dslist.entities.Game;
import com.rutesamp.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameControler {

	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<Game> findAll() {
		List<Game> result = gameService.findA11();
		return result;
	}
} 
