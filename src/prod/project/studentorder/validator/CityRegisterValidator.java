package prod.project.studentorder.validator;

import prod.project.studentorder.domain.AnswerCityRegister;
import prod.project.studentorder.domain.StudentOrder;

public class CityRegisterValidator {
   private String hostName;
   private String login;
   private String password;
    static AnswerCityRegister checkCityRegister(StudentOrder studentOrder){
        AnswerCityRegister answer = new AnswerCityRegister();
        answer.success = false;
        return answer;
    }
}
