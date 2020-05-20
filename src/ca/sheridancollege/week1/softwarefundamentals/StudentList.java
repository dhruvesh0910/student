/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author Dell
 */
public class StudentList {
    public static void main(String[] args) {
        
        //1. Create an array of 5 students
            Student[] sList = new Student[5];
        
        //2. Added 5 names to the array
            for(int i=0; i < sList.length; i++)
            {
                sList[i] = new Student();
                sList[i].setName("Student "+(i+1));
                sList[i].setEmail("student" + (i+1) + "@xyz.com");
            }
            
        //3. Print the Students name
            for(Student s:sList)
            {
                System.out.println("Student name is: " + s.getName());
                System.out.println("Student email is: " + s.getEmail());
            }
    }
            
}
