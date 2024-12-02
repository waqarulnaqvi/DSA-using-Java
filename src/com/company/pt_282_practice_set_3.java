//import javax.swing.*;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//
//class Arrowkeys {
//    public Arrowkeys() {
//        JFrame frame = new JFrame();
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400,400);
//        frame.setFocusable(true);
//        JPanel panel=new JPanel();
//        JLabel up=new JLabel();
//        JLabel down=new JLabel();
//        JLabel left=new JLabel();
//        JLabel right=new JLabel();
//
//        panel.add(up);
//        panel.add(down);
//        panel.add(right);
//        panel.add(left);
//
//        up.setText("UP : 0");
//        down.setText("Down : 0");
//        left.setText("Right : 0");
//        right.setText("Left : 0");
//
//        frame.addKeyListener(new KeyListener() {
//                                 int upcount = 0;
//                                 int downcount = 0;
//                                 int leftcount = 0;
//                                 int rightcount = 0;
//
//                                 @Override
//                                 public void keyTyped(KeyEvent e) {
//
//                                 }
//
//                                 @Override
//                                 public void keyPressed(KeyEvent e) {
//                                     int keycode = e.getKeyCode();
//                                     switch (keycode) {
//                                         case KeyEvent.VK_UP:
//                                             up.setText("Up: " + Integer.toString(upcount++));
//                                             break;
//                                         case KeyEvent.VK_DOWN:
//                                             up.setText("Down: " + Integer.toString(downcount++));
//                                             break;
//                                         case KeyEvent.VK_RIGHT:
//                                             up.setText("Right: " + Integer.toString(rightcount++));
//                                             break;
//                                         case KeyEvent.VK_LEFT:
//                                             up.setText("Left: " + Integer.toString(leftcount++));
//                                             break;
//
//                                     }
//
//                                 }
//
//                                 @Override
//                                 public void keyReleased(KeyEvent e) {
//
//                                 }
//
//                             }
//
//        frame.add(panel);
//
//    }
//}
//public class pt_282_practice_set_3 {
//
//    public static void main(String[] args) {
//new Arrowkeys();
//    }
//}
