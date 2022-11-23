package com.Spring_Board.Board.data.memberData.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberResponseDto {
    private Long number;

    private String email;

    private String name;

    private String password;

    public MemberResponseDto() {
    }

    public MemberResponseDto(Long number, String email, String name, String password) {
        this.number = number;
        this.email = email;
        this.name = name;
        this.password = password;
    }


}
