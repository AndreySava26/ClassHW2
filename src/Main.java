public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.BmiService(98, 1.87);

        System.out.println(index);


    }
}