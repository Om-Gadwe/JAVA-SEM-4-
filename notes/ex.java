package notes;
/*
class ok{
    static int a = 10;
    void change(){
        a = 20;
    }
}
public class ex {
     public static void main(String[] args) {
        ok obj = new ok();
        System.out.println("Before change: " + obj.a);
        
        obj.a = 15; // Modifying the static variable directly through the object reference
        System.out.println("After direct modification: " + obj.a);
        obj.change();
        System.out.println("After change: " + obj.a);
    }
}
*/
class parent{
    final void display(){
        System.out.println("This is parent class");
    }
}
class child extends parent{
    /*
    void display(){ // can't override final method
        System.out.println("This is child class");
    }
    */
}
class chutiya{
    void display(){
        System.out.println("This is chutiya class");
    }
}
public class ex {
     public static void main(String[] args) {
        parent p = new parent();
        p.display();
        chutiya c = new chutiya();
        c.display();
    }
}
