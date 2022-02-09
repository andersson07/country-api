package com.projetodio.citiesapi.states.repository;

import com.projetodio.citiesapi.states.entities.States;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository <States, Long> {

}
