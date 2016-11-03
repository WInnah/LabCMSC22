import java.io.Serializable;

/**
 * Created by Winnah Gwen Acal on 11/3/2016.
 */
public class Student implements Serializable{
    private String StudentNumber;
    private String firstName;
    private char middleInitial;
    private String lastName;
    private String course;
    private int yearLevel;
    private String crushName;
    private Course faveCourse;

    public Student(String StudentNumber, String firstName, char middleInitial, String lastName, String course, int yearLevel, String crushName, Course faveCourse){
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.course = course;
        this.yearLevel = yearLevel;
        this.crushName = crushName;
        this.faveCourse = faveCourse;
        this.StudentNumber = StudentNumber;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        StudentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    public Course getFaveCourse() {
        return faveCourse;
    }

    public void setFaveCourse(Course faveCourse) {
        this.faveCourse = faveCourse;
    }

    @Override
    public String toString() {
        return  String.format("%s\n%s\n%c\n%s\n%s\n%d\n",StudentNumber,firstName,middleInitial,lastName,course,yearLevel);
    }
}
