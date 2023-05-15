package prod;

import prod.domain.*;
import prod.mail.MailSender;
import prod.validator.*;


public class StudentOrderValidator {
    private CityRegisterValidator cityRegisterValidator;
    private WeddingValidator weddingValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterValidator = new CityRegisterValidator();
        weddingValidator = new WeddingValidator();
        childrenValidator = new ChildrenValidator();
        studentValidator = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    public void checkAll() {
        StudentOrder[] so = readStudentOrders();
        for (int i = 0; i < so.length; i++) {
            checkOneOrder(so[i]);
        }

    }

    public void checkOneOrder(StudentOrder so){

        AnswerCityRegister answerCityRegister = checkCityRegister(so);

        AnswerWedding answerWedding = checkWedding(so);
        AnswerChildren answerChildren = checkChildren(so);
        AnswerStudent answerStudent = checkStudent(so);

        sendMail(so);
    }
    static void sendMail(StudentOrder studentOrder) {
        ;
    }

    static StudentOrder[] readStudentOrders(){
        StudentOrder[] soArray = new StudentOrder[3];

        for (int i = 0; i < soArray.length; i++) {
            soArray[i]=SaveStudentOrder.buildStudentOrder(i);
        }
        return soArray;
    }
    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder){
        return cityRegisterValidator.checkCityRegister(studentOrder);
    }
    public AnswerWedding checkWedding(StudentOrder studentOrder){
        return weddingValidator.checkWedding(studentOrder);
    }

    public AnswerChildren checkChildren(StudentOrder studentOrder){

        return childrenValidator.checkChildren(studentOrder);
    }

    public AnswerStudent checkStudent(StudentOrder studentOrder){
        return studentValidator.checkStudent(studentOrder);
    }
}
