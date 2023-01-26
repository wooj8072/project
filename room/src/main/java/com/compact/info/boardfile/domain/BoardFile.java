package com.compact.info.boardfile.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.compact.info.board.domain.Board;
import com.compact.info.common.CommonDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BoardFile extends CommonDate{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;
	
	private String originalFilename;
	
	private String storedFilePath;
	
	private long fileSize;
	
	private String creatorId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "board_idx")
	private Board board;
}
