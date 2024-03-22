import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Bomb implements InteractableDrawing{

    private int xCordinates = 600;
    private int yCordinates;
    private int objectWidth = 30;
    private int objectHeight = 25;
    Bomb(){
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
        s.setDamage();
        if(s.getHealth()==0){
            JOptionPane.showConfirmDialog(null,"you died" + "Points: "+s.getPoints());
        }
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
        g.setColor(Color.RED);
        g.fillRect(xCordinates, yCordinates, objectWidth,objectHeight);
        g.setColor(Color.BLACK);
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
