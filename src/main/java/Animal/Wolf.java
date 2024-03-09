package Animal;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Wolf extends Predator{
    public Wolf() {
        String[] nickname = {"Шарик", "Серый", "Вайт", "Акелла"};
        int j;
        j = (int) (Math.random()*nickname.length); // случайное имя из массива
        name =  (nickname[j]);
        String[] breed1 = {"Серый волк", "Красный волк", "Гривистый волк", "Тасманский волк"}; //случайная порода
        j = (int) (Math.random()*breed1.length);
        breed =  (breed1[j]);
        String[] character1 = {"Спокойный", "Агрессивный"};
        j = (int) (Math.random()*character1.length); // случайный характер
        character =  (character1[j]);

    }
}
