package oskar.spring.petclinic.services.map;

import oskar.spring.petclinic.model.Vet;
import oskar.spring.petclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
    super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

}
