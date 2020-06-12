package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Veiculo;

@Repository
public interface VeiculosRepository extends JpaRepository <Veiculo, Long> {

}
