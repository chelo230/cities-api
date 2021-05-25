package com.github.chelo230.citiesapi.countries;

import com.github.chelo230.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country,Long> {
}
