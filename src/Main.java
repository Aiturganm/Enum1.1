public class Main {
    public static void main(String[] args) {
        Region[] region = Region.values();
        for (Region region1 : region) {
            System.out.println(region1);
            System.out.println(region1.description);
        }
    }
}