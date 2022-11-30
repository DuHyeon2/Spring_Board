package com.Spring_Board.Board.data.boardData.dto;

import lombok.Getter;
import lombok.Setter;


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

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
