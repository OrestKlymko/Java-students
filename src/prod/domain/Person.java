package prod.domain;

import java.time.LocalDate;

public abstract class Person {
    protected String surName;
    protected String givenName;
    private LocalDate dateOfBirth;
    private String patronymic;

    public Person(String surName, String givenName, LocalDate dateOfBirth, String patronymic, Adress adress) {
        this.surName = surName;
        this.givenName = givenName;
        this.dateOfBirth = dateOfBirth;
        this.patronymic = patronymic;
        this.adress = adress;
    }

    private Adress adress;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }



}


