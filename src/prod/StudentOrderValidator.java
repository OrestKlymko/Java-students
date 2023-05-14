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
        while (true) {
            StudentOrder so = readStudentOrder();
            if (so == null) {
                System.out.println("break");
                break;
            }
            AnswerCityRegister answerCityRegister = checkCityRegister(so);
            if(!answerCityRegister.success){
                continue;
            }
            AnswerWedding answerWedding = checkWedding(so);
            AnswerChildren answerChildren = checkChildren(so);
            AnswerStudent answerStudent = checkStudent(so);

            sendMail(so);
        }
    }

    static void sendMail(StudentOrder studentOrder) {
        ;
    }

    static StudentOrder readStudentOrder(){
        StudentOrder studentOrder = new StudentOrder();
        return studentOrder;
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
