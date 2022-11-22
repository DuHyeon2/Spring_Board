package com.Spring_Board.Board.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardResponseDto {

    private Long number;

    private String name;

    private String title;

    private String content;

    public BoardResponseDto() {
    }

    public BoardResponseDto(Long number, String name, String title, String content) {
        this.number = number;
        this.name = name;
        this.title = title;
        this.content = content;
    }
}
