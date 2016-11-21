/**
 * Created by peter on 16.11.16.
 */
public abstract class Entity {
    private String name;
    private int level = 1, exp;
    private int hitPoints = 100;
    private int baseATK = 10, baseDef = 3;
    private boolean alive = true;

    Entity(String name, int level) {
        this.name = name;
        this.level = level;
    }

    void attack(Entity e) {
        e.takeDmg(getATK());
        if (!e.isAlice()) addEXP(e.getLevel());
    }

    private void takeDmg(int dmg) {
        hitPoints -= dmg / getDef();
        if (hitPoints <= 0)
            alive = false;
    }

    private void levelUp() {
        level++;
    }

    void addEXP(int level) {
        exp += level * 10;
        if (exp >= maxLevel()) {
            System.out.println("#level up#");
            exp = exp - maxLevel();
            levelUp();
        }
    }

    private int maxLevel() {
        return 100 * ((10 + (level-1)) / 10);
    }

    private int getATK() {
        return baseATK * ((10 + (level-1)) / 10);
    }

    private int getDef() {
        return baseDef * ((10 + (level-1)) / 10);
    }

    private int getLevel() {
        return level;
    }

    private int getHitPoints() {
        return hitPoints;
    }

    boolean isAlice() {
        return alive;
    }

    void setAlive(boolean alive) {
        this.alive = alive;
    }

    void printStats() {
        System.out.println("##:" + name + ":##");
        System.out.println("HP:\t\t" + getHitPoints());
        System.out.println("DEF:\t" + getDef());
        System.out.println("ATK:\t" + getATK());
        System.out.println("LVL:\t" + level);
        System.out.println("EXP:\t" + exp);
        System.out.println("####");
    }
}
