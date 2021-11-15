package ru.job4j.professions;

public class Builder extends Engineer {

    private int numberOfObjects;
    private String buildingType;

    public String getBuildingType() {
        return buildingType;
    }
    public int getNumberOfObjects() {
        return numberOfObjects;
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

    public void buildBuilding() {
        numberOfObjects++;
    }
}
