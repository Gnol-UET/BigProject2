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
        newUser.addNewTable("bang1");
        newUser.setCurrentTable(newUser.findATable("bang1"));
        newUser.getCurrentTable().addJobToCurrentTable(new JobList("list1"));

        newUser.setCurrentList(newUser.getCurrentTable().findAJobList("list1"));
        newUser.getCurrentList().addJobToCurrentList(new Job("job1"));

        newUser.setCurrentJob(newUser.getCurrentList().findAJob("job1"));




        Frame1 frame1 = new Frame1();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}