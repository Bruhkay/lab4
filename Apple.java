import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
public class Apple  implements InteractableDrawing{

    private int xCordinates= 600;
    private int yCordinates;
    private int objectWidth = 30;
    private int objectHeight = 25;
    Apple(){
        yCordinates = (int)(Math.random()*600);
    }
    @Override
    public boolean intersects(Ship s) {
        if((xCordinates+objectWidth> s.getxCordinates() && s.getxCordinates()+ s.getObjectWidth()> xCordinates)&&
        (s.getyCordinates()+ s.getObjectHeight()> yCordinates && yCordinates+objectHeight> s.getyCordinates())){
            return true;
        }
        return false;
    }

    @Override
    public void interact(Ship s) {
        s.appendPoints();
        
    }

    @Override
    public boolean moveLeft(int speed) {
        xCordinates -= 1;
        if(xCordinates<=0){
            return true;
        }
        return false;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(xCordinates, yCordinates, objectWidth, objectHeight);
        g.setColor(Color.RED);
        g.fillOval(xCordinates, yCordinates, objectWidth, objectHeight);
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
    
}
