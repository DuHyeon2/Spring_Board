package com.Spring_Board.Board.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {

    private String name;

    private String title;

    private String content;

    public BoardDto(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;
    }
}
