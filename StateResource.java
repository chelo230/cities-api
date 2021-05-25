package com.github.chelo230.citiesapi.states;

import com.github.chelo230.citiesapi.countries.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {

    private StateRepository repository;


    public StateRepository(final StateRepository repository) {
         this.repository =repository;
        }


    @GetMapping
    public List<State> states() {
        return repository.findAll();

    }
}
