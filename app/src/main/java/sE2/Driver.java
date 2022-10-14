/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sE2;

import ProffSkillsAssignment1.Course;
import ProffSkillsAssignment1.Lecturer;
import ProffSkillsAssignment1.Student;
import ProffSkillsAssignment1.Module;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author eamon
 */
public class Driver {
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Module> modList =new ArrayList<Module>();
    ArrayList<Course> courseList = new ArrayList<Course>();
    ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
    
    public Driver(){
            
        
            LocalDate semStart = LocalDate.of(2022, 9, 7);
            LocalDate semFinish = LocalDate.of(2023, 5, 1);
            
            Course c1= new Course("Computer Science",modList,semStart,semFinish);
            Course c2= new Course("Information Technology",modList,semStart,semFinish);
            Course c3= new Course("Computer Studys",modList,semStart,semFinish);
            
            
            courseList.add(c1);
            courseList.add(c2);
            courseList.add(c3);
        
        
            LocalDate DOB=LocalDate.of(2001, 1, 8);
            Student s1 = new Student("Bob",21, DOB,135243,modList,courseList.get(1));
            DOB=LocalDate.of(2000, 2, 8);
            Student s2 = new Student("Bill",22, DOB,135243,modList,courseList.get(2));
            DOB=LocalDate.of(2002, 1, 6);
            Student s3 = new Student("Frank",20, DOB,135243,modList,courseList.get(0));
            DOB=LocalDate.of(2003, 4, 7);
            Student s4 = new Student("Mary",19, DOB,135243,modList,courseList.get(2));
            DOB=LocalDate.of(2005, 4, 7);
            Student s5 = new Student("Mauve",19, DOB,135243,modList,courseList.get(0));
            
            Lecturer l1=new Lecturer("JohnSmith",34,DOB,676765,modList);
            DOB=LocalDate.of(1995, 4, 7);
            Lecturer l2=new Lecturer("Jimjones",34,DOB,676765,modList);
            DOB=LocalDate.of(1990, 4, 7);
            Lecturer l3=new Lecturer("JackWith",34,DOB,676765,modList);
            DOB=LocalDate.of(1982, 4, 7);
            Lecturer l4=new Lecturer("JoBritte",34,DOB,676765,modList);
            DOB=LocalDate.of(1956, 4, 7);
            Lecturer l5=new Lecturer("JayTrossard",34,DOB,676765,modList);
            DOB=LocalDate.of(1976, 4, 7);
            
            students.add(s1);
            students.add(s2);
            students.add(s3);
            students.add(s4);
            students.add(s5);
            
            lecturers.add(l1);
            lecturers.add(l2);
            lecturers.add(l3);
            lecturers.add(l4);
            lecturers.add(l5);
            
            
            Module mod1 = new Module("Data Stuctures",4216,students,courseList,lecturers.get(1));
            Module mod2 = new Module("Programming",4516,students,courseList,lecturers.get(1));
            Module mod3 = new Module("Calculus",4716,students,courseList,lecturers.get(1));
            Module mod4 = new Module("Modelling",4816,students,courseList,lecturers.get(1));
            
            modList.add(mod1);
            modList.add(mod2);
            modList.add(mod3);
            modList.add(mod4);
            
            
            
            
        }
        
        public ArrayList<Course> getCourse(){
            return courseList;
            
        }

    public ArrayList<Student> getStudents() {
        return students;
    }
        
    }
    
    
    
        
    


