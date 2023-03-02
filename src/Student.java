public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount = 0;
    public Student(String f, String l, int a, int y){
        this.firstName = f;
        this.lastName = l;
        this.age = a;
        this.yearLevel = y;
        this.id = studentCount++;
    }
    public int getId(){return id;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public int getAge(){return age;}
    public int getYearLevel(){return yearLevel;}
    public int getStudentCount(){return studentCount;}
    public void setFirstName(String f){firstName = f;}
    public void setLastName(String l){lastName = l;}
    public void setAge(int a){age = a;}
    public void setYearLevel(int y){yearLevel = y;}
    public void setId(int i){id = i;}
    public boolean equals(Student s){
        if(firstName == s.firstName){
            if(lastName == s.lastName){
                if(age == s.age){
                    if(yearLevel == s.yearLevel){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public String toString(){return "Student{id=" + id + ", firstName='" + firstName + "'" + ", lastName='" + lastName + "'" + ", age="+ age +"}";}


}
