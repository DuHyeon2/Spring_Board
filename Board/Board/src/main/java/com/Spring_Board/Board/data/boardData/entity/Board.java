package com.Spring_Board.Board.data.boardData.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

//    @Column(nullable = false)
    private String name;

//    @Column(nullable = false)
    private String title;


//    @Column(nullable = false)
    private String content;

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
