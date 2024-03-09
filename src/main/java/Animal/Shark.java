package Animal;

public class Shark extends Predator{
    public Shark() {
        String[] nickname = {"У рыб нет имен"};
        int j;
        j = (int) (Math.random()*nickname.length); // случайное имя из массива
        name =  (nickname[j]);
        String[] breed1 = {"Тигровая", "Акула-бык", "Синяя", "Катран"}; //случайная порода
        j = (int) (Math.random()*breed1.length);
        breed =  (breed1[j]);
        String[] character1 = {"Не удалось определить"};
        j = (int) (Math.random()*character1.length); // случайный характер
        character =  (character1[j]);

    }

}
