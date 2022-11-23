package com.Spring_Board.Board.service.boardService.boardServiceImpl;

import com.Spring_Board.Board.data.boardData.dao.BoardDAO;
import com.Spring_Board.Board.data.boardData.dto.BoardDto;
import com.Spring_Board.Board.data.boardData.dto.BoardResponseDto;
import com.Spring_Board.Board.data.boardData.entity.Board;
import com.Spring_Board.Board.service.boardService.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
    private final BoardDAO boardDAO;

    @Autowired
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
        board.setTitle(boardDto.getTitle());
        board.setContent(boardDto.getContent());

        Board saveBoard = boardDAO.insertBoard(board);

        BoardResponseDto boardResponseDto = new BoardResponseDto();
        boardResponseDto.setNumber(saveBoard.getNumber());
        boardResponseDto.setName(saveBoard.getName());
        boardResponseDto.setTitle(saveBoard.getTitle());
        boardResponseDto.setContent(saveBoard.getContent());

        return boardResponseDto;
    }
}
