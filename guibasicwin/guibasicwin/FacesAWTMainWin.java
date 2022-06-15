package guibasicwin;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FacesAWTMainWin {

    public static void main(String[] args) {
        new FacesAWTMainWin();
    }

    FacesAWTMainWin() {
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
        private FaceObj fobj1;

        FaceFrame() {
            fobj1 = new FaceObj();
        }

        public void paint(Graphics g) {

            w = 200;
            h = 200;
            xStart = 50;
            yStart = 50;

            FaceObj fobj = new FaceObj();
            //fobj.drawRim();

            drawRim(g);
            drawBrow(g, 30);
            drawEye(g, 35);
            drawNose(g, 40);
            drawMouth(g, 100);
        }

        public void drawRim(Graphics g) {
            g.drawLine(50, 50, 50 + w, 50);
            g.drawLine(50, 50, 50, 50 + h);
            g.drawLine(50, 50 + h, 50 + w, 50 + h);
            g.drawLine(50 + w, 50, 50 + w, 50 + h);
        }

        public void drawBrow(Graphics g, int bx) {

        }

        public void drawNose(Graphics g, int nx) {

        }

        public void drawEye(Graphics g, int r) {
            g.drawOval(xStart + 45, yStart + 65, r, r);

        }

        public void drawMouth(Graphics g, int mx) {
            int xMiddle = 50 + w / 2;
            int yMiddle = 50 + h - 30;
            g.drawLine(xMiddle - mx / 2, yMiddle, xMiddle + mx / 2, yMiddle);
        }
    }


    private class FaceObj {

    }

}
