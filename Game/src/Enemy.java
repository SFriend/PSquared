/**
 * Created by peter on 16.11.16.
 */
public class Enemy extends Entity {
    private int count;

    Enemy(String name, int level) {
        super(name, level);
    }

    public int getCount() {
        return count;
    }
}
