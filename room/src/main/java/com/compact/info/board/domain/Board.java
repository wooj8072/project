package com.compact.info.board.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.compact.info.boardfile.domain.BoardFile;
import com.compact.info.common.CommonDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Board extends CommonDate{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long boardIdx;
	
	@Column(nullable = false)
	private String title;
	
	private String content;
	
	private int hit;
	
	private String creatorId;
	
	@OneToMany(mappedBy = "board")
	private List<BoardFile> boardFile = new ArrayList<>();
}
