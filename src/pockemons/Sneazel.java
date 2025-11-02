package pockemons;

import attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sneazel extends Pokemon {
    public Sneazel(String name, int level) {
        super(name, level);
        setType(Type.DARK, Type.ICE);
        setStats(55, 95, 55, 35, 75, 115);
        setMove(new XScissor(), new Swagger(), new AerialAce());
    }
}
