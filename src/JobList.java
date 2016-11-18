import java.util.ArrayList;
import java.util.List;

/**
 * List of job in a table
 */
public class JobList {
    static int numberOfList = 0;
    private List<Job> list ;
    private String name;
    private int index;
    public JobList(){
        numberOfList ++;
        name = "DefaultList" + numberOfList;
        list = new ArrayList<>();
        index = numberOfList;
    }
    public JobList(String newJobListName){
        numberOfList ++;
        name = newJobListName;
        list = new ArrayList<>();
        index = numberOfList;
    }
    public void addJobToCurrentList(Job job){
        list.add(job);
    }

    public List<Job> getList() {
        return list;
    }

    public Job findAJob(String nameOfJobToFind){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equalsIgnoreCase(nameOfJobToFind)){
                return list.get(i);
            }
        }
        return null;
    }
    public void setList(List<Job> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
