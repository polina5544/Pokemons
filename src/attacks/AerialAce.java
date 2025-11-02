package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class AerialAce extends PhysicalMove {
    public AerialAce(){super(Type.FLYING, 80, 100);}

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true; // возвращает вероятность, что покемон не промахнулся, но этот попадает всегда
    }
    @Override
    protected String describe() {
        return "Без промаха рассек воздух, попал в цель точно!";
    }

}
