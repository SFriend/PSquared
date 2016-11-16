/**
 * Created by peter on 16.11.16.
 */
public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        Enemy enemy = new Enemy();
        Enemy enemy2 = new Enemy();
        player.attack(enemy);
        System.out.println(player.getHitPoints());
        System.out.println(enemy.getHitPoints());
    }
}
