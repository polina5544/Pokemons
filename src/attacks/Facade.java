package attacks;

import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {//Метод для расчета базового повреждения. Стандартное базовое повреждение зависит от уровня атакующего покемона (level) и энергии атаки (power)
        if (att.getCondition() == Status.BURN ||
                att.getCondition() == Status.POISON ||
                att.getCondition() == Status.PARALYZE) {
            return super.calcBaseDamage(att, def) * 2.0; //вызывает уже существующую формулу урона из PhysicalMove
        } else {
            return super.calcBaseDamage(att, def);
        }
    }

    @Override
    protected String describe() {
        return "Атакует с удвоенной силой уже ослабшего покемона!";
    }
}