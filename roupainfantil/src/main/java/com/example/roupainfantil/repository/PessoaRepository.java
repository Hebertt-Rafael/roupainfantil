package com.example.roupainfantil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.roupainfantil.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
