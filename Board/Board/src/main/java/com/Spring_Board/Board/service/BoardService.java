package com.Spring_Board.Board.service;

import com.Spring_Board.Board.data.dto.BoardDto;
import com.Spring_Board.Board.data.dto.BoardResponseDto;
import com.Spring_Board.Board.data.entity.Board;

public interface BoardService {
    BoardResponseDto getBoard(Long number);

    BoardResponseDto saveBoard(BoardDto boardDto);
}
