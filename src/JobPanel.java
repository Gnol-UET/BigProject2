import javax.swing.*;
import java.awt.*;

/**
 * @author Vu Ngoc Quy - 10521480
 *         Lab 0
 */
public class JobPanel extends JPanel {
    public JobPanel(Job job) {
        setLayout(new FlowLayout());
        JLabel description = new JLabel(job.getDescription());
        ImageIcon switchButtonIcon = new ImageIcon(new ImageIcon("png/repeat-1.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        JButton switchStateButton = new JButton("Hello");
        //switchStateButton.setSize(100,100);
        //switchStateButton.setIcon(switchButtonIcon);
        ImageIcon expandIcon = new ImageIcon("");
        JButton expandButton = new JButton("Hola ");
        ///expandButton.setSize(100,100);
        //expandButton.setIcon(expandIcon);
        add(description);
        add(switchStateButton);
        add(expandButton);
    }

    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        Job job1 = new Job();
        myFrame.getContentPane().add(new JobPanel(job1));
        myFrame.setSize(660, 440);
        myFrame.setTitle("panel trial 1");
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
