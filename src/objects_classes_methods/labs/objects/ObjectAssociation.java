package objects_classes_methods.labs.objects;


// Please demonstrate Object association by creating at least two POJOs and a Controller
// class. The Controller class will contain the main() method. In the main() create an
// object of each POJO you just created and associate the two together. (This is easier
// than it sounds. Refer to the Object Association documentation if you're not sure.)

public class ObjectAssociation {

    public static void main(String[] args) {
        Student student = new Student("Katie Adams");
        Course course = new Course("Java Fundamentals");

        System.out.println("The student named " + student.name + " is enrolled in the "
                + course.courseName + " class.");
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

class Course {
    String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }
}
