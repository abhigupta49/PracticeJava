package exception;

import customException.CustomArithmeticException;

public class Question_1 {

    public int divideNum(int a, int b) throws CustomArithmeticException {
        if(b==0){
            throw new CustomArithmeticException("Cannot divide by zero");
        }

        return a/b;
    }


}
