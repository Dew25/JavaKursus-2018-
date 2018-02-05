package graphics;
import javax.swing.*;
public class Swing1Runner {
    public static void main(String[] args){
       JFrame window1=new JFrame("First window");
       JPanel manager1=new JPanel(new java.awt.GridLayout(1, 2));
       manager1.add(new Swing1());
       manager1.add(new Swing1());
       window1.getContentPane().add(manager1);
       window1.setSize(300, 200);
       window1.setVisible(true);
       window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
