package edu.asu.diging.spring5.example.core.data;

import org.springframework.data.repository.CrudRepository;

import edu.asu.diging.spring5.example.core.model.Cat;

public interface CatRepository extends CrudRepository<Cat, Long> {

}
