package assignments.DAY8;
//Checked, Unchecked Exceptions, Errors, try - catch, finally, throw, throws, user defined exceptions
/* 
TRY - CATCH :-
public class FL8 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int result = num1/num2;
            System.out.println("Result : "+ result);
        } catch ( ArithmeticException e ) {
            System.out.println("Error : cannot divide by zero. ");
            System.out.println("Exception Message : "+ e.getMessage());
        }
        System.out.println("Program continues after Exeption.");
    }
}
MULTIPLE TRY CATCH :-
public class FL8 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch ( NullPointerException e ) {
            System.out.println("Error  : null poitner expetion! Object is NULL. ");
        }
        catch (Exception e){
            System.out.println("Some other error occured. ");
        }
        System.out.println("Program continues after Exeption.");
    }
}
*/