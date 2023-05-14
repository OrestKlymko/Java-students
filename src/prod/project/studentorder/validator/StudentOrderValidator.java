package prod.project.studentorder.validator;

import prod.project.studentorder.StudentValidator;

public class StudentOrderValidator
{
    public static void main(String[] args) {
       checkAll();
    }

    static void checkAll() {
        while (true) {
            StudentOrder so = readStudentOrder();
            if (so == null) {
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
         MailSender.sendMail(studentOrder);
    }

    static StudentOrder readStudentOrder(){
        StudentOrder studentOrder = new StudentOrder();
        return studentOrder;
    }
    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder){
       return CityRegisterValidator.checkCityRegister(studentOrder);
    }
    static AnswerWedding checkWedding(StudentOrder studentOrder){
        return WeddingValidator.checkWedding(studentOrder);
    }

    static AnswerChildren checkChildren(StudentOrder studentOrder){

        return ChildrenValidator.checkChildren(studentOrder);
    }

    static AnswerStudent checkStudent(StudentOrder studentOrder){
       return StudentValidator.checkStudent(studentOrder);
    }
}
