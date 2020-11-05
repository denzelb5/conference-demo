package com.pluralsightspring.conferencedemo.repositories;

import com.pluralsightspring.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
