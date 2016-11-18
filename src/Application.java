import javax.swing.*;
import java.io.IOException;
import java.text.ParseException;

public class Application {


    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
        //create new user
        User user = new User();
        // add a new List named HomeWork
        user.saveToFile();
        System.out.println("hello");
        user.addNewTable("bang1");
        user.setCurrentTable(user.findATable("bang1"));
        user.getCurrentTable().addJobToCurrentTable(new JobList("list1"));

        user.setCurrentList(user.getCurrentTable().findAJobList("list1"));
        user.getCurrentList().addJobToCurrentList(new Job("job1"));

        user.setCurrentJob(user.getCurrentList().findAJob("job1"));




        Frame1 frame1 = new Frame1();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}