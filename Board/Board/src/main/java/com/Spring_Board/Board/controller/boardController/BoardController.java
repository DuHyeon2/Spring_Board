package com.Spring_Board.Board.controller.boardController;

import com.Spring_Board.Board.data.boardData.dto.BoardDto;
import com.Spring_Board.Board.data.boardData.dto.BoardResponseDto;
import com.Spring_Board.Board.service.boardService.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/getBoard")
    public ResponseEntity<BoardResponseDto> getBoard(Long number){
        BoardResponseDto boardResponseDto = boardService.getBoard(number);
        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }

    @PostMapping("/postBoard")
    public ResponseEntity<BoardResponseDto> postBoard(@RequestBody BoardDto boardDto){
        BoardResponseDto boardResponseDto = boardService.saveBoard(boardDto);
        return ResponseEntity.status(HttpStatus.OK).body(boardResponseDto);
    }

}
