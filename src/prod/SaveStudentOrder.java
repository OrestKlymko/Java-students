package prod;

import prod.domain.Adult;
import prod.domain.StudentOrder;
//import prod.project.studentorder.domain.*;

public class SaveStudentOrder {
    public static void main(String[] args) {
        buildStudentOrder();
        saveStudentOrder();
    }
    static void saveStudentOrder(){
        StudentOrder so = new StudentOrder();

    }
    static StudentOrder buildStudentOrder(){
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        so.setHusband(husband);
        String ans = husband.getPersonString();
        System.out.println(ans);
        return so;
    }

}

//package prod.project.studentorder;
//        import prod.project.studentorder.mail.MailSender;
//        import prod.project.studentorder.domain.*;
//        import prod.project.studentorder.validator.*;
//
//public class prod.project.studentorder.StudentOrderValidator
//{
//    public static void main(String[] args) {
//        checkAll();
//        System.out.println("Ok");
//    }
//
//    static void checkAll() {
//        while (true) {
//            StudentOrder so = readStudentOrder();
//            if (so == null) {
//                break;
//            }
//            AnswerCityRegister answerCityRegister = checkCityRegister(so);
//            if(!answerCityRegister.success){
//                continue;
//            }
//            AnswerWedding answerWedding = checkWedding(so);
//            AnswerChildren answerChildren = checkChildren(so);
//            AnswerStudent answerStudent = checkStudent(so);
//
//            sendMail(so);
//        }
//    }
//
//    static void sendMail(StudentOrder studentOrder) {
//        MailSender.sendMail(studentOrder);
//    }
//
//    static StudentOrder readStudentOrder(){
//        StudentOrder studentOrder = new StudentOrder();
//        return studentOrder;
//    }
//    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder){
//        return CityRegisterValidator.checkCityRegister(studentOrder);
//    }
//    static AnswerWedding checkWedding(StudentOrder studentOrder){
//        return WeddingValidator.checkWedding(studentOrder);
//    }
//
//    static AnswerChildren checkChildren(StudentOrder studentOrder){
//
//        return ChildrenValidator.checkChildren(studentOrder);
//    }
//
//    static AnswerStudent checkStudent(StudentOrder studentOrder){
//        return StudentValidator.checkStudent(studentOrder);
//    }
//}
