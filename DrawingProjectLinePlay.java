import javax.swing.*;
import java.awt.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class DrawingProjectLinePlay {
    public static void draw(Graphics g) {
        int a = 0;
        int b = 50;
        for (int i = 0; i < 16; i++) {
            a += 25;
            b += 20;
            g.drawLine(0, b, a, 400);
            g.drawLine(400, a, b, 0);
        }
    }

    public static void main(String[] args) {  
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(400, 400));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }  

    static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        draw(graphics);
    }
}

}
