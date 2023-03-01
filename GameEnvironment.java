import java.util.ArrayList;
import java.lang.Math;

public class GameEnvironment {
    private double widhth;
    private double height;
    private ArrayList<GamePlayer> arrPlayer;
    private ArrayList<GameEnemy> arrEnemy;

    GameEnvironment(){
        widhth = 0;
        height = 0;

        arrPlayer = new ArrayList<GamePlayer>();
        arrEnemy = new ArrayList<GameEnemy>();

    }

    ArrayList<GamePlayer> GetArrPlayer(){
        return arrPlayer;
    }

    ArrayList<GameEnemy> GetArrEnemy(){
        return arrEnemy;
    }

    GameEnvironment(double widhth1, double height1){
        widhth = widhth1;
        height = height1;
    }

    void addPlayer(GamePlayer gp){
        arrPlayer.add(gp);
    }

    void removePlayer(GamePlayer gp){
        arrPlayer.remove(gp);
    }

    void getAllPlayers(){
        for (int i = 0; i < arrPlayer.size(); i++) {
            arrPlayer.get(i);
        }
        System.out.println("All of players: " + arrPlayer);
    }

    void addEnemy(GameEnemy ge){
        arrEnemy.add(ge);
    }

    void removeEnemy(GameEnemy ge){
        arrEnemy.remove(ge);
    }

    void getAllEnemies(){
        for (int i = 0; i < arrEnemy.size(); i++) {
            arrEnemy.get(i);
        }
        System.out.println("All of enemies: " + arrEnemy);
    }

    void interaction(){
        if (arrPlayer.isEmpty() || arrEnemy.isEmpty()){
            System.out.println("Player or enemy not set");
        }
        else {
            for (int i = 0; i < arrPlayer.size(); i++) {
                for (int j = 0; j < arrEnemy.size(); j++) {
                    if (arrPlayer.get(i).getY() != arrEnemy.get(j).getY()) {
                        System.out.println("Player: " + arrPlayer.get(i) + " and Enemy: " + arrEnemy.get(j) + " not in the same Y position");
                    }
                    else if (EuclideanDistance(arrPlayer.get(i).getX(), arrPlayer.get(i).getY(), arrEnemy.get(j).getX(), arrEnemy.get(j).getY()) < 2) {
                        System.out.println("Player: " + arrPlayer.get(i) + " Attacked");
                        System.out.println("Enemy: " + arrEnemy.get(j) + " loses");
                        removeEnemy(arrEnemy.get(j));
                    }
                    else {
                        System.out.println("==> Player " + arrPlayer.get(i));
                        arrPlayer.get(i).Run((int) Math.ceil(Math.random() * 10));
                        System.out.println("current x position = " + arrPlayer.get(i).getX() + " <==");
                    }
                }
            }
        } 
    }

    int EuclideanDistance(int x1, int x2, int y1, int y2){
        int d1 = x2 - x1;
        int d2 = y2 - y1;
        double doubleDistance = Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2));

        int intDistance = (int)doubleDistance;
        
        return intDistance;
        
    }

}
