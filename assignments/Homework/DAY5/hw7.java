package assignments.Homework.DAY5;
class Parent {
    int x = 10;
    Parent() {
        System.out.println("Parent class constructor called");
    }
    void show() {
        System.out.println("Parent class show() method");
    }
}

class Child extends Parent {
    int x = 20;
    Child() {
        super();
        System.out.println("Child class constructor called");
    }
    void display() {
        System.out.println("Value of x using this: " + this.x);
        System.out.println("Value of x using super: " + super.x);
        super.show();
    }
}
public class hw7 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        /*
        class Demo {
            int a;

            Demo(int a) {
                this.a = a;
            }

            void show() {
                System.out.println("Value of a: " + this.a);
            }
        }

        public class hw7 {
            public static void main(String[] args) {
                Demo d = new Demo(50);
                d.show();
            }
        }
        */
    }
}