package pockemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.*;

    public class Passimian extends Pokemon {
        public Passimian(String name, int level) {
            super(name, level);
            setStats(100, 120, 90, 40, 60, 80);  // HP, Atk, Def, SpAtk, SpDef, Speed
            setType(Type.FIGHTING);
            setMove(new SeismicToss(level), new IronHead(), new Swagger(),new Rest());
        }
    }
