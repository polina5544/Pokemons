package attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon att) {
        att.setCondition(new Effect().condition(Status.SLEEP).turns(2)); //устанавливает состояние покемона, это из класса Effect, setCondition устанавливает состояние покемона из класса Pockemon
        att.setMod(Stat.HP,(int)Math.round(-att.getHP())); //setMod - изменение характеристики покемона нужен - что б было не отнятие очков а прибавление. getHP() возвращает вещественное число
    }

    @Override
    protected String describe() {
        return "Покемон полностью востановился, хорошо выспался в течении 2х ходов:)";
    }
}
