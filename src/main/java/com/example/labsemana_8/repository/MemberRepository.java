package com.example.labsemana_8.repository;

import com.example.labsemana_8.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
