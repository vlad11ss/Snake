package Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private final int Width = 400;
    private final int Height = 400;
    public MainWindow(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int screenW = dimension.width;
        int screenH = dimension.height;
        setTitle("Snake");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(screenW /2 -Width/ 2,screenH/2 - Height/2 );
        add(new GameField());

        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mv = new MainWindow();
    }
}