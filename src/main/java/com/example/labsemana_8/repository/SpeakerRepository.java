package com.example.labsemana_8.repository;

import com.example.labsemana_8.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
