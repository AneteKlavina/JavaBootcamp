package sef.ATestTask.FirstActivity;


public class FirstActivity {
    public static void main(String[] args, Employee[] employess){

        Employee[] employees = new Employee [6];
        employess [0] = new Employee("Janis", "Programmer", "TTT", 500);
        employess [1] = new Employee("Janis", "Programmer", "TTT", 600);
        employess [2] = new Employee("Janis", "Programmer", "TTT", 750);
        employess [3] = new Employee("Janis", "Team Lead", "TTT", 1000);
        employess [4] = new Employee("Janis", "Manager", "TTT", 2000);
        employess [5] = new Employee("Janis", "Janitor", "TTT", 50);

        bubbleSort(employees);

        Employee JanisEmployee; JanisEmployee = (Employee) Janis;

        System.out.println("Array After Bubble Sort");
        for (int i=0; i<employees.length; i++);
        System.out.print(employees[i].getSalary()+"");


    }

    public void bubbleSort (Employee[] arr){
        int n = arr.length;
        double temp;
        for (int i=0; i<n; i++){
            for (int j=1; j<(n-1); j++){
                if(arr[j-1].getSalary()>arr[j].getSalary()){

                    temp=arr[j-1].getSalary();
                    arr[j-1].setSalary(arr[j].getSalary());
                    arr[j].setSalary(temp);
                }
            }
        }

    }
}




