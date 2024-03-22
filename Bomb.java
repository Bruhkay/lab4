import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Bomb extends JComponent implements InteractableDrawing{

    private int xCordinates;
    private int yCordinates;
    private int objectWidth = 30;
    private int objectHeight = 25;
    Bomb(){
        setSize(objectWidth,objectHeight);
        setBackground(Color.RED);
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
    }

    @Override
    public boolean moveLeft(int speed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveLeft'");
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(xCordinates, yCordinates, objectWidth,objectHeight);
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
