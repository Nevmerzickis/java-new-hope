import model.Student;

public class WorkWithObjects {
    public static void main(String[] args) {
        Student ilja = new Student();
        ilja.setFirstName("Ilja");
        ilja.setLastName("Nev.");
        ilja.setEmail("ilja@ibiza.lv");
        ilja.setAge(36);

        Student jelena = new Student();
        jelena.setFirstName("Jelena");
        jelena.setLastName("Nev.");
        jelena.setEmail("jelena@superwoman.lv");
        jelena.setAge(35);

        Student lena = new Student("Helena","Ne","hel@ena.lv");
        lena.setAge(18);
        System.out.println(ilja.getFirstName() + " " + ilja.getLastName());
        System.out.println(jelena.getFirstName() + " " + jelena.getLastName());

        ilja.printFullInfo();
        jelena.printFullInfo();
        lena.printFullInfo();

    }
}
