public class Q3_PrintTable {
    /*
     * static void printTable(int num, int range) {
     * if (range == 0) {
     * return;
     * }
     * printTable(5, range - 1);
     * System.out.println(num + " X " + range + " = " + num * range);
     * 
     * }
     */
    static void printTable(int num, int range, String result) {
        if (range == 0) {
            System.out.println(result);
            return;
        }
        String expression = num + " X " + range + " = " + num * range;
        printTable(num, range - 1, expression + "\n" + result);
    }

    public static void main(String[] args) {
        printTable(5, 10, "");
    }

}

// resursion with void
// Atoi - alphabet to integer a = "7420" to b 7420 play on ascii values
//
