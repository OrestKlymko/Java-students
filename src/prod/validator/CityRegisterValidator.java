package prod.validator;

import prod.domain.AnswerCityRegister;
import prod.domain.Person;
import prod.domain.StudentOrder;

public class CityRegisterValidator {
   private String hostName;
   private String login;
   private String password;

   private FakeCityRegisterChecker personChecker;

   public CityRegisterValidator(){
       personChecker = new FakeCityRegisterChecker();
   }
    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder){
       personChecker.checkPerson(studentOrder.getHusband());
        personChecker.checkPerson(studentOrder.getWife());
        personChecker.checkPerson(studentOrder.getChild());

        AnswerCityRegister answer = new AnswerCityRegister();
        answer.success = false;
        return answer;
    }
}
