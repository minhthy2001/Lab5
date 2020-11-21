import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Project {
    private String projectId;
    private Date startDay;
    private Date endDay;
    ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();

    public Project (String projectId,Date starDay,Date endDay){
        this.projectId=projectId;
        this.startDay=starDay;
        this.endDay=endDay;
    }

    public String getProjectId() {
        return projectId;
    }

    public Date getStartDay() {
        return startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public long estimateBudget(){
        long budget = 0;
        for (Employee e : listOfEmployee){
            budget += e.getSalaryPerHour()*24*7;
        }
        long milliSecondsElapsed = endDay.getTime() - startDay.getTime();
        long dif = TimeUnit.HOURS.convert(milliSecondsElapsed, TimeUnit.MILLISECONDS);
        return budget * dif;
    }
    @Override
    public String toString() {
        return "[ProjectID: " + projectId + " - Project Duration: " + startDay + " to " + endDay +"]";
    }
}
