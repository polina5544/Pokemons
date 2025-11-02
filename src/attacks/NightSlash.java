package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class NightSlash extends PhysicalMove {
    public NightSlash(){super(Type.DARK, 70,100);}
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {

        double critChance = 1.0 / 8.0;
        if (Math.random() < critChance) {
            return 2.0;  // если выпал критический удар множитель на который умножается повреждение 2
        } else {
            return 1.0;  // если нет критического множитель 1
        }
    }

    @Override
    protected String describe() {
        return "использует Night Slash (повышенный шанс крит-удара)";
    }
}
