package Animal;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService createAnimalService = new CreateAnimalService(){};
        createAnimalService.createAnimal();
        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl(){};
        createAnimalServiceImpl.createAnimalFor(8);
        createAnimalServiceImpl.createAnimal();
    }
}
