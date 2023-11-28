import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class BallPanel extends JPanel {
    private final Image img;
    private int xCoord;
    private int yCoord;
    private Dimension preferredSize;

    private boolean dirXRight = true;
    private boolean dirYDown = true;
    BallPanel(){
        this.img = new ImageIcon("resources/chrome_ball.png").getImage();
        this.xCoord = -1;
        this.yCoord = -1;
        this.preferredSize = new Dimension(300,200);
    }

    public void left() {
        xCoord -= 5;
        repaint();
    }
    public void right() {
        xCoord += 5;
        repaint();
    }
    public void up() {
        yCoord -= 5;
        repaint();
    }
    public void down() {
        yCoord += 5;
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return preferredSize;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.drawImage(img, xCoord, yCoord, this);
    }
//    public int getxCoord() {
//        return xCoord;
//    }
//
//    public void setxCoord(int xCoord) {
//        this.xCoord = xCoord;
//    }
//
//    public int getyCoord() {
//        return yCoord;
//    }
//
//    public void setyCoord(int yCoord) {
//        this.yCoord = yCoord;
//    }

    public void move(){

        int width = 400;
        int height = 400;
        int dx = 3;
        int dy = 3;
        int radius = 5;
        int x=0;
        int y=0;

//        while(true) {

            if(xCoord+25>width)
                dirXRight=false;
            else
                dirXRight=true;

            if(yCoord+25>height)
                dirYDown=false;
            else
                dirYDown=true;


            if(dirXRight)
                right();
            else
                left();

            if(dirYDown)
                down();
            else
                up();

//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException e){
//                }
//        }
    }
}
