package com.compact.info.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.compact.info.board.domain.Board;
import com.compact.info.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
	private final BoardService boardService;
	
	@GetMapping("/list")
	public String save(Board board) {
		
		return "board/board-view";
	}
}
