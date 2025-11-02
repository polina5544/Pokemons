package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;


    public class IronHead extends PhysicalMove {
        public IronHead() {
            super(Type.STEEL, 80, 100);
        }

        @Override
        protected void applyOppEffects(Pokemon def) {
            if (Math.random() < 0.3)
                Effect.flinch(def); // покемон напугается и вздрогнет
        }

        @Override
        protected String describe() {
            return "Aтакует головой из стали!";
        }
    }
