import javax.swing.*;
import java.awt.*;

import javax.swing.JComponent;
public class Ship {
    private int xCordinates = 100;
    private int yCordinates = 100;
    private int objectWidth = 30;
    private int objectHeight = 25;
    private int health = 3;
    private int points = 0;

    Ship(){
       
    }
    public void draw(Graphics g){
        
        g.setColor(Color.YELLOW);
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
    public void setDamage() {
        this.health -=1;
    }
    public void appendPoints() {
        this.points += 1;
    }
    public void moveTo(int x, int y)
    {
       xCordinates = x;
       yCordinates = y;   
    }
    
}
