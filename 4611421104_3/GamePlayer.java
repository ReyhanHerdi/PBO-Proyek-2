import java.util.Scanner;

public class GamePlayer {
    private double width;
    private double height;
    private int positionX;
    private int positionY;
    String running;

    Scanner input = new Scanner(System.in);

    GamePlayer(){
        width = 0;
        height = 0;
        positionX = 0;
        positionY = 0;

    }

    GamePlayer(double widhth1, double height1){
        width = widhth1;
        height = height1;
    }

    GamePlayer(double widhth1, double height1, int positionX1, int positionY1){
        width = widhth1;
        height = height1;
        positionX = positionX1;
        positionY = positionY1;
    }

    void setDimension(double width1, double height1){
        width = width1;
        height = height1;
    }

    void setPosition(int positionX1, int positionY1){
        positionX = positionX1;
        positionY = positionY1;
    }

    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }   

    int getX(){
        return positionX;
    }

    int getY(){
        return positionY;
    }

    void Run(){
        System.out.println("Player is running");
        
    }

    void Run(int incrementX){
        System.out.print("R/L/U/D to move: ");
        running = input.next();

        if (running.equals("r")) {
            positionX += 10;
        } else if (running.equals("l")) {
            positionX -= 10;
        } else if (running.equals("u")) {
            positionY += 10;
        } else if (running.equals("d")) {
            positionY -= 10;
        } else {
            positionX = positionX; 
        }
        incrementX = positionX + positionY;

        System.out.println("Player still running with current position: " + incrementX);
    }  
}