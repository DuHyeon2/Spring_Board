package com.Spring_Board.Board.data.memberData.repository;

import com.Spring_Board.Board.data.memberData.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmailAndPassword(String email, String password);
}
