import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
    
    protected int speed;
    protected String name;
    private Timer zaman;
    ArrayList<InteractableDrawing> listObjects;
    

    GamePanel(String namem, int speedm){
        ActionListener listener = new timerr();
        zaman = new Timer(5, listener);
        zaman.start();

        listObjects = new ArrayList<InteractableDrawing>();

        this.name= namem;
        this.speed = speedm;
        setBackground(Color.BLUE);
        MouseListener takip = new mouseListener();
        addMouseListener(takip);
        setBackground(Color.BLUE);
    }
    public void paintComponent(Graphics g){

    }
    public void createShip(){
    }
    public void createBomb(){
        JPanel bomb = new Bomb();
        listObjects.add((InteractableDrawing)bomb);
        
    }
    public void createApple(){
        JPanel apple = new Apple();
        listObjects.add((InteractableDrawing)apple);
        
    }

    class timerr implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();    
        }
        
    }
    class mouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }

}
