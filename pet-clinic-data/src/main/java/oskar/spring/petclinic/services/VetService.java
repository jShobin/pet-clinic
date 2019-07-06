package oskar.spring.petclinic.services;

import oskar.spring.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
     Vet findById(Long id);
     Vet save(Vet vet);

     Set<Vet> findall();
}
