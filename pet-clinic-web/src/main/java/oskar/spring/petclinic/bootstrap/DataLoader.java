package oskar.spring.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import oskar.spring.petclinic.model.Owner;
import oskar.spring.petclinic.model.Pet;
import oskar.spring.petclinic.model.PetType;
import oskar.spring.petclinic.model.Vet;
import oskar.spring.petclinic.services.OwnerService;
import oskar.spring.petclinic.services.PetTypeService;
import oskar.spring.petclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
private final OwnerService ownerService;
private final VetService vetService;
private final PetTypeService petTypeService;
    //@Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);
        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);
    Owner owner1 = new Owner();
    owner1.setFirstName("Katarzyna");
    owner1.setLastName("Rurek");
    owner1.setAddress("East Coast");
    owner1.setCity("Jelcz");
    owner1.setTelephone("790-250-010");
    ownerService.save(owner1);
        Pet kasiaPet = new Pet();
        kasiaPet.setPetType(savedCatPetType);
        kasiaPet.setOwner(owner1);
        kasiaPet.setBirthDate(LocalDate.now());
        kasiaPet.setName("Mruczek");
        owner1.getPets().add(kasiaPet);
        Owner owner2 = new Owner();
        owner2.setFirstName("Krzysztof");
        owner2.setLastName("Kangurek");
        owner1.setAddress("West Coast");
        owner1.setCity("Jelcz");
        owner1.setTelephone("790-210-101");
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
