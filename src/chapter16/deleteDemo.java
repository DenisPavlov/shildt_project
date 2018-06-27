package chapter16;

// Demonstrate delete() and deleteCharAt()
class deleteDemo {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("This is a test.");

        sb.delete(4, 7);
        System.out.println("before delete - " + sb.capacity());
        System.out.println("After delete: " + sb);
        System.out.println("after delete - " + sb.capacity());

        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb);
    }
}
