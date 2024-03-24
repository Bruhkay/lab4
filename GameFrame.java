import java.awt.*;
import javax.swing.*;
public class GameFrame extends JFrame {
    JPanel gamepanel;
    public static int FRAME_WIDTH = 600;
    public static int FRAME_HEIGHT = 600;
    protected static String skor = "";
    GameFrame(String namem, int speedm){
        setTitle(skor);
        setLayout(new BorderLayout());
        gamepanel = new GamePanel(namem, speedm, this);
        gamepanel.setPreferredSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
        add(gamepanel, BorderLayout.CENTER);

    }
    public void settitle(){
        this.setTitle(skor);
    }
}
