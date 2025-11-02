package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class SeismicToss extends PhysicalMove {
    private final int hit;
    public SeismicToss(int level) {
        super(Type.FIGHTING, 0, 100); // тип, сила (0), точность (100%)
        this.hit=level;
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {//Метод, применяющий вычисленное повреждение к обороняющемуся покемону
        super.applyOppDamage(def, damage);
        def.setMod(Stat.HP, hit); //этот метод уменьшает здоровье противника на уровень покемончика который атакует
    }

    @Override
    protected String describe() {
        return "использует SeismicToss и наносит урон равный " + hit;
    }
}
