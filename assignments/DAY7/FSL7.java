package assignments.DAY7;
/*
// Example of method overriding in Java
class animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class dog extends animal {
    void eat() {
        System.out.println("Dog is eating");
    }
}
class cat extends animal {
    void eat() {
        System.out.println("Cat is eating");
    }
}
public class FSL8 {
    public static void main(String[] args) {
        animal a1 = new dog();
        animal a2 = new cat();
        a1.eat(); // Output: Dog is eating
        a2.eat(); // Output: Cat is eating
    }
}
*/


/* 

// Example of arraylist in Java
import java.util.ArrayList;
public class FSL8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Java");
        list.add("Programming");
        System.out.println("Original List: " + list);
        // Remove the element at index 2
        String removedElement = list.remove(2);
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Updated List: " + list);
        System.out.println("Size of the list: " + list.size());
        System.out.println("contain hello " + list.contains("Hello"));
    }
    
}
*/


/*
// Example of garbage collection in Java 
class FSL8 {
    public static void main(String[] args) {
        FSL8 obj = new FSL8();
        obj = null; // Nullifying the reference to the object
        System.gc(); // Suggesting the JVM to perform garbage collection
    }
}
*/


/*
// Example of array in Java 
public class FSL8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");  
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int num : arr) {
            System.out.println(num);
        }   
    }
}
*/


/*
// Example of vector in Java
import java.util.Vector;
public class FSL8 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        System.out.println("Vector: " + vector);
        vector.remove(2); // Removing element at index 2
        System.out.println("Updated Vector: " + vector);
        System.out.println("Size of the vector: " + vector.size());
        System.out.println("element at index 1: " + vector.get(1));
    }
}
*/


/*
// Example of string in Java
public class FSL8 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        System.out.println("Length of the string: " + str.length());
        System.out.println("TRIMMED STRING: " + str.trim());
        System .out.println("Lowercase String: " + str.toLowerCase());
        System.out.println("Uppercase String: " + str.toUpperCase());
        System.out.println("Substring (0, 5): " + str.substring(0, 5));
        System.out.println("replace 'o' with 'x': " + str.replace('o', 'x'));
    }
}
*/


/*
// Example of string buffer in Java
public class FSL8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("After Append: " + sb);

        sb.insert(6, "Java ");
        System.out.println("After Insert: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("After Replace: " + sb);

        sb.delete(2, 5);
        System.out.println("After Delete: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}
*/


/*
// Example of string tokenizer in Java
import java.util.StringTokenizer;
public class FSL8 {
    public static void main(String[] args) {
        String str = "Hello, World! Welcome to Java programming.";
        StringTokenizer st = new StringTokenizer(str, " ,.!");

        System.out.println("Tokens:");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
*/