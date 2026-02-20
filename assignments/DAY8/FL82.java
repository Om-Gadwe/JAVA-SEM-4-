package assignments.DAY8;
// Use a custom message with chained exception
/*
public class FL82 {
    public static void main(String[] args){
        try{
            // Code that might throw an exception
            int[] n = new int[5];
            int divisor = 0;
            for (int i = 0; i < n.length; i++) {
                int res = n[i] / divisor;
                System.out.println(res);
            }
        }
        catch (ArithmeticException e){
            // Creating a new exception with
            // the original as the cause
            throw new RuntimeException("Error: Division by zero occurred", e);
        }
    }
}
*/


// Checking Method Arguments
/*
class FL82 {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int getLength(String s) {
        if (s == null)
            throw new IllegalArgumentException("The argument cannot be null");
        return s.length();
    }
}
*/



// Checking Method Arguments
/* 
class FL82 {
    public static void main(String[] args) {
 
        String s = null;
        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
    public static int getLength(String s) {

        if (s == null)
            throw new IllegalArgumentException("The argument cannot be null");

        return s.length();
    }
}
*/


// Superclass without exception declaration
class SuperClass {

    void method() {
        System.out.println("SuperClass method executed");
    }
}


/* 
// Subclass declaring an unchecked exception
class SubClass extends SuperClass {

    @Override
    void method() throws ArithmeticException {
        System.out.println("SubClass method executed");
        throw new ArithmeticException("Exception in SubClass");
    }

    public static void main(String[] args) {

        SuperClass s = new SubClass();

        try {
            s.method();
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
*/

//USER DEFINED EXCEPTION
// Custom Checked Exception
/*
class InvalidAgeException extends Exception {
    public InvalidAgeException(String m) {
        super(m);   // message
    }
}
// Using the Custom Exception
public class FL82 {
    public static void validate(int age)
            throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age: " + age);
    }
    public static void main(String[] args) {
        try {
            validate(12);
        }
        catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
*/