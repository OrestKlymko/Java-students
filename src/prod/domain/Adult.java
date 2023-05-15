package prod.domain;
import java.time.LocalDate;

public class Adult extends Person{
    private String passportSeria;
    private String passportNumber;
    private LocalDate issueDate;
    private String issueDepartment;
    private String university;
    private String studentID;

    public Adult(String surName, String givenName, LocalDate dateOfBirth, String patronymic, Adress adress, String passportSeria, String passportNumber, LocalDate issueDate, String issueDepartment, String university, String studentID) {
        super(surName, givenName, dateOfBirth, patronymic, adress);
        this.passportSeria = passportSeria;
        this.passportNumber = passportNumber;
        this.issueDate = issueDate;
        this.issueDepartment = issueDepartment;
        this.university = university;
        this.studentID = studentID;
    }

    public Adult(String surName, String givenName, LocalDate dateOfBirth, String patronymic, Adress adress) {
        super(surName, givenName, dateOfBirth, patronymic, adress);
    }

    public String getPersonString(){
        return  surName+" "+givenName+" "+passportNumber;
    }
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }



    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
}
