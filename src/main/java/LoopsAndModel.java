import enums.CourseName;
import model.Course;
import model.Student;

import java.sql.SQLOutput;
import java.util.List;

class LoopAndModel {
    public static void main(String[] args) {
        Course java = new Course(CourseName.JAVA, 15 );
        Course web = new Course(CourseName.WEB,10);

        System.out.println("This course is:" + java.getName());

        java.addStudent(new Student("Darja", "Ag.", "dasha@inbox.lv"));
        java.addStudent(new Student("Nikolajs", "Gr,", "nik@gmai.com"));
        java.addStudent(new Student("Natalja", "NoName", "natali@mail.ru"));
        java.addStudent(new Student("Kara", "Ko", "ko@ko.ko"));
        java.addStudent(new Student("Jurijs", "Te", "jurijs@te.lv"));


//        System.out.println(java.getStudents().size());
//        System.out.println(java.getStudents().get(1).getFirstName());

        List<Student> students = java.getStudents();

        //FOR
        for (int i = 0; i < students.size(); i++) { //i++ -> i = i + 1
            System.out.println(students.get(i).getFullName());
        }
        System.out.println("__________________________________");

        //FOREACH
        for (Student s : students) {
            //System.out.println(s.getFullName());
            if (s.getFirstName().startsWith("N")) {
                //true
                System.out.println(s.getFullName());
            } else {
                //false
                System.out.println("Thin name is not starting from 'N'");
            }

            //statement ? true : false
            System.out.println(s.getFirstName().startsWith("N") ? s.getFirstName() : "This name is not starting from 'N'");
        }

        System.out.println("_____________________________________");

        int  i = 0;
        while  (i < 3){
            System.out.println(students.get(i).getFullName());
            i++;
        }

//        boolean isNatalyFound = false;
//        while (!isNatalyFound) {   //!true = false    !false = true
//            for (Student s : students) {
//                if (s.getFirstName().equals("Natalja")) {
//                    System.out.println(s.getFullName());
//                    break;
//                }
//            }
//        }
    }
}
