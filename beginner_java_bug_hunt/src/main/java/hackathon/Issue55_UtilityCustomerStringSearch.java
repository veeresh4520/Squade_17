public class Issue55_UtilityCustomerStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A17", "B17", "C17"};
        String target = new String("B17");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
