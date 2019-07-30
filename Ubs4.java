 
package ubs4;
//////////////////////////////////////////////////////final 
 class Student {
                                          
    public String name;                   
    public String specialisation;        
 
    public final int id;                  
    private static int studentsCounter;    
    public Student(String name, String specialisation) {
        this.name = name;
        this.specialisation = specialisation;
 
        studentsCounter++;               
        id = studentsCounter;              
    }
  
    public void printStudentInfo() {
        System.out.println("Student: " +name);
        System.out.println("ID: " +id);
        System.out.println("Specialization: " +specialisation);
        System.out.println("------------------------------");
    }
 
   
    public static void printTotalNumberOfStudents() {
        System.out.println("The Total number of Students is: " +studentsCounter);
    }
 
}
public class Ubs4 {
 
    public static void main(String[] args) {
    Student s1 = new Student("Mhamad", "Computer Science");
        Student s2 = new Student("Hala"  , "Computer Science");
        Student s3 = new Student("Marwan", "IT");
        Student s4 = new Student("Ahmad" , "Civil Engineer");
        Student s5 = new Student("Salam" , "Telecom");
 
      
        s1.printStudentInfo();
        s2.printStudentInfo();
        s3.printStudentInfo();
        s4.printStudentInfo();
        s5.printStudentInfo();
  
        Student.printTotalNumberOfStudents();
 
    }
    
}
