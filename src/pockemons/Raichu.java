package pockemons;

import ru.ifmo.se.pokemon.Type;

public class Raichu extends Pikachu{
    public Raichu(String name, int level){
        super(name,level);
        setStats(60,90,55,90,80,110);
        setType(Type.ELECTRIC);
        setMove();
    }
}
