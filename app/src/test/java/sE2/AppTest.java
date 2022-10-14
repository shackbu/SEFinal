package sE2;
import ProffSkillsAssignment1.Course;
import ProffSkillsAssignment1.Lecturer;
import ProffSkillsAssignment1.Student;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest{
    
   
    
    
    @Test
    public void testGetUsername2() {
        System.out.println("getUsername");
        
        LocalDate DOB=LocalDate.of(2001, 1, 8);
        ArrayList<ProffSkillsAssignment1.Module> modList =new ArrayList<ProffSkillsAssignment1.Module>();
        Lecturer l1=new Lecturer("JohnSmith",34,DOB,676765,modList);
        
        String expResult = "JohnSmith34";
        String result = l1.getUsername();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetUsername() {
        ArrayList<ProffSkillsAssignment1.Module> modList =new ArrayList<ProffSkillsAssignment1.Module>();
        System.out.println("getUsername");
        
        LocalDate semStart = LocalDate.of(2022, 9, 7);
        LocalDate semFinish = LocalDate.of(2023, 5, 1);
        
        Course c1= new Course("Computer Science",modList,semStart,semFinish);
        
        ArrayList<Course> courseList = new ArrayList<Course>();
        LocalDate DOB=LocalDate.of(2001, 1, 8);
        
        Student student1 = new Student("Bob",21, DOB,135243,modList,c1);
        
        String expResult = "Bob21";
        String result = student1.getUsername();
        assertEquals(expResult, result);
    }

    
}
