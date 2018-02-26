package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee (){
        super();
        this.empId = 1;
        this.jobTitle = "Programmer";
        this.companyName = "Accenture";
        this.salary = 1000;


    }

    //TODO 2 add getters and setters
    public Employee (int empId, String jobTitle, String companyName, double salary){
        super();
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getEmpId(){
        return  empId;
    }

    public void setEmpId (int empId){
        this.empId = empId;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setCompanyName(){
        this.jobTitle = jobTitle;
    }

    public String getCompanyName(){
        return companyName;

    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;

    }
    public double getSalary(){
        return salary;
    }

    public void setSalary (double salary){
        this.salary = salary;
    }

    public String introduce (){
        String introduction;

        introduction = this.introduce();
        introduction = introduction + "and I work as" + this.jobTitle + "in" + this.companyName;
        return introduction;
    }





}