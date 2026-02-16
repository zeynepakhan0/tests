package calc_;

public enum CalculatorError {
    NegativeNumberError, ObjectTypeError;

    @Override
    public String toString() {
        String word="";
       if (this == NegativeNumberError) {
           word= "Negative Number";
       }
       else if (this == ObjectTypeError) {
           word= "Object Type";
       }
       else{
           throw new IllegalArgumentException("Unknown Error");
       }
       return word;
    }
}
