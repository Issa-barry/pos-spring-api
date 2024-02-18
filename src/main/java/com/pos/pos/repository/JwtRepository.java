package com.pos.pos.repository;

import com.pos.pos.models.Jwt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JwtRepository extends JpaRepository<Jwt, Long> {
}
