package ru.job4j.professions;

public class Surgeon extends Doctor {
    @Override
    public String getDiagnosis() {
        return super.getDiagnosis();
    }

    @Override
    public String heal() {
        return getDiagnosis();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public String getEducation() {
        return super.getEducation();
    }

    @Override
    public int getBirthday() {
        return super.getBirthday();
    }

    public void makeSurgeon(Patient patient) {

    }
}
