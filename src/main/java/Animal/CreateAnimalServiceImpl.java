package Animal;

public class CreateAnimalServiceImpl extends CreateAnimalService {
    // перегружаемый метод
    public void createAnimalFor(int j) {
        System.out.println("метод по созданию " + j + " уникальных животных при помощи цикла for");
        System.out.println("");
        Animal[] animal = new Animal[j];
        for (int i=0;i<j;i++) {
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
        }
        System.out.println("");
    }

    //переопределенный метод
    @Override
    public void createAnimal() {
        System.out.println("метод по созданию 10 уникальных животных при помощи цикла do-while");
        System.out.println("");
        Animal[] animal = new Animal[10];
        int i = 0;
        do {
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
        } while (i<10);
        System.out.println("");
    }

}
