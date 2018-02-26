package sef.ATestTask.FirstActivity;


//TODO Implement class Student

public class Student{
    private String firsName;
    private String secondName;
    private int age;

   public Student(){
       this.firstName="Unknown";
       this.secondName="Unknown";
       this.age=0;
   }

   public Student (String firstName, String secondName, int age){
       this.firstName=firstName;
       this.secondName=secondName;
       this.age=age;
   }

   public String getFirsName(){
       return firsName;
   }

   public void setFirsName(String firsName){
       this.firstName=firstName;
   }

   public int getAge(){
       return age;
   }

   public void setAge (int age){
       this.age = age;
   }

   public String getSecondName (){
       return secondName;
   }

   public void setSecondName(String secondName){
       this.secondName = secondName;
   }

   public String introduce(){
       String introduction;

       introduction = "I am study in university <RTU>";
   }
}

