package chapter7;

// Demonstrate an inner class.
class Outer {
    int outer_x = 100;
    Inner inner = new Inner();

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // this is an innner class
    class Inner {
        int y = 10; // y is local to Inner
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }

//    void showy() {
//        System.out.println(y); // error, y not known here!
//    }
}

class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
        System.out.println(outer.inner.getClass());
    }
}
