package Animal;

public class Cat extends Pet {
    public Cat() {
        String[] nickname = {"Мурзик", "Мурка", "Васька", "Пакетик"};
        int j;
        j = (int) (Math.random()*nickname.length); // случайное имя из массива
        name =  (nickname[j]);
        String[] breed1 = {"Абиссинская", "Бенгальская", "Британская короткошёрстная", "Домашняя", "Сиамская"}; //случайная порода
        j = (int) (Math.random()*breed1.length);
        breed =  (breed1[j]);
        String[] character1 = {"Спокойный", "Агрессивный", "Ласковый", "Трусливый"};
        j = (int) (Math.random()*character1.length); // случайный характер
        character =  (character1[j]);

    }
}
