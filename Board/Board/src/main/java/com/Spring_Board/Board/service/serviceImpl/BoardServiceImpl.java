package com.Spring_Board.Board.service.serviceImpl;

import com.Spring_Board.Board.data.dao.BoardDAO;
import com.Spring_Board.Board.data.dto.BoardDto;
import com.Spring_Board.Board.data.dto.BoardResponseDto;
import com.Spring_Board.Board.data.entity.Board;
import com.Spring_Board.Board.service.BoardService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
    private final BoardDAO boardDAO;

    public BoardServiceImpl(BoardDAO boardDAO) {
        this.boardDAO = boardDAO;
    }

    @Override
    public BoardResponseDto getBoard(Long number) {
        Board board = boardDAO.selectBoard(number);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setNumber(board.getNumber());
        boardResponseDto.setName(board.getName());
        boardResponseDto.setTitle(board.getTitle());
        boardResponseDto.setContent(board.getContent());

        return boardResponseDto;
    }

    @Override
    public BoardResponseDto saveBoard(BoardDto boardDto) {
        Board board = new Board();
        board.setName(boardDto.getName());
        board.setTitle(board.getTitle());
        board.setContent(board.getContent());

        Board saveBoard = boardDAO.insertBoard(board);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setNumber(saveBoard.getNumber());
        boardResponseDto.setName(saveBoard.getName());
        boardResponseDto.setTitle(saveBoard.getTitle());
        boardResponseDto.setContent(saveBoard.getContent());

        return boardResponseDto;
    }
}
