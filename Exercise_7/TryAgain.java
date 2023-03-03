import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TryAgain extends JFrame{
    TryAgain(){

    JButton tryAgainButton = new JButton();
    tryAgainButton.setText("PLAY AGAIN");
    tryAgainButton.setFont(new Font("Arial", Font.BOLD,25));
    EventHandler handler = new EventHandler();
    tryAgainButton.addActionListener(handler);

    JButton exitButton = new JButton();
    exitButton.setText("EXIT");
    exitButton.setFont(new Font("Arial", Font.BOLD,25));
    ExitHandler handlerr = new ExitHandler();
    exitButton.addActionListener(handlerr);


    this.setLayout(new FlowLayout());

    this.add(tryAgainButton);
    this.add(exitButton);
    
      //Frame Layout
      this.setLayout(new FlowLayout());
      //Frame Title  
      this.setTitle("Snake Game");
      //Terminates java program on close
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      //Frame size
      this.setSize(500, 500);
      //Puts frame in the middle
      this.setLocationRelativeTo(null);
      //Make frame appear
      this.setVisible(true);
      //Disable resize
      this.setResizable(false);
      //Set backround color
      this.getContentPane().setBackground(Color.GREEN);




    }
    private class  EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            // Goes to GameFrame
            new GameFrame();
    
            //Closes Frame
            dispose();
        }
    
      }
      private class  ExitHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            //Closes Frame
            dispose();
        }
    
      }
}
