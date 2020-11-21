import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date start = new Date(2020, Calendar.JULY,12,6,00);
        Date end = new Date(2021,Calendar.JANUARY,27 ,6,00);
        Project project = new Project("PJ1",start,end);
        ProjectPrinter projectPrinter = new ProjectPrinter(project);
        projectPrinter.run();
    }
}
