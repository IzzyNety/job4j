package ru.job4j.inheritance;

public class Teacher extends Profession {
    void teach(Student student) {

    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        teacher.teach(student);
    }
}
