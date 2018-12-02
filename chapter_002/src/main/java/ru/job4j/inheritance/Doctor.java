package ru.job4j.inheritance;

public class Doctor extends Profession {
    void treat(Patient patient) {
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Patient patient = new Patient("name");

        doctor.treat(patient);
    }
}
