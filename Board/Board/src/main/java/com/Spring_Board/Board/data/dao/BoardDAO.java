package com.Spring_Board.Board.data.dao;

import com.Spring_Board.Board.data.entity.Board;

public interface BoardDAO {
    Board insertBoard(Board board);

    Board selectBoard(Long number);
}
