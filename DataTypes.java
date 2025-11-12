public class DataTypes {
    int h; // instance variable - object creaaetion time initq
    static int hw; // class variable - class lpad time imit

    public static void main(String[] args) {
        System.out.println(hw);
        int nn; // local value has to be initialized before use
        DataTypes dt = new DataTypes();
        System.out.println(dt.h);

        char g1 = 'a';// UTF 
        char g2 = ' ' // it can take word of any language

    }
}
