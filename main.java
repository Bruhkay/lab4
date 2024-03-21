import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.*;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * main
 */
public class main {


    static String namem = "";
    static int speedm = -1;
    public static void main(String[] args) {

        
        JFrame game = new JFrame("gameee");
        JPanel gamepanel;
        game.setLayout(new BorderLayout());
        gamepanel = new GamePanel(namem, speedm);
        game.setSize(600,600);
        gamepanel.setPreferredSize(new Dimension(600,600));
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.add(gamepanel, BorderLayout.CENTER);
        game.setVisible(true);

        /* JFrame autFrame = new JFrame("Ship game");
        autFrame.setLayout(new GridLayout(3,1));
        autFrame.setSize(300,200);
        autFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel row1 = new JPanel(new GridLayout(1,2));
        JPanel row2 = new JPanel(new GridLayout(1,2));

        JLabel nameLabel = new JLabel("Name: ", SwingConstants.CENTER);
        JTextField nameTextField = new JTextField();
        nameTextField.addActionListener(e -> namem = nameTextField.getText());
        row1.add(nameLabel);
        row1.add(nameTextField);

        JLabel speedLabel = new JLabel("Speed: ", SwingConstants.CENTER);
        JTextField speedTextField = new JTextField();
        speedTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    speedm = Integer.parseInt(speedTextField.getText()); // Update the speed variable
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Speed must be a number!");
                    
                }
            }
            
        });
        
        row2.add(speedLabel);
        row2.add(speedTextField);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane caution = new JOptionPane();
                if(namem.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Name cannot be empty!!!");
                }
                else if( speedm ==-1){
                    JOptionPane.showMessageDialog(null, "Enter speed!");
                }
                else{

                    JFrame game = new JFrame("gameee");
                    JPanel gamepanel;
                    game.setLayout(new BorderLayout());
                    autFrame.setVisible(false);
                    gamepanel = new GamePanel(namem, speedm);
                    game.setSize(600,600);
                    gamepanel.setPreferredSize(new Dimension(600,600));
                    game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    game.add(gamepanel, BorderLayout.CENTER);
                    game.setVisible(true);
                    
                }
            }
        });
        autFrame.add(row1);
        autFrame.add(row2);
        autFrame.add(startButton);
        
        autFrame.setVisible(true); */

    }
}