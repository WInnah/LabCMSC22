import java.io.Serializable;

/**
 * Created by Winnah Gwen Acal on 11/3/2016.
 */
public class Course implements Serializable{
    private String courseCode;
    private String courseDescription;

    public Course(String courseCode, String courseDescription) {
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
    }
}
