package oskar.spring.petclinic.services;

import oskar.spring.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService <Owner, Long> {

    Owner findByLastName(String lastName);



}
