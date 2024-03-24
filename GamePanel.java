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

    Ship ship;
    
    MouseMotionListener takip = new mouseListener();
    JFrame kk;

    GamePanel(String namem, int speedm, JFrame kk){


        listObjects = new ArrayList<InteractableDrawing>();

        this.name= namem;
        this.speed = speedm;
        this.setBackground(Color.BLUE);
        this.kk = kk;
        ActionListener listener = new timerr();
        zaman = new Timer(10/speed+1, listener);
        zaman.start();
        ship = new Ship(namem, kk);
        addMouseMotionListener(takip);

        
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.BLUE);
        ship.draw(g);
        for (InteractableDrawing x : listObjects) {
            x.draw(g);
        }
        
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
            for (int i = 0; i< listObjects.size() ; i++) {
                listObjects.get(i).moveLeft(speed);
                if(listObjects.get(i).intersects(ship)){
                    listObjects.get(i).interact(ship);
                    listObjects.remove(i);

                }
            }
            if((int)(Math.random()*80) >=79){
                createBomb();
            }
            if((int)(Math.random()*80) >=79){
                createApple();
            }
            
        }
        
    }
    class mouseListener implements MouseMotionListener{
        @Override
        public void mouseDragged(MouseEvent e) {
         
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            int x = e.getX()-25;
            int y = e.getY()-25;
            ship.moveTo(x, y);
            repaint();
        }
        
    }

}
