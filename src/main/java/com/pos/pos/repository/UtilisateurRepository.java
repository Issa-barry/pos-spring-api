package com.pos.pos.repository;

import org.springframework.data.repository.CrudRepository;
import com.pos.pos.models.Utilisateur;

import java.util.Optional;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {
    Optional<Utilisateur> findByEmail(String email);
}
