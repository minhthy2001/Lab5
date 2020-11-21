import java.util.Date;

public class ProjectPrinter implements Runnable{
    private Project project;

    public ProjectPrinter(Project project){
        this.project=project;
    }
    @Override
    public void run() {
        System.out.println(project.toString());
        try {
            for (Employee e: project.getListOfEmployee()){
                System.out.print("Project ID: " + project.getProjectId() + " Project Duration: " + project.getStartDay() + " to " + project.getEndDay());
                System.out.println(e.toString());
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException | IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("System interrupted");
        }
    }
}
