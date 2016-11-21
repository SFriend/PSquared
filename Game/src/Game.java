/**
 * Created by peter on 16.11.16.
 */
public class Game {
    public static void main(String[] args) {
        Player player = new Player("Peter1", 5);
        Enemy enemy = new Enemy("Peter2", 1);
        Enemy enemy2 = new Enemy("Hurensohn", 100);
        while (enemy.isAlice()) {
            player.attack(enemy);
        }
        player.printStats();
        enemy.printStats();
    }
}
