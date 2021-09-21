package com.github.fkalke.citiesapi.countries.repository;

import com.github.fkalke.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
