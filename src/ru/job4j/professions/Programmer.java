package ru.job4j.professions;

public class Programmer extends Engineer {
    private String typeOfProgram;

    public String getTypeOfProgram() {
        return typeOfProgram;
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
