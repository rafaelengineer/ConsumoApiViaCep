package com.accenture.consumo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;
// import javax.transaction.Transactional;

import com.accenture.consumo.model.Endereco;

//@Repository
public interface CepRepository extends JpaRepository<Endereco, Integer>{

}
