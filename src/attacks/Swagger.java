package attacks;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon def) { //Метод для задания дополнительных эффектов, которые накладываются на обороняющегося покемона.
                                                //Должен быть переопределен, если обороняющийся покемон получает какое-либо воздействие, кроме физического повреждения.
        def.setMod(Stat.ATTACK,+2 );
        Effect.confuse(def); //сбивает цель с толку
    }

    @Override
    protected String describe() {
        return "сбивает цель с толку и повышает ее атаку на две ступени!";
    }
}
