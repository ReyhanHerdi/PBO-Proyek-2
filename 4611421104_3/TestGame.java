public class TestGame {
    public static void main(String[] args) {
        GamePlayer player = new GamePlayer();
        GameEnemy enemy = new GameEnemy();
        
        while (player.getX() <= 100 ) {
            enemy.Run();
            player.Run();
            player.Run(0);

            
        }

        System.out.println(player.getX());
    }
}
