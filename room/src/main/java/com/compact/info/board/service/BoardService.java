package com.compact.info.board.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.compact.info.board.domain.Board;
import com.compact.info.board.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	
	private final BoardRepository boardRepository;
	
	@Transactional
	public void insertBoard(Board board) {
		boardRepository.save(board);
	}
	
	@Transactional(readOnly = true)
	public List<Board> getBoardList(){
		return boardRepository.findAll();
	}
}
