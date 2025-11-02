package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nuzzle extends PhysicalMove {
    public Nuzzle(){
        super(Type.ELECTRIC,20,10);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect.paralyze(def);
    }
    @Override
    protected String describe() {
        return "Атакует электрифицированными щеками в цель! Цель парализована!";
    }
}
