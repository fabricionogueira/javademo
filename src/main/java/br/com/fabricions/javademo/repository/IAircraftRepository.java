package br.com.fabricions.javademo.repository;

import br.com.fabricions.javademo.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAircraftRepository extends JpaRepository<Aircraft, String> {
}
