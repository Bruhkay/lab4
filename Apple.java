import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Apple extends JComponent implements InteractableDrawing{

    private int xCordinates;
    private int yCordinates;
    private int objectWidth = 30;
    private int objectHeight = 25;
    Apple(){
        setSize(objectWidth,objectHeight);
        setBackground(Color.LIGHT_GRAY);
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveLeft'");
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(xCordinates, yCordinates, WIDTH, HEIGHT);
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
