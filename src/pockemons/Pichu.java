package pockemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.*;


    public class Pichu extends Pokemon {
        public Pichu(String name, int level) {
            super(name, level);
            setStats(20, 40, 15, 35, 35, 60);  // HP, Atk, Def, SpAtk, SpDef, Speed
            setType(Type.ELECTRIC);
            setMove(new Rest(),new Confide());
        }
    }

