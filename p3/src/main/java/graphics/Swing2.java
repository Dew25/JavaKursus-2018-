package graphics;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.net.URL;

public class Swing2 extends JPanel 
        implements MouseListener, ActionListener{
    double centerx=100;
    double centery=100;
    double r=5;
    double speedx=2;
    Timer t;
    private BufferedImage bi;
    public Swing2(){
      try{
       addMouseListener(this);
       t=new Timer(500, this);
       t.start();
       bi = ImageIO.read(new URL("http://minitorn.tlu.ee/~jaagup/kool/java/javalogo52x88.gif"));
      } catch (Exception ex){
           ex.printStackTrace();
      }
    }
    @Override 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==t){
          centerx+=speedx;
          if(centerx>getWidth()){
            speedx=-Math.abs(speedx);
          }
          if(centerx<0){
            speedx=Math.abs(speedx);
          }
        }
        repaint();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        //if click inside circle
        //put circle to random place
        double dx=e.getX()-centerx;
        double dy=e.getY()-centery;
        if(dx*dx+dy*dy<r*r){
           centerx=r;
        }
        //centerx=e.getX();
        //centery=e.getY();
        repaint();
        
        System.out.println((int)(50*Math.random()));
        System.out.println(this.getWidth());
    }
    @Override
    public void paintComponent(Graphics g0){
        super.paintComponent(g0);
        Graphics2D g=(Graphics2D)g0;
        g.drawImage(bi, (int)centerx, (int)centery, this);
        g.drawOval((int)(centerx-r), (int)(centery-r), 
                 (int)(2*r), (int)(2*r));
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}  
    //add JFrame to display oval
    public static void main(String[] arg){
       JFrame f=new JFrame();
       f.getContentPane().add(new Swing2());
       f.setSize(300, 200);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
