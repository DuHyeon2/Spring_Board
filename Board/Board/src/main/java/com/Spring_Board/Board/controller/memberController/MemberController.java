package com.Spring_Board.Board.controller.memberController;

import com.Spring_Board.Board.data.memberData.dto.MemberDto;
import com.Spring_Board.Board.data.memberData.dto.MemberResponseDto;
import com.Spring_Board.Board.service.memberService.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/login")
    public ResponseEntity<MemberResponseDto> loginMember(@RequestParam String email,
                                                         @RequestParam String password){
        MemberResponseDto memberResponseDto = memberService.loginMember(email,password);

        return ResponseEntity.status(HttpStatus.OK).body(memberResponseDto);
    }

    @PostMapping("/join")
    public ResponseEntity<MemberResponseDto> joinMember(@RequestBody MemberDto memberDto){
        MemberResponseDto memberResponseDto = memberService.joinMember(memberDto);

        return ResponseEntity.status(HttpStatus.OK).body(memberResponseDto);
    }
}
