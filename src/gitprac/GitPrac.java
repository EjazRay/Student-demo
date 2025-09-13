/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gitprac;

/**
 *
 * @author ejazr
 */
public class GitPrac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student [] studentList = new Student[3]; 
        
        
        Student s1 = new Student(); 
        s1.setsName("Alex"); 
        s1.setEmail("alex@test");
        s1.setsId(101);
        
        Student s2 = new Student(); 
        s2.setsName("James");
        s2.setEmail("james@test");
        s2.setsId(102); 
        
        Student s3 = new Student(); 
        s3.setsName("Jimmy");
        s3.setEmail("jimmy@test"); 
        s3.setsId(103); 
        
        studentList[0] = s1; 
        studentList[1] = s2; 
        studentList[2] = s3; 
        
        System.out.println(studentList.length);
     
        for(Student stu: studentList){
            System.out.println(stu.getsName());
            System.out.println(stu.getsId());
            System.out.println(stu.getEmail());
        }
    
}
}
