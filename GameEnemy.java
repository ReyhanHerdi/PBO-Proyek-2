public class GameEnemy {
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    GameEnemy(){
        width = 0;
        height = 0;
        positionX = 0;
        positionY = 0;

    }

    GameEnemy(double widhth1, double height1){
        width = widhth1;
        height = height1;
    }

    GameEnemy(double widhth1, double height1, int positionX1, int positionY1){
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
        System.out.println("Enemy is running");
        
    }
}
