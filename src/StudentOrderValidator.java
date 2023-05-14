public class StudentOrderValidator
{
    public static void main(String[] args) {
       checkAll();
    }

    static void checkAll(){
       StudentOrder so = readStudentOrder();
       AnswerCityRegister answerCityRegister = checkCityRegister(so);
       AnswerWedding answerWedding = checkWedding(so);
       AnswerChildren answerChildren =  checkChildren(so);
       AnswerStudent answerStudent =  checkStudent(so);

        sendMail(so);
    }

     static void sendMail(StudentOrder so) {

    }

    static StudentOrder readStudentOrder(){
        StudentOrder studentOrder = new StudentOrder();
        return studentOrder;
    }
    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder){
        AnswerCityRegister answer = new AnswerCityRegister();
        return answer;
    }
    static AnswerWedding checkWedding(StudentOrder studentOrder){
        AnswerWedding answer = new AnswerWedding();
        return answer;
    }

    static AnswerChildren checkChildren(StudentOrder studentOrder){
        AnswerChildren answer = new AnswerChildren();
        return answer;
    }

    static AnswerStudent checkStudent(StudentOrder studentOrder){
        AnswerStudent answer = new AnswerStudent();
        return answer;
    }
}
