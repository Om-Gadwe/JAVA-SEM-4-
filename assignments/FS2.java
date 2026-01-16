
package assignments;
/* 
public class FS2 {
    public static void main(String[] args){
        char[] om = {'o','m','G','A','D','W','E'};
        System.out.println(om);
        for(int i = om.length-1 ; i>=0 ; i--){
            System.out.print(om[i]);
        }
    }

}
    */
public class FS2{
    public static void main(String[] args){
        String om = "omGADWE";
        System.out.print("Reversed: ");
        for (int i = om.length() - 1; i >= 0; i--) {
            System.out.print(om.charAt(i));
        }
    }
}

