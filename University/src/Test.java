
public class Test {

    public static void main(String[] args) {
        Department department1 = new Department();
        department1.name = "Software Engineering";

        Professor professor1 = new Professor();
        professor1.name = "Ahmet Arslan";

        Course course1 = new Course();
        course1.name = "Int. to Software Engineering";

        Student student1 = new Student();
        student1.name = "Akin Kaldiroglu";

        // Head of Software Engineering department is Ahmet Arslan and consequently his department is Software Engineering.
        department1.head = professor1;
        professor1.department = department1;

        // Department of Int. to Software Engineering course is Software Engineering and consequently the course
        // Int. to Software Engineering belongs to Software Engineering department.
        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] = course1;

        course1.teacher = professor1;
        professor1.coursesGiven = new Course[5];
        professor1.coursesGiven[0] = course1;

        professor1.advisee = new Student[10];
        professor1.advisee[0] = student1;
        student1.advisor = professor1;

        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;

        course1.students = new Student[100];
        course1.students[0] = student1;

        System.out.println("Name of student student1's first course is " + student1.coursesTaken[0].name);
        System.out.println("Name of student student1's first course's professor is " + student1.coursesTaken[0].teacher.name);
        System.out.println("Name of student student1's first course's professor's department is " + student1.coursesTaken[0].teacher.department.name);

        Department depertment2 = new Department();
        depertment2.name = "Philosopy";

        Professor professor2 = new Professor();
        professor2.name = "Ali veli";
        professor2.department = depertment2;
        Professor professor3 = new Professor();
        professor3.name = "Ayse Fatma";
        professor3.department = depertment2;


        Student student2 = new Student();
        student1.name = "Akin ";
        Student student3 = new Student();
        student1.name = " Kaldiroglu";
        Student student4 = new Student();
        student1.name = "Ak Kaldi";


        Course course2 = new Course();
        course1.name = "Ethics";
        Course course3 = new Course();
        course1.name = "Ontology";


        course2.students = new Student[2];
        course2.students[0] = student2;
        course2.teacher = professor2;


    }
}
