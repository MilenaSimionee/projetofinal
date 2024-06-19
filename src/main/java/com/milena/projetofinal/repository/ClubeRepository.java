package com.milena.projetofinal.repository;


import com.milena.projetofinal.entity.Clube;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ClubeRepository extends JpaRepository<Clube, Long> {
    List<Clube> findByNome(String state);
}
