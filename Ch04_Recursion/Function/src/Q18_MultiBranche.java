public class Q18_MultiBranche {
    static void tree(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println("pre call " + num);
        tree(num - 1);
        System.out.println("between call " + num);
        tree(num - 2);
        System.out.println("post call " + num);

    }

    public static void main(String[] args) {
        tree(5);
    }

}
