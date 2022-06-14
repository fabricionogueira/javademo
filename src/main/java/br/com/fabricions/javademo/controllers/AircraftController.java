package br.com.fabricions.javademo.controllers;

import br.com.fabricions.javademo.model.Aircraft;
import br.com.fabricions.javademo.repository.IAircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/aircraft")
public class AircraftController {

    @Autowired
    private IAircraftRepository aircraftRepository;

    @GetMapping("all")
    public List<Aircraft> findAll() {
        return aircraftRepository.findAll();
    }

}
