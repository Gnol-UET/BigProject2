
import java.io.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Vu Ngoc Quy - 10521480
 *         Lab 0
 */
public class User implements Serializable {
    private TableOfJobLists currentTable;
    private JobList currentList;
    private Job currentJob;
    public static List<String> userLogs = new ArrayList<>();
    List<TableOfJobLists> tableOfJobListses;

    public TableOfJobLists getCurrentTable() {
        return currentTable;
    }

    public void setCurrentTable(TableOfJobLists currentTable) {
        this.currentTable = currentTable;
    }

    public JobList getCurrentList() {
        return currentList;
    }

    public void setCurrentList(JobList currentList) {
        this.currentList = currentList;
    }

    public Job getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(Job currentJob) {
        this.currentJob = currentJob;
    }

    public static List<String> getUserLogs() {
        return userLogs;
    }

    public static void setUserLogs(List<String> userLogs) {
        User.userLogs = userLogs;
    }

    public List<TableOfJobLists> getTableOfJobListses() {
        return tableOfJobListses;
    }

    public void setTableOfJobListses(List<TableOfJobLists> tableOfJobListses) {
        this.tableOfJobListses = tableOfJobListses;
    }
    public TableOfJobLists findATable(String tableName){
        for (int i = 0; i < tableOfJobListses.size(); i++) {
            if(tableOfJobListses.get(i).getNameOfTable().equalsIgnoreCase(tableName)){
                return tableOfJobListses.get(i);
            }
        }
        return null;
    }


    public User() {
        tableOfJobListses = new ArrayList<>();
        userLogs.add("User logged in");

    }

    public void switchState() {
        currentJob.setStatus("Done");
    }

    public void addNewJob(Job job) {
        currentList.addJobToCurrentList(job);
    }

    public void editTableName(int tableIndex, String newName) {
        this.tableOfJobListses.get(tableIndex).setNameOfTable(newName);
    }

    public void removeATable(int tableIndex) {
        tableOfJobListses.remove(tableIndex);
    }

    public void addNewTable(String name) {
        TableOfJobLists newTable = new TableOfJobLists();
        newTable.setNameOfTable(name);
        tableOfJobListses.add(newTable);
    }

    public Job createNewJob(String description, String startTime, String endTime, String repeat, String time) throws ParseException {
        if (repeat.equals("Once")) {
            Job job = new Job();
            job.setStatus("To do");
            job.setDescription(description);
            job.setEndTime(Date.valueOf(endTime));
            job.setPriority(0);
            job.setStartTime(Date.valueOf(startTime));
            job.setRepeat(repeat);
            return job;
        } else {
            Job job = new Job();
            SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm");
            job.setHour((java.util.Date) hourFormat.parseObject(time));
            job.setStatus("To do");
            job.setDescription(description);
            job.setPriority(0);
            job.setRepeat(repeat);
            job.setStartTime(null);
            job.setEndTime(null);
            return job;
        }
    }

    public void saveToFile() {
        try {
            File folder = new File("C:/Program Files/MyReminder/data");
            File folder2 = new File("C:/Program Files/MyReminder/");
            File folder3 = new File("C:/Program Files");
            File inFile = new File("C:/Program Files/MyReminder/data/new.admin");
            if (!inFile.exists()) {
                if (!folder3.exists()) folder3.mkdir();
                if (!folder2.exists()) folder2.mkdir();
                if (!folder.exists()) folder.mkdir();
                inFile.createNewFile();
            }
            FileOutputStream outStream = new FileOutputStream(inFile);
            ObjectOutputStream outStreamObj = new ObjectOutputStream(outStream);
            outStreamObj.writeObject(this);
            outStreamObj.close();
        } catch (Exception ee) {
            System.out.println("Bị lỗi: " + ee.getMessage());

        }

    }

    public User readFromFile() throws IOException, ClassNotFoundException {
        File inFile = new File("C:/Program Files/MyReminder/data/new.admin");
        if (!inFile.exists()) {
            this.saveToFile();
        }
        FileInputStream inStream = new FileInputStream(inFile);
        ObjectInputStream ObjInPutStream = new ObjectInputStream(inStream);
        User userAdmin = (User) ObjInPutStream.readObject();
        ObjInPutStream.close();
        return userAdmin;
    }
}
