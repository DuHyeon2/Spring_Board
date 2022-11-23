package com.Spring_Board.Board.data.memberData.dao;

import com.Spring_Board.Board.data.memberData.entity.Member;

public interface MemberDAO {
    Member joinMember(Member member);

    Member loginMember(String email, String password);
}
