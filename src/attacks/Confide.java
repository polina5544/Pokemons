package attacks;


import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Confide extends PhysicalMove {
    public Confide() {
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        def.setMod(Stat.SPECIAL_ATTACK, -1);//Confide снижает показатель «Специальной атаки» формула та же, но вместо этих параметров участвуют другие статы

    }
    @Override
    protected String describe() {
        return "Pаскрывает цели секрет, цель теряет способность концентрироваться, специальная атака снижена на 1 ступень!";
    }
}
