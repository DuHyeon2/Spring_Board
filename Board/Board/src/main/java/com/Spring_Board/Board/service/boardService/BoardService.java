package com.Spring_Board.Board.service.boardService;

import com.Spring_Board.Board.data.boardData.dto.BoardDto;
import com.Spring_Board.Board.data.boardData.dto.BoardResponseDto;

public interface BoardService {
    BoardResponseDto getBoard(Long number);

    BoardResponseDto saveBoard(BoardDto boardDto);
}
