package chapter3;

// This program will not compile
class ScopeErr {
    public static void main(String args[]) {
        int bar = 1;
//        {              // creates a new scope
//            int bar = 2; // Compile time error -- bar already defined!
//        }

        int a = 300;
        byte b = (byte) a;
        System.out.println(b);
        System.out.println(Byte.MAX_VALUE);
    }
}
