package com.Spring_Board.Board.data.memberData.dao.daoImple;

import com.Spring_Board.Board.data.memberData.dao.MemberDAO;
import com.Spring_Board.Board.data.memberData.dto.MemberResponseDto;
import com.Spring_Board.Board.data.memberData.entity.Member;
import com.Spring_Board.Board.data.memberData.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MemberDAOImpl implements MemberDAO {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberDAOImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member joinMember(Member member) {
        Member joinMember = memberRepository.save(member);
        return joinMember;
    }

    @Override
    public Member loginMember(String email, String password) {
        Optional<Member> loginMember = memberRepository.findByEmailAndPassword(email, password);

        return loginMember.get();
    }
}
