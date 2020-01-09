package oskar.spring.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import oskar.spring.petclinic.model.Owner;
import oskar.spring.petclinic.model.Vet;
import oskar.spring.petclinic.services.OwnerService;
import oskar.spring.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
private final OwnerService ownerService;
private final VetService vetService;
    //@Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
    Owner owner1 = new Owner();
    owner1.setFirstName("Oskar");
    owner1.setLastName("Fabian");
    ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Krzysztof");
        owner2.setLastName("Kangurek");
        ownerService.save(owner2);

        System.out.println("Load owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Magda");
        vet1.setLastName("Propka");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Mariusz");
        vet2.setLastName("Lepczak");
        vetService.save(vet2);


        System.out.println("Load Vets");
    }
}
