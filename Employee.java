public class Employee implements Comparable<Employee> {
    private String employeeId;
    private String employeeName;
    private int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;

    public Employee (String employeeId,String employeeName,int salaryPerHour,int noOfLeavingDay,int noOfTravelDay){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salaryPerHour=salaryPerHour;
        this.noOfLeavingDay=noOfLeavingDay;
        this.noOfTravelDay=noOfTravelDay;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }
    public int calculateWeeklySalary(){
        return salaryPerHour*8*(5-noOfLeavingDay+noOfTravelDay/2);
    }
    public int compareTo(Employee that){
        if (this.noOfTravelDay > that.noOfTravelDay){
            return 1;
        }
        else if (this.noOfTravelDay < that.noOfTravelDay){
            return -1;
        }
        else {
            if (this.noOfLeavingDay > that.noOfLeavingDay){
                return 1;
            }
            else if (this.noOfLeavingDay < that.noOfLeavingDay){
                return -1;
            }
            else return 0;
        }
    }
    public String toString(){
        return "[Name: " + employeeName + " - Salary Per Hour: " + salaryPerHour + " - Weekly salary: " + calculateWeeklySalary() + "]";
    }
}
