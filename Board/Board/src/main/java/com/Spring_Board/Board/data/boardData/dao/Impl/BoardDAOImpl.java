package com.Spring_Board.Board.data.boardData.dao.Impl;

import com.Spring_Board.Board.data.boardData.dao.BoardDAO;
import com.Spring_Board.Board.data.boardData.entity.Board;
import com.Spring_Board.Board.data.boardData.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoardDAOImpl implements BoardDAO {
    private final BoardRepository boardRepository;

    @Autowired
    public BoardDAOImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Board insertBoard(Board board) {
        Board insertBoard = boardRepository.save(board);
        return insertBoard;
    }

    @Override
    public Board selectBoard(Long number) {
        Board selectBoard = boardRepository.getById(number);
        return selectBoard;
    }
}
