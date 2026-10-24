public class Issue53_UtilityCustomerSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {5, 8, 7, 117};
        int target = 117;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
