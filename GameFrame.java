import java.awt.*;
import javax.swing.*;
public class GameFrame extends JFrame {
    JPanel gamepanel;
    GameFrame(String namem, int speedm){
        setLayout(new BorderLayout());
        gamepanel = new GamePanel(namem, speedm);
        gamepanel.setPreferredSize(new Dimension(600,600));
        gamepanel.setBounds(0,0,600,600);
        gamepanel.setBackground(Color.BLUE);
        setBackground(Color.RED);
        
        add(gamepanel, BorderLayout.CENTER);
    }
}
