package com.pluralsightspring.conferencedemo.repositories;

import com.pluralsightspring.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
