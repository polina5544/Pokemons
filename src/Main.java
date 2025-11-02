import ru.ifmo.se.pokemon.*;
import pockemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon passimian= new Passimian("Обезьяна", 20);
        Pokemon sneazel = new Sneazel("Синяя обезьяна", 30);
        Pokemon weavile = new Weavile("Баклажан", 50);

        Pokemon pichu= new Pichu("Бананчик", 10);
        Pokemon raichu = new Raichu("Брат Пикачу", 30);
        Pokemon pikachu = new Pikachu("Кролик", 50);

        b.addFoe(passimian);
        b.addFoe(sneazel);
        b.addFoe(weavile);

        b.addAlly(pichu);
        b.addAlly(raichu);
        b.addAlly(pikachu);

        b.go();
    }
}