/**
 * Created by peter on 16.11.16.
 */
public abstract class Entity {
    private String name;
    private int level = 1, exp;
    private int hitPoints = 100;
    private int attackDamage = 10, defence = 3;
    private boolean alive = true;

    public void attack(Entity e) {
        e.takeDmg(attackDamage);
    }

    public void takeDmg(int dmg) {
        hitPoints -= dmg / defence;
        if (hitPoints <= 0)
            alive = false;
    }

    public void setDefence(int def) {
        defence = def;
        if (def < 1) defence = 1;
    }

    public void lebelUp() {
        level++;
        attackDamage += attackDamage * 1.2;
    }

    public int getLevel() {
        return level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    boolean isAlice() {
        return alive;
    }

    void setAlive(boolean alive) {
        this.alive = alive;
    }
}
