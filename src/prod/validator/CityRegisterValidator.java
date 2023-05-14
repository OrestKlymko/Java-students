package prod.validator;

import prod.domain.AnswerCityRegister;
import prod.domain.StudentOrder;

public class CityRegisterValidator {
   private String hostName;
   private String login;
   private String password;
    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder){
        AnswerCityRegister answer = new AnswerCityRegister();
        answer.success = false;
        return answer;
    }
}
