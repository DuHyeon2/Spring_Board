package com.Spring_Board.Board.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Board {

    @Id
    @GeneratedValue
    private Long number;

    private String name;

    private String title;

    private String content;
}
