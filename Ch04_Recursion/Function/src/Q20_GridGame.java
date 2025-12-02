public class Q20_GridGame {
    static void gridGame(int startRow, int startCol, int endRow, int endCol, String result) {

        // neagative base cases
        if (startRow > endRow || startCol > endCol) {

            return;
        }
        if (startRow == endRow && startCol == endCol) {
            System.out.println(result);
        }
        // to move downward
        gridGame(startRow + 1, startCol, endRow, endCol, result + "D");
        // to move rigth
        gridGame(startRow, startCol + 1, endRow, endCol, result + "R");

    }

    public static void main(String[] args) {
        gridGame(0, 0, 2, 2, "");
    }
}

// System.out.println(result);