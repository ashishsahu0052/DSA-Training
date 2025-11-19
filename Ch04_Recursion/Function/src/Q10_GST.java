public class Q10_GST {

    static int[] getPriceWithGST(int[] prices, int index) {
        // Gst = 18%
        // new price = price + Gst
        // for (int i = 0; i < prices.length; i++) {
        // prices[i] += (int) (prices[i] * 0.18);
        // }
        // return prices;

        if (index == prices.length) {
            int gst[] = new int[prices.length];
            return gst;
        }
        int[] gst = getPriceWithGST(prices, index + 1);
        gst[index] = prices[index] + (int) (prices[index] * 0.18);
        return gst;

    }

    public static void main(String[] args) {
        int prices[] = { 100, 200, 430, 999, 777 };// price with no tax
        int newprices[] = getPriceWithGST(prices, 0);
        for (int i : newprices)
            System.out.print(" " + i);
    }
}
