package com.pos.pos.repository;

import org.springframework.data.repository.CrudRepository;
import com.pos.pos.models.Validation;

import java.util.Optional;

public interface ValidationRepository extends CrudRepository<Validation, Integer> {

    Optional<Validation> findByCode(String code);
}
