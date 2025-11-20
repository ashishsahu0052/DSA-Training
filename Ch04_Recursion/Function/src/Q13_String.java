public class Q13_String {
    public static void main(String[] args) {
        String s = "ashish";
        // System.out.println(s[0]); not possible

        char b[] = s.toCharArray();
        System.out.println(b[2]);
        b[2] = 'd';
        System.out.println(s);
        System.out.println(b);

        System.out.println(s.substring(1)); // from 1 to last
        System.out.println(s.substring(2, 5)); // 2 to 5-1/
        // trim() - use to remove leading and trailojng space
        // .toupperCase - upper the characters
        // split() - return array
        // s.length()
        // Characte.isDigit() == isLetter
    }
}
