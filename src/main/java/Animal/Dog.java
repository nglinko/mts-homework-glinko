package Animal;

public class Dog extends Pet{
    public Dog() {
        String[] nickname = {"Шарик", "Тузик", "Барбос", "Мухтар"};
        int j;
        j = (int) (Math.random()*nickname.length); // случайное имя из массива
        name =  (nickname[j]);
        String[] breed1 = {"Пудель", "Овчарка", "Доберман", "Корги"}; //случайная порода
        j = (int) (Math.random()*breed1.length);
        breed =  (breed1[j]);
        String[] character1 = {"Спокойный", "Агрессивный", "Ласковый", "Трусливый"};
        j = (int) (Math.random()*character1.length); // случайный характер
        character =  (character1[j]);

    }
}
