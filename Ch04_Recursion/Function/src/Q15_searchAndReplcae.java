public class Q15_searchAndReplcae {

    static String searchAndReplace(String str, char search, char replace) {
        if (str.length() == 0) {
            return "";
        }
        String oldResult = searchAndReplace(str.substring(1), search, replace);
        if (str.charAt(0) == search) {
            return replace + oldResult;

        } else {
            return str.charAt(0) + oldResult;
        }

    }

    public static void main(String[] args) {
        String result = searchAndReplace("hello", 'l', 'x');
        System.out.println(result);
    }

}
