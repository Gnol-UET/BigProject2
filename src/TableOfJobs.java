

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Vu Ngoc Quy - 10521480
 *         Lab 0
 */
public class TableOfJobs implements Serializable {
    static int numberOfTable = 0;
    private int index ;
    private String nameOfTable ;
    private List<Job> toDoList ;
    private List<Job> doingList ;
    private List<Job> doneList ;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public TableOfJobs(){
        numberOfTable ++;
        nameOfTable = " DefaultTable" + numberOfTable;
        toDoList = new ArrayList<>();
        doingList = new ArrayList<>();
        doneList = new ArrayList<>();
        index = numberOfTable;
    }

    public String getNameOfTable() {
        return nameOfTable;
    }

    public void setNameOfTable(String nameOfTable) {
        this.nameOfTable = nameOfTable;
    }

    public List<Job> getToDoList() {
        return toDoList;
    }

    public void setToDoList(List<Job> toDoList) {
        this.toDoList = toDoList;
    }

    public List<Job> getDoingList() {
        return doingList;
    }

    public void setDoingList(List<Job> doingList) {
        this.doingList = doingList;
    }

    public List<Job> getDoneList() {
        return doneList;
    }

    public void setDoneList(List<Job> doneList) {
        this.doneList = doneList;
    }

    public boolean switchState(Job job){
        if(job.getStatus().equals("Todo"))
        {
            job.setStatus("Doing");
            return true;
        }
        else if(job.getStatus().equals("Doing")){
            job.setStatus("Done");
            return true;
        }
            else
                return false;
    }
    public void addANewJob(Job job){
        getToDoList().add(job);
    }
}
