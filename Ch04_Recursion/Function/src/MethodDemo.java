public class MethodDemo {
    // static method - define
    static void show() {
        System.out.println(" i am a static method");
    }// function end - pop from stack

    void display() {
        System.out.println("non stataic finction");
    }

    public static void main(String[] args) {
        show(); // calling function|
        // when you call a fumction it push in the stack alogn with local variable

        MethodDemo obj = new MethodDemo();
        obj.display();
    }
}
