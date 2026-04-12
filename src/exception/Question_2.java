package exception;

import customException.customOddnumberException;

public class Question_2 {
    public String checkOdd(int a) throws customOddnumberException {
        if(a%2!=0){
            throw new customOddnumberException("Not an ODD");
        }
        return "even";
    }
}
