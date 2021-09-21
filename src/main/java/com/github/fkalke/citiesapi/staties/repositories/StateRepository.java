package com.github.fkalke.citiesapi.staties.repositories;

import com.github.fkalke.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
