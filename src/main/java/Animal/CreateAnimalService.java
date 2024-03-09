package Animal;

public class CreateAnimalService {
    public void createAnimal() {
        System.out.println("метод по созданию 10 уникальных животных при помощи цикла while");
        System.out.println("");
        Animal[] animal = new Animal[10];
        int i = 0;
        while (i<10) {
            int type = i%4;
            switch (type) {
                case 0:
                    animal[i] = new Wolf();
                    break;
                case 1:
                    animal[i] = new Shark();
                    break;
                case 2:
                    animal[i] = new Cat();
                    break;
                default:
                    animal[i] = new Dog();
            }
            System.out.println("Животное "+ (i+1) + ": " + animal[i].getClass() + ", " + animal[i].getName() + ", " + animal[i].getBreed() + ", " + animal[i].getCost() + ", " + animal[i].getCharacter());
            i++;
        }
        System.out.println("");
    }


}
