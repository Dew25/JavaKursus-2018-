package graphics;
import javax.swing.*;
import java.awt.*;
public class Swing1 extends JPanel{
    @Override
    public void paintComponent(Graphics g){
       g.drawRect(10, 20, 30, 40);
    }    
}
