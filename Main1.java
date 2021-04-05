package sample;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javafx.application.Application;
import javafx.stage.Stage;
import java.awt.GridLayout;

import java.net.URL;
import javax.swing.JFrame;

public class Main1 extends Application {

    @Override


    public void start(Stage primaryStage) throws Exception{


        URL url=new URL("http://52.255.170.184:8008/api/b1desk/getQrCodeImage");
        Image image = ImageIO.read(url);

        JLabel label3 = new JLabel(new ImageIcon(image));
        JFrame frame = new JFrame("Royal Sundaram");
        MyCanvas m =new MyCanvas();
        JLabel label2 = new JLabel("Royal Sundaram");
        label2.setBounds(30,30, 100,50);
        label2.setAlignmentX(15);
        frame.add(label2);
        label2.setForeground(Color.YELLOW);
        frame.getContentPane().add(label3, BorderLayout.CENTER);
        frame.add(label3);
        frame.setUndecorated(true);
        frame.setSize(1366, 768);
        frame.add(label3);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);

    }

        public static void main(String[] args) {
        launch(args);
         }

    private class MyCanvas {

     }

}
