package ru.job4j.professions;

public class Doctor extends Profession {
    private String diagnosis;

    public String getDiagnosis() {
        return diagnosis;
    }

    public String heal() {
        return diagnosis;
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
}
