package com.Spring_Board.Board.data.boardData.dao;

import com.Spring_Board.Board.data.boardData.entity.Board;

public interface BoardDAO {
    Board insertBoard(Board board);

    Board selectBoard(Long number);
}
