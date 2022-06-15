package guibasicwin;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FaceAWTSingleWin {

    public static void main(String[] args) {
        new FaceAWTSingleWin();
    }

    FaceAWTSingleWin() {
        FaceFrame f = new FaceFrame();
        f.setSize(800, 800);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }


    class FaceFrame extends Frame {

        private int w;
        private int h;
        private int xStart;
        private int yStart;

        public void paint(Graphics g) {

            w = 200;
            h = 200;
            xStart = 50;
            yStart = 50;

            drawRim(g);
            drawBrow(g, 30);
            drawEye(g, 10);
            drawNose(g, 40);
            drawMouth(g, 100);
        }

        public void drawRim(Graphics g) {
            g.setColor(Color.ORANGE);
            g.fillRoundRect(55, 55, w - 10, h - 10, 20, 20);
            //g.drawLine(50, 50, 50+w, 50);
            //g.drawLine(50, 50, 50, 50+h);
            //g.drawLine(50, 50+h, 50+w, 50+h);
            //g.drawLine(50+w, 50, 50+w, 50+h);
            g.setColor(Color.black);
        }

        public void drawBrow(Graphics g, int bx) {
            g.drawLine(50 + 40, 50 + 100, 50 + 30 + 30, 50 + 100);
        }

        public void drawNose(Graphics g, int nx) {

        }

        public void drawMouth(Graphics g, int mx) {
            int xMiddle = 50 + w / 2;
            int yMiddle = 50 + h - 20;
            g.drawLine(xMiddle - mx / 2, yMiddle, xMiddle + mx / 2, yMiddle);
        }

        public void drawEye(Graphics g, int r) {

            g.fillOval(xStart + 45, yStart + 110, r, r);


        }

    }

}
