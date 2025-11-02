package pockemons;
import ru.ifmo.se.pokemon.Type;


public final class Weavile extends Sneazel {
    public Weavile(String name, int level) {
       super(name,level);
       setType(Type.DARK, Type.ICE);
       setStats(70,120,65,45,85,125);
       setMove();
    }
}
