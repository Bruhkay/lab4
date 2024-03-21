import javax.swing.*;
import java.awt.*;
public class Ship extends JPanel{
    private int xCordinates;
    private int yCordinates;
    private int objectWidth = 30;
    private int objectHeight = 25;
    private int health = 3;
    private int points = 0;

    Ship(){
        setSize(objectWidth,objectHeight);
        setBackground(Color.YELLOW);
    }
    public void draw(Graphics g){
        g.fillRect(xCordinates, yCordinates, objectWidth, objectHeight);
    }
    public int getObjectHeight() {
        return objectHeight;
    }
    public int getObjectWidth() {
        return objectWidth;
    }
    public int getxCordinates() {
        return xCordinates;
    }
    public int getyCordinates() {
        return yCordinates;
    }
    public int getHealth() {
        return health;
    }public int getPoints() {
        return points;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    
}
