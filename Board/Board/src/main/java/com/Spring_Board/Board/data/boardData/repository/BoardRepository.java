package com.Spring_Board.Board.data.boardData.repository;

import com.Spring_Board.Board.data.boardData.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
