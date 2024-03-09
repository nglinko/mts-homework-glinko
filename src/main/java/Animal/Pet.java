package Animal;

public class Pet extends AbstractAnimal{
    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public Double getCost() {
        cost = Math.random()*1000;            // генерация случайной стоимости
        double scale = Math.pow(10, 2);
        cost = Math.ceil(cost * scale) / scale;
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }
}
