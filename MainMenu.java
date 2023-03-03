import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame{
    MainMenu(){

        // JLabel
        JLabel imageLabel = new JLabel();
        ImageIcon tologo = new ImageIcon("snik.jpeg");
        imageLabel.setIcon(tologo);
         // Add image to frame
         this.add(imageLabel);
         
          // JButton
         JButton button = new JButton();
         button.setText("Play");
         button.setFont(new Font("Arial", Font.BOLD, 25));
         button.setFont(new Font("Arial", Font.BOLD, 20));

         EventHandler handler = new EventHandler();

         button.addActionListener(handler);
         // Add button to frame
         this.add(button);
         
        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1020,1080);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(Color.BLACK);
          // lock frame
        this.setResizable(false);
    }

    // Event Handler
    private class EventHandler implements ActionListener{
        public void actionPerformed(ActionEvent event) {
        
            // open color menu frame
            new ColorMenu();
            // Close main menu frame
            dispose();
        }
    }
}
