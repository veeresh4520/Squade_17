public class Issue56_UtilityCustomerRowTotals {
    public static void main(String[] args) {
        int[][] values = new int[][] {{5, 8, 7}, {7, 5, 8}};
        for (int r = 1; r < values.length; r++) {
            int total = values[r][0];
            for (int c = 0; c < values[r].length - 1; c++) total += values[r][c] * 2;
            System.out.println("Row " + r + "=" + total);
        }
    }
}
