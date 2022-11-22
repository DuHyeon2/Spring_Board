package com.Spring_Board.Board.data.repository;

import com.Spring_Board.Board.data.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
