package com.Spring_Board.Board.service.memberService.memberServiceImpl;

import com.Spring_Board.Board.data.memberData.dao.MemberDAO;
import com.Spring_Board.Board.data.memberData.dto.MemberDto;
import com.Spring_Board.Board.data.memberData.dto.MemberResponseDto;
import com.Spring_Board.Board.data.memberData.entity.Member;
import com.Spring_Board.Board.service.memberService.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    private final MemberDAO memberDAO;

    @Autowired
    public MemberServiceImpl(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public MemberResponseDto joinMember(MemberDto memberDto) {
        /*
        클라이언트에서 컨트롤로로 전달된 값이 memberDto로 저장 및 서비스로 전달
        서비스에서 엔티티로 바꾸기 위해 memberDto의 값을 가져옴
         */
        Member member = new Member();
        member.setEmail(memberDto.getEmail());
        member.setName(memberDto.getName());
        member.setPassword(memberDto.getPassword());
        /*
        엔티티로 전달된 값을 DAO에서 DB에 저장함
         */
        Member joinMember = memberDAO.joinMember(member);

        /*
        이후 다시 사용자에게 보여주기위해 ResponseDto 생성
        ResponseDto에 DB에 전달된 entity 데이터를 Dto로 저장
         */
        MemberResponseDto memberResponseDto = new MemberResponseDto();
        memberResponseDto.setNumber(joinMember.getNumber());
        memberResponseDto.setEmail(joinMember.getEmail());
        memberResponseDto.setName(joinMember.getName());
        memberResponseDto.setPassword(joinMember.getPassword());

        return memberResponseDto;
    }

    @Override
    public MemberResponseDto loginMember(String email, String password) {
        Member member = memberDAO.loginMember(email, password);

        MemberResponseDto memberResponseDto = new MemberResponseDto();
        memberResponseDto.setNumber(member.getNumber());
        memberResponseDto.setEmail(member.getEmail());
        memberResponseDto.setName(member.getName());
        memberResponseDto.setPassword(member.getPassword());

        return memberResponseDto;
    }
}
