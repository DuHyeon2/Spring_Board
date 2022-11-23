package com.Spring_Board.Board.service.memberService;

import com.Spring_Board.Board.data.memberData.dto.MemberDto;
import com.Spring_Board.Board.data.memberData.dto.MemberResponseDto;
import com.Spring_Board.Board.data.memberData.entity.Member;

public interface MemberService {
    MemberResponseDto joinMember(MemberDto memberDto);

    MemberResponseDto loginMember(String email, String password);
}
