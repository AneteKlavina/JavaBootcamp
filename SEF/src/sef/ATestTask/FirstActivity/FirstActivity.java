package sef.ATestTask.FirstActivity;


public class FirstActivity {
    public static void main(String[] args){

        Employee[] employees = new Employee [6];

        employees[0] = new Employee(23, "Programmer", "TTT", 2000);
        employees[1] = new Employee(24, "Programmer", "TTT", 1700);
        employees[2] = new Employee(25, "Programmer", "TTT", 1500);
        employees[3] = new Employee(26, "Team Lead", "TTT", 1000);
        employees[4] = new Employee(27, "Manager", "TTT", 500);
        employees[5] = new Employee(28, "Janitor", "TTT", 50);

        //employees[4].setSalary(4000);

        bubbleSort(employees);

        //Employee JanisEmployee; JanisEmployee = (Employee) Janis;

        System.out.println("Array After Bubble Sort");
        for (int i=0; i<employees.length; i++){
            System.out.println(employees[i].getSalary()+"");
        }
    }


        public static void bubbleSort (Employee[] arr){
        int n = arr.length;
        Employee tempEmpl;
        for (int i=0; i<n; i++){
            for (int j=1; j<(n-1); j++){
                if(arr[j-1].getSalary() > arr[j].getSalary()){
                    tempEmpl = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tempEmpl;
                }
            }
        }
    }
}




