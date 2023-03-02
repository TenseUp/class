import java.lang.reflect.Array;
import java.util.*;
public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students = new ArrayList();
    public ClassSection(String s, int c, int y){
        this.subject = s;
        this.capacity = c;
        this.yearLevel = y;
    }
    public String getSubject(){return subject;}
    public int getCapacity(){return capacity;}
    public int getYearLevel(){return yearLevel;}
    public ArrayList<Student> getStudents(){return students;}
    public void setSubject(String s){subject = s;}
    public void setCapacity(int c){capacity = c;}
    public void setYearLevel(int y){yearLevel = y;}
    public void addStudent(Student s){if(!students.contains(s) && s.getYearLevel() == yearLevel){students.add(s);}}
    public void removeStudent(Student s){students.remove(s);}
    public boolean isStudentEnrolled(Student s){if(students.contains(s)){return true;} else {return false;}}
    public String toString(){return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", students=" + students + "}";}
}
