package io.ext.springpetclinic.services;

import io.ext.springpetclinic.model.Owner;
import io.ext.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
