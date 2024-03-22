import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.awt.Graphics2D;
import java.awt.Shape;

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

    Ship ship = new Ship();
    
    MouseMotionListener takip = new mouseListener();
    

    GamePanel(String namem, int speedm){

        ActionListener listener = new timerr();
        zaman = new Timer(5, listener);
        zaman.start();

        listObjects = new ArrayList<InteractableDrawing>();

        this.name= namem;
        this.speed = speedm;
        this.setBackground(Color.BLUE);
        addMouseMotionListener(takip);

        
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.BLUE);
        ship.draw(g);
        
    }
    public void createBomb(){
        Bomb bomb = new Bomb();
        listObjects.add((InteractableDrawing)bomb);
        
    }
    public void createApple(){
        Apple apple = new Apple();
        listObjects.add((InteractableDrawing)apple);
        
    }

    class timerr implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //zaman
        }
        
    }
    class mouseListener implements MouseMotionListener{
        @Override
        public void mouseDragged(MouseEvent e) {
         
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            System.out.println(e.getX());
            ship.moveTo(x, y);
            repaint();
        }
        
    }

}
