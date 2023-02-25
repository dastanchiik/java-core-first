import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGame extends JFrame implements ActionListener {


    private Timer timer;
    private int x = 0;
    private int y = 0;

    public SimpleGame() {
        super("Простая игра");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 400));
        pack();
        setLocationRelativeTo(null);

        timer = new Timer(10, this);
        timer.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleGame();
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }

    public void actionPerformed(ActionEvent e) {
        x++;
        y++;

        if (x > getWidth() || y > getHeight()) {
            x = 0;
            y = 0;
        }

        repaint();
    }
}
