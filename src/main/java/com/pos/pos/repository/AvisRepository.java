package com.pos.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pos.pos.models.Avis;

public interface AvisRepository extends JpaRepository<Avis, Integer> {
}
