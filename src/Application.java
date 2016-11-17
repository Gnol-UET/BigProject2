import javax.swing.*;
import java.io.IOException;
import java.text.ParseException;

public class Application {


    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
        //create new user
        User2 newUser = new User2();
        // add a new List named HomeWork
        newUser.saveToFile();
        System.out.println("hello");
        Frame1 frame1 = new Frame1();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}