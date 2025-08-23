package com.rutesamp.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.rutesamp.dslist.dto.GameDTO;
import com.rutesamp.dslist.dto.GameMinDTO;
import com.rutesamp.dslist.entities.Game;
import com.rutesamp.dslist.projections.GameMinProjection;
import com.rutesamp.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).orElseThrow(
            () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Game not found with ID: " + id)
        );
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
	     List<Game> result = gameRepository.findAll();
	     List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
	     return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long id) {
		List<GameMinProjection> result = gameRepository.searchByList(id);
	     List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
	     return dto;
    }
}